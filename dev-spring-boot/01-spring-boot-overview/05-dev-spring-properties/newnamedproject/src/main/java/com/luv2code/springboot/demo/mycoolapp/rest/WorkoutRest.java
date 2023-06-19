package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutRest {
	
	@GetMapping("/workout")
	public String welcome() {
		return "work hard get 5K";
	}

}
