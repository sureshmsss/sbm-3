package ss.it.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {

	@Autowired
	private DiscoveryClient client;

	public String getBillInfo() {
		// find and get service instances of producerby using service id
		List<ServiceInstance> listSI = client.getInstances("Billing-service");
		// use first service instance from the list of instances
		ServiceInstance si = listSI.get(0);
		// get the URI of MS Producer and make it URL
		String url = si.getUri() + "/bill/getInfo";
		// create rest template
		RestTemplate template = new RestTemplate();
		// invoke producer MS service method or operation by generating http call
		String resp = template.getForObject(url, String.class);
		return resp;

	}

}
