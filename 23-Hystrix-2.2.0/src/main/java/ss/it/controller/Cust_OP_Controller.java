package ss.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class Cust_OP_Controller {
@GetMapping("/show")
//@Hystrixco
	public String show() {
		System.out.println("show()");
		return "show=>";
	}
	public String dummyShow() {
		System.out.println("show()");
		return "show=>";
	}
}
