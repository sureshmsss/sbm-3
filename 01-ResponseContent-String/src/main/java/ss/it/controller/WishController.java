package ss.it.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish")
public class WishController {
	@GetMapping("/getMsg")
	public ResponseEntity<String> getMessage(String user) {
		LocalDateTime dt = LocalDateTime.now();
		int hour = dt.getHour();
		//String msg = null;
		String body = null;
		if (hour <= 12)
			body = "g m"+user;
		else if (hour <= 16)
			body = "g a"+user;
		else if (hour <= 20)
			body = "g e"+user;
		else
			body = "g n"+user;
		// return msg;
		HttpStatus status = HttpStatus.OK;

		ResponseEntity<String> entity = new ResponseEntity<String>(body, status);
		return entity;
	}

}
