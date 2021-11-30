package com.pavan.db.misc;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProcessData {
	
	@Value("${datetoprocess}")
	private int dateToProcess;
	
	/**
	@Value("")
	private int dateToProcess2;
	//this throws exception
	*/
	
	@PostConstruct
	public void displayDate() {
		System.out.println("dateToProcess ="+dateToProcess);
		
		/* System.out.println(dateToProcess2); */
	}

}
