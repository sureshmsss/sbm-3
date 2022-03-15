package ss.it.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedBusUserOperationsController {
	@GetMapping("/home")
	public String showHome() {
		return "Hello, WELCOME TO HOME PAGE OF REDBUS.COM";
	}

	@GetMapping("/after")
	public String afterLoginPage() {
		return "Hello, successfully logged into REDBUS.COM";
	}

	@GetMapping("/user")
	public Authentication showUserDetails(Principal principle) {
		System.out.println("logged in details :: " + principle.getName());
		// gives more info about logged user
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth;
	}

}
