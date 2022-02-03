package ss.it.controller;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {

	@GetMapping("/msg")
	public ResponseEntity<String> getMsg() {
		String msg = null;
		int hour = Calendar.HOUR_OF_DAY;
		if (hour <= 12) {
			msg = "g m";
		} else if (hour <= 16) {
			msg = "g a";
		} else if (hour <= 20) {
			msg = "g e";
		} else {
			msg = "g n";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
