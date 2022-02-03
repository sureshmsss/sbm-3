package ss.it.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {
	@Value("${server.port}")
	private int port;
	@GetMapping("/info")
	public String getBill() {
		return "all payments accepted,but money must be credit :"+port; 
	}

}
