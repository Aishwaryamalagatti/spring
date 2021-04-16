package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class XrayMachine {
	
private String parts;
	
	@Value("25000")
	private int price;
	
	
	public XrayMachine(@Value("Brain") String parts) {
	System.out.println("invoked"+this.getClass().getSimpleName());
	this.parts=parts;
}
	
	public void running() {
		System.out.println("invoked running");
		System.out.println("body part to be scanned is :"+this.parts);
		System.out.println("total price is:"+this.price);
	}
}
