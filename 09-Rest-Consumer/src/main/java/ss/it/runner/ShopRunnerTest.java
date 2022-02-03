package ss.it.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ShopRunnerTest implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		
		//create RestTemplate class object
		RestTemplate template =new RestTemplate();
		
		//define service url
		String serviceUrl="http://localhost:2019/SpringRest/shop/msg";
		
		//general http request with GET  mode to consume the web service(API)
		ResponseEntity<String> response=template.getForEntity(serviceUrl,String.class);
		//display the recieved details in response
		
		System.out.println("body : "+response.getBody());
		System.out.println("status code : "+response.getStatusCodeValue());
		System.out.println("code name : "+response.getStatusCode().name());
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
