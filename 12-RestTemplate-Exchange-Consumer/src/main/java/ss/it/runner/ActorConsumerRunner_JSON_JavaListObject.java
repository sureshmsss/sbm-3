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

@Component
public class ActorConsumerRunner_JSON_JavaListObject implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {

		System.out.println("json to java List object");

		// create Rest Template Object
		RestTemplate template = new RestTemplate();
		// define service url
		String serviceUrl = "http://localhost:2019/SpringRest/actor/objects";

		// invoke service method/operation using exchange(-,-,-) method
		ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.GET, null, String.class);

		// display the response details
		System.out.println("response Details");
		System.out.println("body : " + response.getBody());
		System.out.println("status code value : " + response.getStatusCodeValue());
		System.out.println("headers : " + response.getHeaders());
		System.out.println("status code : " + response.getStatusCode());

		// converting json text response to Object of java class/model object/ entity
		// object using jackson API
		String jsonBody = response.getBody();

		// create Object mapper
		ObjectMapper mapper = new ObjectMapper();
		Actor[] actors = mapper.readValue(jsonBody, Actor[].class);

		System.out.println("");
		List<Actor> actorsList = Arrays.asList(actors);
		System.out.println("");
		System.out.println("list of actors converted into Actor Object : \n" + actorsList);
		System.out.println("--OR--");
		actorsList.forEach(System.out::println);

		//converting list of objects from json to java class objects
		List<Actor> actors2 = mapper.readValue(jsonBody, new TypeReference<List<Actor>>() {});
		actors2.forEach(System.out::println);

	}
}
