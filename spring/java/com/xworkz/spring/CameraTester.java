package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.CameraComponent;

public class CameraTester {

	public static void main(String[] args) {

		String xmlFileName="camera.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		CameraComponent ref=spring.getBean(CameraComponent.class);
		
		ref.clicking("Nature");
	}
}
