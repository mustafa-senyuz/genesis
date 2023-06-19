package com.luv2code.springboot.demo.mycoolapp.rest;

 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeClass {
	
	@GetMapping("/")
	public String welcome() {
		return "WELCOME TO PAGE";
	}
	
	
	@GetMapping("/bye")
	public String byebye() {
		return "SEE YOU NEXT TIME";
	}



}
