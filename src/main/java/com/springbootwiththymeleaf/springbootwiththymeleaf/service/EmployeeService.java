package com.springbootwiththymeleaf.springbootwiththymeleaf.service;

import java.util.List;

import com.springbootwiththymeleaf.springbootwiththymeleaf.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
