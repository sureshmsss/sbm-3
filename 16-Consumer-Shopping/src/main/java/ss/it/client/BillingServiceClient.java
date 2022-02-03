package ss.it.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceClient {

	@Autowired
	private LoadBalancerClient client;

	public String getBillingInfo() {
		// get less load factory service instance
		ServiceInstance si = client.choose("Billing-service");
		// get Producer MS URI and make it url
		String url = si.getUri() + "/billing/info";
		// create rest template
		RestTemplate template = new RestTemplate();
		// invoke producer ms service method or operation by generating http call
		String resp = template.getForObject(url, String.class);

		return resp;
	}
}
