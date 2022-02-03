package ss.it.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ss.it.model.Actor;

//@Component
public class ActorConsumerRunner_JSON_JavaObject implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("==============");
		System.out.println("json to java object");

		// create Rest Template Object
		RestTemplate template = new RestTemplate();
/*
		// define service url
		String serviceUrl = "http://localhost:2019/SpringRest/actor/object";

		// invoke service method/operation using exchange(-,-,-) method
		ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.GET, null, String.class);

		// display the response details
		System.out.println("body : " + response.getBody());
		System.out.println("status code value : " + response.getStatusCodeValue());
		System.out.println("headers : " + response.getHeaders());
		System.out.println("status code : " + response.getStatusCode());
		// converting json text response to Object of java class/model object/ entity
		// object using jackson API
		String responseBody = response.getBody();

		// create Object mapper
		ObjectMapper mapper = new ObjectMapper();
		Actor actor = mapper.readValue(responseBody, Actor.class);
		System.out.println("response as required form is " + actor);
		System.out.println("====================");
		System.out.println("====================");
		System.out.println("====================");
		System.out.println("====================");
*/
		// define service url
		String serviceUrl = "http://localhost:2019/SpringRest/actor/objects";

		// invoke service method/operation using exchange(-,-,-) method
		ResponseEntity<String> response1 = template.exchange(serviceUrl, HttpMethod.GET, null, String.class);

		// display the response details
		System.out.println("body : " + response1.getBody());
		System.out.println("status code value : " + response1.getStatusCodeValue());
		System.out.println("headers : " + response1.getHeaders());
		System.out.println("status code : " + response1.getStatusCode());

		// converting json text response to Object of java class/model object/ entity
		// object using jackson API
		String responseBody1 = response1.getBody();

		// create Object mapper
		ObjectMapper mapper1 = new ObjectMapper();
		Actor[] actors = mapper1.readValue(responseBody1, Actor[].class);

		List<Actor> actorsList = Arrays.asList(actors);
		System.out.println("==============");
		System.out.println("==============");
		System.out.println("response body of actors : " + actorsList);
		System.out.println("==============");
		System.out.println("==============");
		actorsList.forEach(System.out::println);
		System.out.println("==============");
		System.out.println("==============");

		List<Actor> actors2 = mapper1.readValue(responseBody1, new TypeReference<List<Actor>>() {
		});
		System.out.println(actors2);
		actors2.forEach(System.out::println);

	}
}
