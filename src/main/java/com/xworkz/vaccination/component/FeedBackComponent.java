package com.xworkz.vaccination.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.vaccination.dto.FeedbackDTO;

@Component
@RequestMapping("/")
public class FeedBackComponent {

	public FeedBackComponent() {
System.out.println("created "+this.getClass().getSimpleName());
	}
	@RequestMapping("/send.do")
	public String onSend(FeedbackDTO dto, Model model) {
		System.out.println("invoked onSend" +dto);
		model.addAttribute("feedbackSuccessMsg", "feedback was submitted successfully for "+dto.getName());
		return "feedback";
	}
}
