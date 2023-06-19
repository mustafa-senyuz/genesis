package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.util.Coach;

// interface üzerinden metod çagrısı yapılıyor

@RestController
public class CouchRestController {
	
	//private var for dependency from Interface 
	private Coach mycoach;
 

	@Autowired
	public   CouchRestController (@Qualifier("trackCoach") Coach coach) {
		mycoach = coach;
	}
	
	@GetMapping("/getdailyworkout")
	public String GetDailyWorkout(){
		return mycoach.GetDailyWorkout();
	}

}