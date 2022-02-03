package ss.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/end")
public class SearchServiceController {
	@GetMapping("/wish")
	public String wish() {
		return "thank you for shopping End Search Service(Eureka Client) : " + this.getClass();
	}
}
