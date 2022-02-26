package ss.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.client.BillingServiceClient;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	@Autowired
	private BillingServiceClient client;
	
	@GetMapping("/info")
	public String getBill() {
		return "hello thankyou, visit again : "+client.getBillingInfo();
	}
	
}
