package com.app;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankManagementSystemApplication.class, args);
	}
	
	@Bean
	public ModelMapper mymodelmapper()
	{
		ModelMapper mp=new ModelMapper();
		
		 mp.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 return mp;
	}
}
