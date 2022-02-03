package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.Person;

@RestController
public class PersonController {
	@PostMapping("/person_data")
	public ResponseEntity<String> reg(@RequestBody Person person) {
		return new ResponseEntity<String>(person.toString(), HttpStatus.OK);
	}

}
