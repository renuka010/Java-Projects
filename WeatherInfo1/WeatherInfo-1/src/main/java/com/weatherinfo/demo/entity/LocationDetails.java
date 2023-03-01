package com.weatherinfo.demo.entity;

public class LocationDetails {
	String zip, name;
	float lat, lon;
	String country;
	
	public LocationDetails() {}

	public LocationDetails(String zip, String name, float lat, float lon, String country) {
		super();
		this.zip = zip;
		this.name = name;
		this.lat = lat;
		this.lon = lon;
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLon() {
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
