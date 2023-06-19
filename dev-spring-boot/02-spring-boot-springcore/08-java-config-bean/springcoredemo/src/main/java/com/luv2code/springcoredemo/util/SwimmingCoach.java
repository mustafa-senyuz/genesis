package com.luv2code.springcoredemo.util;

// @Bean use : take existing third-party class and expose as a Spring bean 

public class SwimmingCoach implements Coach{			// eğer bir component degilse dışarıdan bir sınıftır

	
	public SwimmingCoach() {
		System.out.println("this const. belongs to SwimmingCoach");
	}
	
	
	
	@Override     
	public String GetDailyWorkout() {		// http://localhost:8080/getdailyworkout
		 
		return "SWIMM 1K meters  well and go on ";				
		
	}

}
