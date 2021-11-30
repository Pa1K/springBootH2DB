package com.pavan.db.misc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	
	// option 1
	/**
	@Autowired
	private Empl employee;
	*/
	
	
	// option 2
	/**
	private Empl employee;
	
	@Autowired
	public void setEmployee(ApplicationContext ac) {
		employee = ac.getBean(Empl.class);
	}
	*/
	
	
	
	/**
	public void display() {
		employee.showEmplDetails();
	}
	*/
	
}
