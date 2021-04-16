package com.xworkz.organization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.organization.bean.IOTProject;

public class ProjectTester {

	public static void main(String[] args) {

		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		IOTProject proj=container.getBean(IOTProject.class);
		proj.implementing();
	}

}
