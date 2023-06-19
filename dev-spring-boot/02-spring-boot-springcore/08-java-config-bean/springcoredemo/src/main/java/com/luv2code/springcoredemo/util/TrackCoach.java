package com.luv2code.springcoredemo.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	public TrackCoach() {
		System.out.println("get class name usw. : " + getClass().getSimpleName() );
	}

	@Override
	 public String GetDailyWorkout() {

		return "to play Track you should be fast";
		
	}

}
