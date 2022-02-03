package ss.it.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		// create RestTemplate class object
		RestTemplate template = new RestTemplate();

		// define service URL
		String serviceUrl = "http://localhost:2019/SpringRest/actor/reg";

		// prepare json data (request body)
		String json_body = "{\"aid\":123,\"name\":\"suresh\",\"age\":27,\"type\":\"hero\"}";

		// prepare headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// prepare http request as HttpEntity obj having head, body
		HttpEntity<String> request = new HttpEntity<String>(json_body, headers);

		// make http request call in post mode
		ResponseEntity<String> response = template.postForEntity(serviceUrl, request, String.class);// url,request,output
																									// type

		// display the received details from the response
		System.out.println("body : " + response.getBody());
		System.out.println("status code value : " + response.getStatusCodeValue());
		System.out.println("headers : " + response.getHeaders());
		System.out.println("status code : " + response.getStatusCode());
		System.out.println("status code : " + response.getClass());
		
		
		//System.exit(0);

	}

}
