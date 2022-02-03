package ss.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.client.BillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShopController {
	@Autowired
	private BillingServiceRestConsumer consumer;

	@GetMapping("/info")
	public String getBillInfo() {
		return "happy pongal : "+consumer.getBillInfo().toString();
	}
	
}
