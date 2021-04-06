package com.xworkz.pg.component;

public class Motor {
	
	private int warrantyPeriod;
	
	public Motor() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	public void rotate() {
		System.out.println("motor is rotating");
	}
	
	public void setWarrantyPeriod(int warrantyPeriod) {
		System.out.println("invoked warrantyPeriod:"+warrantyPeriod);
		this.warrantyPeriod = warrantyPeriod;
	}

}
