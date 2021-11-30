package com.pavan.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pavan.db.misc.Department;

@SpringBootApplication
public class SpringBootH2DB  {
	
	@Autowired Department department;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DB.class, args);
		
	}
	
	/**
	@Override
	public void run(String... args) throws Exception {
		department.display();
		
	}
	*/
	
	/**
	 * ApplicationRunner
	 * @param args
	 * @throws Exception
	 */
	/**
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}*/
	

}
