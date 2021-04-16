package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IOTProject {

	@Value("Air and sound pollution monitoring system")
	private String name;

	@Autowired
	private Components components;

	public IOTProject() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public void implementing() {
		System.out.println("invoked implementing");
		this.components.working();
	}
}
