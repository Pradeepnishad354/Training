package com.practice.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.practice.entity.Role;
import com.practice.entity.User;
import com.practice.repo.UserRepository;
import com.practice.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	
	
	// constructor based injection
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}




	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		User user=new User(0, registrationDto.getFirstname(),registrationDto.getLastname(),registrationDto.getEmail()
				,registrationDto.getPassword(),Arrays.asList(new Role("Role_Admin")));
		
		return userRepository.save(user);
		
	}

}
