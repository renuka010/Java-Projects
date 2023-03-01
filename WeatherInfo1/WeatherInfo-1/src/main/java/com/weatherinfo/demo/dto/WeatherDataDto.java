package com.weatherinfo.demo.dto;

import com.weatherinfo.demo.entity.Clouds;
import com.weatherinfo.demo.entity.MainObject;
import com.weatherinfo.demo.entity.Rain;
import com.weatherinfo.demo.entity.Snow;
import com.weatherinfo.demo.entity.Wind;

public class WeatherDataDto {
	WeatherDto weather[];
	MainObject main;
	int visibility;
	Wind wind;
	Rain rain;
	Snow snow;
	Clouds clouds;
	
	public WeatherDataDto(){}

	public WeatherDataDto(WeatherDto[] weather, MainObject main, int visibility, Wind wind, Rain rain, Snow snow,
			Clouds clouds) {
		super();
		this.weather = weather;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.rain = rain;
		this.snow = snow;
		this.clouds = clouds;
	}

	public WeatherDto[] getWeather() {
		return weather;
	}

	public void setWeather(WeatherDto[] weather) {
		this.weather = weather;
	}

	public MainObject getMain() {
		return main;
	}

	public void setMain(MainObject main) {
		this.main = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Snow getSnow() {
		return snow;
	}

	public void setSnow(Snow snow) {
		this.snow = snow;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	
}
