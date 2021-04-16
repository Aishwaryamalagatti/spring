package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Technician {
	
private String name;
	
	@Value("30000")
	private int salary;
	
	public Technician(@Value("Roopa")String name) {
		System.out.println("created"+this.getClass().getSimpleName());
		this.name=name;
	}
	
	public void examining() {
		System.out.println("invoked examining");
		System.out.println("technician name is:"+this.name);
		System.out.println("salary is:"+this.salary);
	}
}
