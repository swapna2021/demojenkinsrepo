package com.graymatter.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="project23department")
public class Department {
	
	private String deptName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL,orphanRemoval = true)
	
	//@JsonIgnore
	private List<Employee> empList=new ArrayList<Employee>();

}
