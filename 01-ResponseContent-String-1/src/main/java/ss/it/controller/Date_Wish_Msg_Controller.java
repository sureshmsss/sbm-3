package ss.it.controller;

import java.time.LocalDateTime;
import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wish")
public class Date_Wish_Msg_Controller {
@GetMapping("/msg")
	public ResponseEntity<String> msg(String user) {

		LocalDateTime time = LocalDateTime.now();
		int hour = time.getHour();
		String body = null;
		if (time.getHour() <= 12)
			body = "g m" + user;
		else if (time.getHour() <= 16)
			body = "g a" + user;
		else if (time.getHour() <= 20)
			body = "g e" + user;
		else
			body = "g n" + user;

		// response status
		HttpStatus status = HttpStatus.OK;

		// create entity object
		ResponseEntity<String> entity = new ResponseEntity<String>(body, status);
		return entity;

	}
@GetMapping("/date")

public ResponseEntity<String> date(String user) {

	LocalDateTime time = LocalDateTime.now();
	int hour = time.getHour();
	String body = "hi "+user+" todays date is : "+time;
	
	// response status
	HttpStatus status = HttpStatus.OK;

	// create entity object
	ResponseEntity<String> entity = new ResponseEntity<String>(body, status);
	return entity;

}
@GetMapping("/place")

public ResponseEntity<String> place(String user) {

	LocalDateTime time = LocalDateTime.now();
	Locale l=new Locale("EN","INDIA");
	int hour = time.getHour();
	String s=l.getDisplayLanguage();
	String body = "hi "+user+" todays date is : "+time +"from "+s;
	
	// response status
	HttpStatus status = HttpStatus.OK;

	// create entity object
	ResponseEntity<String> entity = new ResponseEntity<String>(body, status);
	return entity;

}

}
