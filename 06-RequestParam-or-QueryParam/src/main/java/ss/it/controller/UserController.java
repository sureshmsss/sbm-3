package ss.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/send")
	public String report(@RequestParam Integer id, @RequestParam String city) {
		return id + "==>" + city;
	}
	
	//optional properties setting as false
	@GetMapping("send1")
	public String report1(@RequestParam Integer id, @RequestParam(required = false) String city) {
		return id + "==>" + city;
	}
	
	//giving other name to the params in request param
	@GetMapping("send2")
	public String report2(@RequestParam("eid") Integer id, @RequestParam(required = false) String city) {
		return id + "==>" + city;
	}

}
