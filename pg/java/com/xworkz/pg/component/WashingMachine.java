package com.xworkz.pg.component;

public class WashingMachine {
	
	private String companyName;
	private float capacity;
	private Motor motor;
	private Power pow;
	
	public WashingMachine() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	public void wash() {
		if(pow.isOn()) {
			this.motor.rotate();
		}
	}
	public void setCompanyName(String companyName) {
		System.out.println("invoked companyName:"+companyName);
		this.companyName = companyName;
	}
	public void setCapacity(float capacity) {
		System.out.println("invoked capacity:"+capacity);
		this.capacity = capacity;
	}
	public void setMotor(Motor motor) {
		System.out.println("invoked motor:"+motor);
		this.motor = motor;
	}
	public void setPow(Power pow) {
		System.out.println("invoked pow:"+pow);
		this.pow = pow;
	}
	
}
