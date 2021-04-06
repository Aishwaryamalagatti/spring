package com.xworkz.pg.component;

public class Power {
	
	private boolean on;
	
	public Power() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean on) {
		System.out.println("invoked on:"+on);
		this.on = on;
	}

}
