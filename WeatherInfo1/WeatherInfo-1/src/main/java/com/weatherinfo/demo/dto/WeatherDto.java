package com.weatherinfo.demo.dto;

public class WeatherDto {
	String weather, desc;
	
	public WeatherDto(){}

	public WeatherDto(String weather, String desc) {
		super();
		this.weather = weather;
		this.desc = desc;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	};
	
}
