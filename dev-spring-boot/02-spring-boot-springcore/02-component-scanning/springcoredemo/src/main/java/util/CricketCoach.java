package util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Override
	 public String GetDailyWorkout() {

		return "to play cricket you should be fast !!!!!!";
		
	}

}
