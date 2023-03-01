package com.weatherinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {
	@JsonProperty("1h")
	float oneh;
	@JsonProperty("3h")
	float threeh;
	
	public Snow() {}

	public Snow(float oneh, float threeh) {
		super();
		this.oneh = oneh;
		this.threeh = threeh;
	}
	
	@JsonProperty("1h")
	public float getOneh() {
		return oneh;
	}

	@JsonProperty("1h")
	public void setOneh(float oneh) {
		this.oneh = oneh;
	}

	@JsonProperty("3h")
	public float getThreeh() {
		return threeh;
	}

	@JsonProperty("3h")
	public void setThreeh(float threeh) {
		this.threeh = threeh;
	}
	
}
