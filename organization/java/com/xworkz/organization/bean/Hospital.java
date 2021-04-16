package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	
	@Value("Kims")
	private String name;
	@Autowired
	private XrayMachine machine;
	
	public Hospital() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	public void enrolling() {
		System.out.println("invoked enrolling");
		this.machine.running();
		
	}
}
