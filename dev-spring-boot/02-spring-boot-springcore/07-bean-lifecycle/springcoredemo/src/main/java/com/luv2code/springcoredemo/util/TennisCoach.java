package com.luv2code.springcoredemo.util;

import java.lang.reflect.Constructor;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	public TennisCoach() {
		System.out.println("class name and so on : " + getClass().getSimpleName());
	}

	@Override
	 public String GetDailyWorkout() {

		return "TENNIS classname and const. : " + getClass().getSimpleName();
		
	}

}
