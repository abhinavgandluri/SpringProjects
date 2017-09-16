package com.springboot;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"Rainy","default"})
public class RainyDayService implements WeatherService {

	public String forecast() {
		
		return "It is RainyDay...!";
	}
	

}
