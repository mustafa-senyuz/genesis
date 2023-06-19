package com.luv2code.springcoredemo.util;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

	@Override
	 public String GetDailyWorkout() {

		return "to play BASKETBALL you should be fast";
		
	}

}
