package ss.it.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Datacontroller {

	@GetMapping("/send/id/name")
	public String get1(@PathVariable(name="id") Integer eid, @PathVariable String name) {
		return "get1";
	}
	@GetMapping("/send/id/{name}")
	public String get2(@PathVariable(name="id") Integer eid, @PathVariable String name) {
		return "get2";
	}
	@GetMapping("/send/{id}/name")
	public String get3(@PathVariable(name="id") Integer eid, @PathVariable String name) {
		return "get3";
	}

}
