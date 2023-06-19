package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindFortune { 
	
	@GetMapping("/getfortune")
	public String getfortune() {
		return "getting FORTUNE is very relief .... ";
	}
}
