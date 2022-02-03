package ss.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.client.IBillingServiceConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	@Autowired
	private IBillingServiceConsumer consumer;

	@GetMapping("/info")
	public String displayBill() {
		return "happy pongal : " + consumer.fetchDetails();
	}
}
