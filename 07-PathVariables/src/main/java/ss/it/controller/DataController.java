package ss.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@GetMapping("/send/{id}/{city}")
	public String send(@PathVariable Integer id, @PathVariable String city) {
		return id + "==>" + city;
	}
	@GetMapping("/send1/{id1}/{city1}")
	public String send1(@PathVariable("no") Integer id1, @PathVariable String city1) {
		return id1 + "==>" + city1;
	}
	@GetMapping("/send2/{city2}/{no2}")
	public String send2(@PathVariable("no2") Integer id2, @PathVariable String city2) {
		return id2 + "==>" + city2;
	}

}
