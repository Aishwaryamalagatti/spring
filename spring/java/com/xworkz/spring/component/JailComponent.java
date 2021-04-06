package com.xworkz.spring.component;

public class JailComponent {
	
	public JailComponent() {
		System.out.println("created "+this.getClass());
	}

	public void punishment() {
		System.out.println("invoked punishment");
	}
}
