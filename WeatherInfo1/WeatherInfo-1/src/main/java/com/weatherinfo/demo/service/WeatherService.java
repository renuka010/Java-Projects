package com.weatherinfo.demo.service;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.weatherinfo.demo.dto.WeatherDataDto;
import com.weatherinfo.demo.dto.WeatherDto;
import com.weatherinfo.demo.entity.Coords;
import com.weatherinfo.demo.entity.LocationDetails;
import com.weatherinfo.demo.entity.Weather;
import com.weatherinfo.demo.entity.WeatherDetails;
import com.weatherinfo.demo.entity.Weatherdata;
import com.weatherinfo.demo.repo.CoordsRepo;
import com.weatherinfo.demo.repo.WeatherdataRepo;

@Service
public class WeatherService {
	
	@Autowired
	private CoordsRepo coordsRepo;
	
	@Autowired
	private WeatherdataRepo weatherdataRepo;

	private String URI="https://api.openweathermap.org/data/2.5/weather?";
	private String API_ID="YOURAPIKEY";
	private String URI2="http://api.openweathermap.org/geo/1.0/zip?zip=";
	
	public WeatherDataDto getWeather(int pincode) throws JsonProcessingException {
		
		float lat, lon;
		LocalDate date=LocalDate.now();
		RestTemplate restTemplate=new RestTemplate();
		
		Coords coord=coordsRepo.findByPincode(pincode);
		if(coord==null) {
			//API call to get coordinates - Open Weather Geocoding API
			LocationDetails locdata=restTemplate.getForObject(getURI2(pincode), LocationDetails.class);
			lat=locdata.getLat();
			lon=locdata.getLon();
			
			//store lat and lon for pincode in database
			coord=new Coords();
			coord.setLat(lat);
			coord.setLon(lon);
			coord.setPincode(pincode);
			coordsRepo.save(coord);
		}
		else {
			//getting data if already present in database
			lat=coord.getLat();
			lon=coord.getLon();
		}
		
		Weatherdata wdata=weatherdataRepo.findByPincodeAndDate(pincode,date);
		WeatherDataDto weatherDataDto;
		if(wdata==null) {
			//API call to get Weather Details - Open Weather API-Current
			WeatherDetails weatherDetails =restTemplate.getForObject(getURI(lat,lon), WeatherDetails.class);
			
			//separating the data needed to revert
			weatherDataDto=new WeatherDataDto();
			weatherDataDto.setClouds(weatherDetails.getClouds());
			weatherDataDto.setMain(weatherDetails.getMain());
			weatherDataDto.setRain(weatherDetails.getRain());
			weatherDataDto.setSnow(weatherDetails.getSnow());
			weatherDataDto.setVisibility(weatherDetails.getVisibility());
			WeatherDto[] wdto=new WeatherDto[weatherDetails.getWeather().length];
			int i=0;
			for(Weather w:weatherDetails.getWeather()) {
				wdto[i]=new WeatherDto();
				wdto[i].setWeather(w.getMain());
				wdto[i].setDesc(w.getDescription());
				i++;
			}
			weatherDataDto.setWeather(wdto);
			weatherDataDto.setWind(weatherDetails.getWind());
			
			//weather details to store in database
			Weatherdata weatherdata=new Weatherdata();
			weatherdata.setPincode(pincode);
			weatherdata.setData(new ObjectMapper().writeValueAsString(weatherDataDto));
			weatherdata.setDate(date);
			weatherdataRepo.save(weatherdata);
		}
		else {
			//Retrieving Weather details for the day if present in database
			Gson gson=new Gson();
			weatherDataDto=gson.fromJson(wdata.getData(), WeatherDataDto.class);
		}
		return weatherDataDto;
	}

	//URI for Geocoding API
	private String getURI(float lat, float lon) {
		return String.format(URI.concat("lat=%f").concat("&lon=%f").concat("&units=metric&appid=%s"), lat, lon, API_ID);
	}

	//URI for OpenWeather Current Weather API
	private String getURI2(int pincode) {
		return String.format(URI2.concat("%d,IN").concat("&appid=%s"), pincode, API_ID);
	}

}
