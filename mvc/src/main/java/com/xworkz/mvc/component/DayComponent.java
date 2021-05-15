package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DayComponent {

	public DayComponent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@RequestMapping("/press.do")
	public String onPress() {
		System.out.println("invoked onPress");
		return "/Day.jsp";
	}
}
