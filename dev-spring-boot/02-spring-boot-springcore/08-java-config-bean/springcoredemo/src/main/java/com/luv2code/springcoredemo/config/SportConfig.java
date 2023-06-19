package com.luv2code.springcoredemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.luv2code.springcoredemo.util.Coach;
import com.luv2code.springcoredemo.util.SwimmingCoach;

//@Bean use : take existing third-party class and expose as a Spring bean 

@Configuration
public class SportConfig {
	
	 @Bean("aquatic")		//bean adi method adidir ve çagırdıgı nesne == bean
     public Coach myBean_swimmingCoach() {
		 
          return new SwimmingCoach();
          
	 
	 }

 
}
	 
	 
