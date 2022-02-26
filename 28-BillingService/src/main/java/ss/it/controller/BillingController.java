package ss.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {

	@GetMapping("/getInfo")
	public String getBill() {
		return "we accept COD,ALL Cards,UPI,NetBanking";
	}

}
