package com.weatherinfo.demo.entity;

import java.util.HashMap;
import java.util.Map;

public class WeatherDetails {
	Coordinates coord;
	Weather[] weather;
	String base;
	MainObject main;
	int visibility;
	Wind wind;
	Rain rain;
	Snow snow;
	Clouds clouds;
	Map<String, Object> map=new HashMap<>();
	
	public WeatherDetails() {}

	public WeatherDetails(Coordinates coord, Weather[] weather, String base, MainObject main, int visibility, Wind wind,
			Rain rain, Snow snow, Clouds clouds, Map<String, Object> map) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.rain = rain;
		this.snow = snow;
		this.clouds = clouds;
		this.map = map;
	}

	public Coordinates getCoord() {
		return coord;
	}

	public void setCoord(Coordinates coord) {
		this.coord = coord;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
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

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	
		
}
