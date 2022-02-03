package ss.it.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.Actor;

@RestController
@RequestMapping("/actor")
public class ActorOperationsController {

	@GetMapping("/msg")
	public ResponseEntity<String> displayMsg() {
		return new ResponseEntity<String>("hello rest template", HttpStatus.OK);
	}

	@GetMapping("/wish/{id}/{name}")
	public ResponseEntity<String> displayDetails(@PathVariable Integer id, @PathVariable String name) {
		return new ResponseEntity<String>("hello " + id + "=>" + name, HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<String> regActor(@RequestBody Actor actor) {
		return new ResponseEntity<String>(actor.toString(), HttpStatus.OK);
	}

	@GetMapping("/object")
	public ResponseEntity<Actor> javaObj() {
		return new ResponseEntity<Actor>(new Actor(765, "ss", "28", "developer"), HttpStatus.OK);
	}
	@GetMapping("/objects")
	public ResponseEntity<List<Actor>> javaObjs() {
		return new ResponseEntity<List<Actor>>(List.of(
				new Actor(101, "suresh", "27", "hero"),
				new Actor(101, "mahesh", "35", "hero"),
				new Actor(101, "srihan", "5", "hero"),
				new Actor(101, "harshika", "2", "hero")),HttpStatus.OK);
	}
}
