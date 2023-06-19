package com.luv2code.springcoredemo.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("class name : " + getClass().getSimpleName());
	}

	@Override
	 public String GetDailyWorkout() {

		return "play cricket and be HAPPY : " + getClass().getSimpleName();
		
	}

}
