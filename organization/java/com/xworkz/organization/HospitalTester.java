package com.xworkz.organization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.organization.bean.Hospital;

public class HospitalTester {

	public static void main(String[] args) {

		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		Hospital hospital=container.getBean(Hospital.class);
		hospital.enrolling();
	}

}
