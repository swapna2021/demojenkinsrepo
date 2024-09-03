package com.graymatter.services;

import java.util.List;

import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;

public interface EmployeeServiceInterface {

	
	public List<Employee> getAllEmployee();
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployeeByCity(String city);
	public Employee getEmployeeById(int id) throws ResourceNotFoundException;
	public List<Employee> getAllEmployeesByDepartmentId(int id);
	public List<Employee> findAllEmployeesStartWith(String letter);
}
