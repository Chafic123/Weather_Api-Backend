package com.weather.service;

import com.weather.model.WeatherEntity;
import com.weather.pojo.WeatherResponse;
import com.weather.repo.WeatherRepo;

import antlr.collections.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class Weatherservice {

	@Autowired
	private WeatherRepo weatherRepository;

//	private static final String WEATHER_API_URL = "https://api.openweathermap.org/data/2.5/forecast?lat=33.85&lon=35.86&appid=c0668649acd51324f05e7204a3771fcd&units=imperial";

	public WeatherResponse getWeatherData(double lat, double lon, String appId) throws Exception {
		WeatherResponse weatherResponse = new WeatherResponse();
		RestTemplate rest = new RestTemplate();
		weatherResponse = rest.getForObject("https://api.openweathermap.org/data/2.5/forecast?lat=" + lat + "&lon="
				+ lon + "&appid=" + appId + "&units=imperial", WeatherResponse.class);
		if (weatherResponse != null)
			return weatherResponse;
		return weatherResponse;
	}

	public void saveWeatherData(WeatherResponse weatherResponse) {
		for (WeatherResponse.WeatherData weatherData : weatherResponse.getList()) {
			WeatherEntity weatherEntity = new WeatherEntity();
			weatherEntity.setTemperature(weatherData.getMain().getTemp());
			weatherEntity.setFeelsLike(weatherData.getMain().getFeelsLike());
			weatherEntity.setTempMin(weatherData.getMain().getTempMin());
			weatherEntity.setTempMax(weatherData.getMain().getTempMax());
			weatherEntity.setPressure(weatherData.getMain().getPressure());
			weatherEntity.setHumidity(weatherData.getMain().getHumidity());
			weatherEntity.setWindSpeed(weatherData.getWind().getSpeed());
			weatherEntity.setWindDeg(weatherData.getWind().getDeg());
			weatherEntity.setWindGust(weatherData.getWind().getGust());
			weatherEntity.setClouds(weatherData.getClouds().getAll());
			weatherEntity.setWeatherMain(weatherData.getWeather().get(0).getMain());
			weatherEntity.setWeatherDescription(weatherData.getWeather().get(0).getDescription());
			weatherEntity.setTimestamp(
					LocalDateTime.parse(weatherData.getDtTxt(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			weatherRepository.save(weatherEntity);
		}
	}

}
