package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.DepartmentDao;
import com.graymatter.dao.EmployeeDao;
import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	EmployeeDao dao;
	
	
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return dao.getAllEmployee();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		
		return dao.addEmployee(employee);
		
		
		
	}

	public List<Employee> getAllEmployeeByCity(String city) {
		
		return dao.getAllEmployeeByCity(city);
	}

	public Employee getEmployeeById(int id) throws ResourceNotFoundException {
		
		return dao.getEmployeebyId(id);
	}

	public List<Employee> getAllEmployeesByDepartmentId(int id) {
		
		return dao.getAllEmployeesByDepartmentId(id);
	}

	public List<Employee> findAllEmployeesStartWith(String letter) {
		
		return dao.findAllEmployeesStartWith(letter);
	}

}
