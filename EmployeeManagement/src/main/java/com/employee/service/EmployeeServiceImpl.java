package com.employee.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository  employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		return employeeRepository.findAll();
	}

	@Override
	public String deleteEmployeeById(int id) {
		
	 employeeRepository.deleteById(id);
	 return "employee deleted successfully";
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		
		return employeeRepository.save(employee);
	}
//		 Employee ep=employeeRepository.findById(id).get();
//if(Objects.nonNull(ep.getName()) &&!"" .equalsIgnoreCase(ep.getName())) {
//	
//	ep.setName(ep.getName());
//}
//
//if(Objects.nonNull(ep.getAddress()) &&!"" .equalsIgnoreCase(ep.getAddress())) {
//	
//	ep.setAddress(ep.getAddress());
//}
//
//if(Objects.nonNull(ep.getGender()) &&!"" .equalsIgnoreCase(ep.getGender())) {
//	
//	ep.setGender(ep.getGender());
//}
//
//return employeeRepository.save(ep);
//	      
//	          
//	    
//	}

	@Override
	public Employee findById(int id) {
		
		return  employeeRepository.findById(id).get();
	}

}
