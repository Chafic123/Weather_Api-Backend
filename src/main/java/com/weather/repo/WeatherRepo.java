package com.weather.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.model.WeatherEntity;

@Repository
public interface WeatherRepo extends JpaRepository<WeatherEntity, Long> {

}
