package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeClass {
	
	@Value("${coder.name}")
	private String codername;
	@Value("${team.name}")
	private String teamname ;
	
	@GetMapping("/getvalues")
	public String getvalues() {
		return "codername : " + codername + "\nteamname : " + teamname;
	}

	
	@GetMapping("/")
	public String welcome() {
		return "WELCOME TO PAGE";
	}
	
	
	@GetMapping("/bye")
	public String byebye() {
		return "SEE YOU NEXT TIME";
	}

}
