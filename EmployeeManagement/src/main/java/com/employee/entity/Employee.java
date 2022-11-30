package com.employee.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Employee")
public class Employee {
	
	@Id
	private int id;
	private String name;
    private String address;
    private String gender;
    private int salary;
    private  Date birthdate;
		
		
		
	}


