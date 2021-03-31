package com.jc.FSRestful.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to HelloWorld";
	}

}
