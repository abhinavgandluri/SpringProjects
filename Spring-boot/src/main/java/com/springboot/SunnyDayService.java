package com.springboot;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"sunny","default"})
public class SunnyDayService implements WeatherService{
    
	public String forecast() {
		
		return "Today is Sunnyday....!";
	}

}
