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

import com.graymatter.entities.Department;
import com.graymatter.repositories.DepartmentRepository;
import com.graymatter.repositories.EmployeeRepository;
import com.graymatter.services.DepartmentService;


@RestController
@RequestMapping("/api/v1")
public class DepartmentController {
	
	
	@Autowired
	DepartmentService service;
	
	
	@GetMapping("/department")
	public List<Department> getAllDepartment(){
		return service.getAllDepartments();
	}
	
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department) {
		return service.addDepartment(department);
	}
	
	
	@Autowired
	DepartmentRepository repo;
	@DeleteMapping("/dept/{did}")
	public void deleteDept(@PathVariable("did") int did) {
		repo.deleteById(did);
	}

}
