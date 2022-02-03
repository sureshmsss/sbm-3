package ss.it.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ActorConsumerRunner_with_URI implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("=======================");
		System.out.println("uri runner");

		// create Rest Template Object
		RestTemplate template = new RestTemplate();

		// define service url
		String serviceUrl = "http://localhost:2019/SpringRest/actor/wish/{id}/{name}";

		// invoke service method/operation using exchange(-,-,-) method
		ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.GET, null, String.class, 786,
				"suresh");

		// display the response details
		System.out.println("body : " + response.getBody());
		System.out.println("status code value : " + response.getStatusCodeValue());
		System.out.println("headers : " + response.getHeaders());
		System.out.println("status code : " + response.getStatusCode());

	}
}
