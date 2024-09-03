package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.repositories.EmployeeRepository;

@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> getAllEmployee(){
		
		
		return repository.findAll();
		
	}
	
	public Employee addEmployee(Employee employee) {
		//`employee.setDepartment(null);
		return repository.save(employee);
	}

	public List<Employee> getAllEmployeeByCity(String city) {
		
		return repository.findByCity(city);
	}

	public Employee getEmployeebyId(int id) throws ResourceNotFoundException {	
		return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("no value present"));
	}

	public List<Employee> getAllEmployeesByDepartmentId(int id) {		
		return repository.findByDepartmentDeptId(id);
	}

	public List<Employee> findAllEmployeesStartWith(String letter) {
		return repository.findByEmpNameStartsWith(letter);
	}

}
