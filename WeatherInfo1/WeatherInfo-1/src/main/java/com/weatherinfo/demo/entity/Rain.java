package com.weatherinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
	
	@JsonProperty("1h")
	float _1h;
	@JsonProperty("3h")
	float _3h;
	
	public Rain() {}

	public Rain(float _1h, float _3h) {
		super();
		this._1h = _1h;
		this._3h = _3h;
	}
	
	@JsonProperty("1h")
	public float get_1h() {
		return _1h;
	}

	@JsonProperty("1h")
	public void set_1h(float _1h) {
		this._1h = _1h;
	}

	@JsonProperty("3h")
	public float get_3h() {
		return _3h;
	}

	@JsonProperty("3h")
	public void set_3h(float _3h) {
		this._3h = _3h;
	}
	
}
