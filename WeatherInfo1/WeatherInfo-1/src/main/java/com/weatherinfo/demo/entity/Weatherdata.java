package com.weatherinfo.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Weatherdata {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	int pincode;
	LocalDate date;
	@Column(columnDefinition = "JSON")
	String data;
	
	public Weatherdata() {}

	public Weatherdata(Long id, int pincode, LocalDate date, String data) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.date = date;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
