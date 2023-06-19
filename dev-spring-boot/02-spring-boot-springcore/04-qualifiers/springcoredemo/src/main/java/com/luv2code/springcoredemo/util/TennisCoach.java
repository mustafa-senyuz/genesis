package com.luv2code.springcoredemo.util;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	@Override
	 public String GetDailyWorkout() {

		return "to play Tennis you should be fast";
		
	}

}
