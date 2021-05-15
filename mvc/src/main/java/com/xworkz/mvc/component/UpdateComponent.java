package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class UpdateComponent {
	
	public UpdateComponent() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/update.do")
	public String onUpdate() {
		System.out.println("invoked onUpdate");
		return "/update.jsp";
	}
}
