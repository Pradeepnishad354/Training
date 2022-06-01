package com.learn;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);

}
