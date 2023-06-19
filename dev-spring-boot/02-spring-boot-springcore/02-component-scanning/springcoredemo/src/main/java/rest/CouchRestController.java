package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import util.Coach;

// interface üzerinden metod çagrısı yapılıyor

@RestController
public class CouchRestController {
	
	//private var for dependency
	private Coach mycouch;
 
	@Autowired
	public CouchRestController(Coach couch) {
		mycouch = couch;
	}
	
	@GetMapping("/getdailyworkout")
	public String GetDailyWorkout(){
		return mycouch.GetDailyWorkout();
	}

}