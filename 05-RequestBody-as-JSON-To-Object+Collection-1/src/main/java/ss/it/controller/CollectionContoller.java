package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.E_Commerce;

@RestController
public class CollectionContoller {

	@PostMapping("/get")
	public ResponseEntity<String> getData(@RequestBody E_Commerce ecom) {
		return new ResponseEntity<String>(ecom.toString(), HttpStatus.OK);
	}

}
