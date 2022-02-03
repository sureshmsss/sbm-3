package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.Actress;

@RestController
@RequestMapping("/actor")
public class ActorJsonController {

	@PostMapping("/reg")
	public ResponseEntity<String> regActor(@RequestBody Actress actor) {
		return new ResponseEntity<String>("Actor data : " + actor.toString(), HttpStatus.OK);
	}
}
