package com.xworkz.organization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.organization.bean.Program;

public class ProgramTester {

	public static void main(String[] args) {

		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		Program prg=container.getBean(Program.class);
		prg.coding();
	}

}
