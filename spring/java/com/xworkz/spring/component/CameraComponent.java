package com.xworkz.spring.component;

public class CameraComponent {
	
	public CameraComponent() {
		System.out.println("created default constructor");
	}
	
	public void clicking(String name) {
		System.out.println("invoked clicking");
		System.out.println("captured image is:"+name);
	}
}
