package com.app;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication     //not explained yet
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	

}
