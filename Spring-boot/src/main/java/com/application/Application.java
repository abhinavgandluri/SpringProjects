package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.WeatherService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	public WeatherService weatherService;

	public void run(String... arg0) throws Exception {
		System.out.println(weatherService.forecast());
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
