package ss.it.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.UserData;

@RestController
public class UserRegistration {
	@PostMapping("/data")
	public String getData(@RequestBody UserData data) {
		return data.toString();
	}

}
