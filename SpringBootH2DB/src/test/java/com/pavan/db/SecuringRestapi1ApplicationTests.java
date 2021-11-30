package com.pavan.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pavan.db.controller.EmployeeController;
import com.pavan.db.repo.EmployeeRepo;

@SpringBootTest
class SecuringRestapi1ApplicationTests {
	
	@Autowired
	private EmployeeController employeeController;
	
	@MockBean
	private EmployeeRepo employeeRepo;
	
	@Test
	void contextLoads() {
	}

}
