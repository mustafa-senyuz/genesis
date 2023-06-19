package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.util.Coach;
import com.luv2code.springcoredemo.util.CricketCoach;

import ch.qos.logback.core.joran.conditional.IfAction;

// interface üzerinden metod çagrısı yapılıyor
//@Bean use : take existing third-party class and expose as a Spring bean 

@RestController
public class CouchRestController {

	// private var for dependency from Interface
	private Coach mycoach;
	private Coach anothercoach;

	
	@Autowired
	public CouchRestController(@Qualifier("aquatic") Coach coach   ) {   // bean id comes from method <= myBean_swimmingCoach   @Qualifier
		mycoach = coach;
	}
	
	
	
	
	
	
	
	
	@GetMapping("/prototypebean")
	public String IsProBean() {
		return "this beans are : " + (mycoach == anothercoach) + " prototype ";
	}

	@GetMapping("/getdailyworkout")
	public String GetDailyWorkout() {
		return mycoach.GetDailyWorkout();
	}

}