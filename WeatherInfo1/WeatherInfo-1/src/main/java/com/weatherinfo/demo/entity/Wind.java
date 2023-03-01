package com.weatherinfo.demo.entity;

public class Wind {
	float speed, deg, gust;
	
	public Wind() {}

	public Wind(float speed, float deg, float gust) {
		super();
		this.speed = speed;
		this.deg = deg;
		this.gust = gust;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getDeg() {
		return deg;
	}

	public void setDeg(float deg) {
		this.deg = deg;
	}

	public float getGust() {
		return gust;
	}

	public void setGust(float gust) {
		this.gust = gust;
	}
	
}
