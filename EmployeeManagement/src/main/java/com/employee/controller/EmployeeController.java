package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);

	}

	@GetMapping("/employee")
	public List<Employee> fetchEmployeeList() {
		return employeeService.fetchEmployeeList();

	}
	
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable("id") int id) {

		return employeeService.findById(id);

	}
	@DeleteMapping("/employee/{id}")
	public String deleteById(@PathVariable ("id") int id) {
		
		return employeeService.deleteEmployeeById(id);
		
	}
}
