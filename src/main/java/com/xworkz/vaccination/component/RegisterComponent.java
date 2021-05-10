package com.xworkz.vaccination.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class RegisterComponent {

	public RegisterComponent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@RequestMapping("/register.do")
	public String onRegister(@RequestParam String name, @RequestParam String age, @RequestParam String aadhar,
			@RequestParam String location, @RequestParam long mobile, Model model) {
		System.out.println("invoked onRegister");
		System.out.println(name);
		System.out.println(age);
		System.out.println(aadhar);
		System.out.println(location);
		System.out.println(mobile);
		model.addAttribute("message", "Registration is success for " + name);
		return "vaccination";
	}

	@RequestMapping("/feedback.do")
	public String onFeedbackClick() {
		System.out.println("invoked onFeedbackClick");
		return "feedback";
	}
}
