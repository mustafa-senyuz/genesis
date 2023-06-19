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

@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CouchRestController {

	// private var for dependency from Interface
	private Coach mycoach;
	private Coach anothercoach;

	/*
	 * @Autowired public CouchRestController (@Qualifier("cricketCoach") Coach
	 * coach,@Qualifier("cricketCoach") Coach another_coach)
	 * { @Qualifier("basketballCoach") mycoach = coach; anothercoach =
	 * another_coach; }
	 * 
	 * @GetMapping("/checkequality") public String IsSameBean() { return
	 * "if the 2 coaches sign singleton bean : " + (mycoach == anothercoach) ; }
	 */
	
	@Autowired
	public CouchRestController(@Qualifier("cricketCoach") Coach coach  ,@Qualifier("cricketCoach") Coach differentcCoach ) {
		mycoach = coach;
		anothercoach = differentcCoach;
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