package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorController {

	@GetMapping("/wish/{id}/{name}")
	public ResponseEntity<String> displayMsg(@PathVariable Integer id, @PathVariable String name) {
		return new ResponseEntity<String>("{" + id + "===" + name + "}", HttpStatus.OK);
	}
}
