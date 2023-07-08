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

//	// Can you add @Bean methods to configure spring beans ? YES
//	@Bean // <bean id , class , scope ...../>
//							//any method name 
//	public ModelMapper myModelMapper() {
//		ModelMapper mapper = new ModelMapper();		//strict nahi kela tr defaukt ne jat ani by name matching karel
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		// set property matching convention between DTO n entity : as strict
//		return mapper; // config class method rets --> model mapper instance to SC --it will be managed
//						// as spring bean by SC
//	}

	
	@Bean
  public ModelMapper myModelMapper()
  {
	  ModelMapper mp=new ModelMapper();
	  mp.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	  return mp;
  }
}
