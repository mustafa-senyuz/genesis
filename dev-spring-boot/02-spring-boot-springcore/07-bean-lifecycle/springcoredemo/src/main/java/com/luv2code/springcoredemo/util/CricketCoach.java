package com.luv2code.springcoredemo.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("class name : " + getClass().getSimpleName());
	}
	
	@PostConstruct
	public void firstTOrun() {				//return tipindekiler çalışmıyor
		System.out.println( "this method will in postconstruct run : " + getClass().getSimpleName() );  
	}

	@PreDestroy
	public void AfterTerminate() {				//return tipindekiler çalışmıyor
		System.out.println( "program is over in CRICKET  : " + getClass().getSimpleName() );  
	}
 
	
	
	@Override
	 public String GetDailyWorkout() {

		return "play cricket and be HAPPY : " + getClass().getSimpleName();
		
	}

}
