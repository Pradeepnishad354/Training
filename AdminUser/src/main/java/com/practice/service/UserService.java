package com.practice.service;

import com.practice.entity.User;
import com.practice.web.dto.UserRegistrationDto;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);

}
