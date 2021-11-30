package com.pavan.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.db.model.Employee;
import com.pavan.db.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("/Employee")
	public String saveEmployee(@RequestBody Employee employee) {
		
		employeeRepo.save(employee);
		return "emp saved successfully !..";
		
	}
	
	@GetMapping("/Employees")
	public List<Employee> getAll(){
		return employeeRepo.findAll();
	}
	
	@GetMapping("/Employee/{dept}")
	public List<Employee> getEmployeesByDept(@PathVariable String dept){
		return employeeRepo.findByDept(dept);
		
		
	}
	
	

/**
 * {
    "ename":"chaitu",
    "dept":"mec",
    "salary":123456
}

{
    "ename":"om",
    "dept":"CA",
    "salary":1234576
}

{
    "ename":"naveen",
    "dept":"agri",
    "salary":456789
}
{
    "ename":"pk",
    "dept":"IT",
    "salary":12345
}
 */
	
	
}
