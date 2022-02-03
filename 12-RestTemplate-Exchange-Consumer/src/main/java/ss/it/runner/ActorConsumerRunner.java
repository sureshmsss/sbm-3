package ss.it.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import ss.it.model.Actor;

//@Component
public class ActorConsumerRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("===================");
		System.out.println("runner string msg");

		// create Rest Template Object
		RestTemplate template = new RestTemplate();

		// define service url
		String serviceUrl = "http://localhost:2019/SpringRest/actor/msg";

		// invoke service method/operation using exchange(-,-,-) method
		ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.GET, null, String.class);

		// display the response details
		System.out.println("body : " + response.getBody());
		System.out.println("status code value : " + response.getStatusCodeValue());
		System.out.println("headers : " + response.getHeaders());
		System.out.println("status code : " + response.getStatusCode());


	}
}
