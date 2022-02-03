package ss.it.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		// create Rest Template class Object
		RestTemplate template = new RestTemplate();

		// define service url
		String serviceUrl = "http://localhost:2019/SpringRest/actor/wish/{id}/{name}";

		// generate Http Request with GET mode to consume the web serevice(API)
		ResponseEntity<String> response = template.getForEntity(serviceUrl, String.class,
				Map.of("name", "suresh", "id", 1001));

		// display the recieved response details
		System.out.println("body : " + response.getBody());
		System.out.println("status code value : " + response.getStatusCodeValue());
		System.out.println("headers : " + response.getHeaders());
		System.out.println("status code : " + response.getStatusCode());

	}
}
