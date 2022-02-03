package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.beans.HardWare;
import ss.it.beans.PC;
import ss.it.beans.Software;

@RestController
public class SystemController {

	@GetMapping("/pc")
	public ResponseEntity<PC> getData(String user) {

		// get PC object
		PC pc = new PC("dell", "45000", "laptop", new HardWare("1TB", "15.9'", "8GB", "5000"),
				new Software("i3", "10", "3.0", "yes", "yes"));

		System.out.println("user : "+user);
		System.out.println("user : "+user);
		System.out.println("user : "+user);
		
		// response status
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<PC>(pc, status);

	}

}
