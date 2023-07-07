package com.app;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodayProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodayProjectApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelmapper()
	{
		ModelMapper mp=new ModelMapper();
		mp.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mp;
	}

}
