package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Consumer")
public class Diff_Req_Modes_Consumer_Controller {
	@GetMapping("/get")
	public ResponseEntity<String> show_GET() {
		return new ResponseEntity<String>("show_GET()", HttpStatus.OK);
	}

	@PostMapping("/post")
	public ResponseEntity<String> insert_POST() {
		return new ResponseEntity<String>("insert_POST()", HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> delete_DELETE() {
		return new ResponseEntity<String>("delete_DELETE()", HttpStatus.OK);
	}

	@PutMapping("/put")
	public ResponseEntity<String> modify_PUT() {
		return new ResponseEntity<String>("modify_PUT()", HttpStatus.OK);
	}

	@PatchMapping("/patch")
	public ResponseEntity<String> partial_modify_PATCH() {
		return new ResponseEntity<String>("partial_modify_PATCh()", HttpStatus.OK);
	}

	
}
