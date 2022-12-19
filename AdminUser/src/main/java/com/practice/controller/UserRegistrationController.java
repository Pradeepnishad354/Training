package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.service.UserService;
import com.practice.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public String showRegisterForm(Model model) {

model.addAttribute("user",new UserRegistrationDto());		
		return "registration";
	}
//	
//	@ModelAttribute("user")
//	public UserRegistrationDto userRegistrationDto() {
//		
//		return new UserRegistrationDto();
//	}
	
	@PostMapping
	public String RegisterUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		
		userService.save(registrationDto);
		
		return "redirect:/registration?success"; 
	}

	
}
