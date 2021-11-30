package com.pavan.db.misc;

import org.springframework.stereotype.Component;

@Component
public class Empl {
	private String employee_id;
	private String employee_name;
	
	public void showEmplDetails() {
		System.out.println("Employee id: "+this.employee_id+" Employee name: "+this.employee_name);
	}
}
