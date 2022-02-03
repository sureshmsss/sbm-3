package ss.it.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpOperationController {
	@Value("${dbuser}")
	private String user;
	@Value("${dbpwd}")
	private String pass;

	@GetMapping("/edata")
	public String showData() {
		return user+"=>"+pass;
	}
}
