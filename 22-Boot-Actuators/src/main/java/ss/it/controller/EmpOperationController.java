package ss.it.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpOperationController {
	@GetMapping("/edata")
	public String showData() {
		return "hello => " + LocalDateTime.now();
	}
}
