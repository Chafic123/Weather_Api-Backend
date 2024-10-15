package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.pojo.WeatherResponse;
import com.weather.service.Weatherservice;

@RestController
public class WeatherController {

	@Autowired
	Weatherservice weatherservice;

	@GetMapping("/weather")
	public ResponseEntity<WeatherResponse> getWeatherData(@RequestParam double lat, @RequestParam double lon,
			@RequestParam String appId) {
		WeatherResponse response = new WeatherResponse();
		try {
			response = weatherservice.getWeatherData(lat, lon, appId);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
