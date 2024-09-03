package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.DepartmentDao;
import com.graymatter.entities.Department;

@Service
public class DepartmentService implements DepartmentServiceInterface {

	
	@Autowired
	DepartmentDao dao;
	
	@Override
	public List<Department> getAllDepartments() {
		
		return dao.getAllDepartments();
	}

	@Override
	public Department addDepartment(Department department) {
	
		return dao.addDepartment(department);
	}

}
