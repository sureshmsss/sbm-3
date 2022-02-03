package ss.it.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-service")
public interface IBillingServiceConsumer {
	@GetMapping("/billing/info")
	public String fetchDetails();

}
