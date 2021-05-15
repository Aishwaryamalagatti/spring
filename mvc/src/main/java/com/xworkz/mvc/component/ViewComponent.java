package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ViewComponent {
	
	public ViewComponent() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/view.do")
	public String onView() {
		System.out.println("invoked onView");
		return "/view.jsp";
	}

}
