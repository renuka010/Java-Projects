package com.weatherinfo.demo.entity;


public class MainObject {
	float temp, feels_like, temp_min, temp_max;
	int pressure, humidity, sea_level, grnd_level;
	
	public MainObject() {}

	public MainObject(float temp, float feels_like, float temp_min, float temp_max, int pressure, int humidity,
			int sea_level, int grnd_level) {
		super();
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(float feels_like) {
		this.feels_like = feels_like;
	}

	public float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}

	public float getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getSea_level() {
		return sea_level;
	}

	public void setSea_level(int sea_level) {
		this.sea_level = sea_level;
	}

	public int getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(int grnd_level) {
		this.grnd_level = grnd_level;
	}
	
}
