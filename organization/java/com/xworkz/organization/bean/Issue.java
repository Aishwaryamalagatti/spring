package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Issue {

	private String name;
	@Value("2")
	private int noOfIssues;

	public Issue(@Value("exception") String name) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.name = name;
}
	
	public void fixing() {
		System.out.println("invoked fixing");
		System.out.println("name of issue is:"+this.name);
		System.out.println("no of issues are:"+this.noOfIssues);
	}
}
