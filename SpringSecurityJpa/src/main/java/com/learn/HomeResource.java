package com.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeResource {
	@RequestMapping("/")
	public String home() {
		
		return "(<h1>welcome</h1>)";

	}
@GetMapping("/user")
	public String User() {
		
	return "<h1> welcome user</h1>";
	}

@GetMapping("/admin")
	public String Admin() {
		
		return "<h1> welcome Admin</h1>";
		}

}
