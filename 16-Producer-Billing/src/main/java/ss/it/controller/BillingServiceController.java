package ss.it.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("billing")
public class BillingServiceController {
	
	//these port and instanceId are Optional details just to see
	@Value("${server.port}")
	private int port;
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	
	@GetMapping("/info")
	public String getBillInfo() {
		return "all types of payments accepted, but money should be credited. "+port+"="+instanceId;
	}

}
