package com.luv2code.springcoredemo.util;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

	@Override
	 public String GetDailyWorkout() {

		return "to play Track you should be fast";
		
	}

}
