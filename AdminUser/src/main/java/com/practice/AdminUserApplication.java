package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AdminUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminUserApplication.class, args);
	}

}
