package com.luv2code.springcoredemo.util;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

 
	 public BasketballCoach() {

		System.out.println("classname and const. : " + getClass().getSimpleName());
		
	}

	@Override
	public String GetDailyWorkout() {
 
		return "do basketball and be happy ...";
	}

}


