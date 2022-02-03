package ss.it.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ActorConsumerRunner_with_JSON implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("==============");
		System.out.println("json runner");

		// create Rest Template Object
		RestTemplate template = new RestTemplate();

		// define service url
		String serviceUrl = "http://localhost:2019/SpringRest/actor/register";

		// prepare json data (request body)
		String json_body = "{\"id\":\"789\",\"name\":\"suresh\",\"age\":\"30\",\"type\":\"hero\"}";

		// prepare headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// prepare HttpRequest as HttpEntity object having head, body
		HttpEntity<String> entity = new HttpEntity<String>(json_body, headers);

		// invoke service method/operation using exchange(-,-,-) method
		ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.POST, entity, String.class);

		// display the response details
		System.out.println("body : " + response.getBody());
		System.out.println("status code value : " + response.getStatusCodeValue());
		System.out.println("headers : " + response.getHeaders());
		System.out.println("status code : " + response.getStatusCode());

	}
}
