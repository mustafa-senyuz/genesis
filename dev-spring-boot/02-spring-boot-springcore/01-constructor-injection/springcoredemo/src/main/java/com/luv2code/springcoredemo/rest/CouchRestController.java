package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luv2code.springcoredemo.Coach;

// interface üzerinden metod çagrısı yapılıyor  -  bir nevi DAO Service Implementation 

@RestController
public class CouchRestController {
	
	//private var for dependency
	private Coach mycouch;
 
	@Autowired
	public CouchRestController(Coach couch) {			// CONST. INJ. = interface nesnesi üzerinden çocuk siniflarin metodlarini kullanmak için kendi CONST. içine gömme
		mycouch = couch;
	}
	
	@GetMapping("/getdailyworkout")
	public String GetDailyWorkout(){
		return mycouch.GetDailyWorkout();				// DAO imp. fonk. kullanıyor  -  bir nevi main metodu gibi sadece cagirma yapıyor

}