package com.weatherinfo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.weatherinfo.demo.dto.WeatherDataDto;
import com.weatherinfo.demo.service.WeatherService;

@RestController
public class HomeController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/weather")
	public ResponseEntity<WeatherDataDto> getWeather(@RequestParam int pincode) throws JsonProcessingException {
		WeatherDataDto dto=weatherService.getWeather(pincode);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
}
