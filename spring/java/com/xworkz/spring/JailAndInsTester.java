package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.InsuranceComponent;
import com.xworkz.spring.component.JailComponent;

public class JailAndInsTester {

	public static void main(String[] args) {

		
		String xmlFileName1="camera.xml";
		String xmlFileName2="insurance.xml";
		
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName1,xmlFileName2);
		System.out.println(container.getBeanDefinitionCount());
		
		JailComponent jail=container.getBean("jailComponent1",JailComponent.class);
		jail.punishment();
		
		InsuranceComponent insurance=container.getBean(InsuranceComponent.class);
		System.out.println(insurance.policyName());
	}

}
