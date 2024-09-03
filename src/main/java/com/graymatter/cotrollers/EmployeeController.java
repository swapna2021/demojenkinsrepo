package com.graymatter.cotrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.repositories.EmployeeRepository;
import com.graymatter.services.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployee();
	}
	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	
	@GetMapping("/employee/city/{city}")
	public List<Employee> getAllEmployeesByCity(@PathVariable("city") String city){
		return service.getAllEmployeeByCity(city);
	}
	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) throws ResourceNotFoundException {
		return service.getEmployeeById(id);
	}
	
	@GetMapping("/employee/dept/{id}/{city}")
	public List<Employee> getAllEmployeesByDepartmentId(@PathVariable("id") int id){
		
		return service.getAllEmployeesByDepartmentId(id);
		
	}
	
	@GetMapping("/employee/letter/{letter}")
	public List<Employee> findAllEmployeesStartWith(@PathVariable("letter") String letter){
		
		return service.findAllEmployeesStartWith(letter);
	}
	
	
	
}
