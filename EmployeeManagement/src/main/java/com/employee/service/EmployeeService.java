package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;


public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	 List<Employee> fetchEmployeeList();


   public  String deleteEmployeeById(int id);

    Employee updateEmployee( Employee employee, int id);
      
    public Employee findById(int id);


}
