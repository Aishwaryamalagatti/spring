package com.xworkz.pg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.pg.component.WashingMachine;

public class WashingMachineTester {

	public static void main(String[] args) {

		ApplicationContext machine = new ClassPathXmlApplicationContext("machine.xml");
		WashingMachine wash = machine.getBean(WashingMachine.class);
		wash.wash();
	}
}
