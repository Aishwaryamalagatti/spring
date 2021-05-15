package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@RequestMapping("/")
public class HelloComponent {
	//InternalResourceViewResolver

	public HelloComponent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@RequestMapping("/get.do")
	public String onSubmit() {
		System.out.println("invoked onSubmit");
		return "/index";
	}
}
