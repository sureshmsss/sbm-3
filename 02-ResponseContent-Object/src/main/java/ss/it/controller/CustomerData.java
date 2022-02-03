package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.Customer;

@RestController
public class CustomerData {
	
	@GetMapping("/data")
	public ResponseEntity<Customer> getDetails(){
		Customer customer=new Customer("suresh",1231,"deve");
		
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<Customer>(customer,status);
	}

}
