package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}

	
	@GetMapping("/")
	public String admin() {
		
		return "index";
	}
	
	
}
