package com.xworkz.organization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.organization.bean.Lab;

public class LabTester {

	public static void main(String[] args) {

		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		Lab lab=container.getBean(Lab.class);
		lab.storing();
	}

}
