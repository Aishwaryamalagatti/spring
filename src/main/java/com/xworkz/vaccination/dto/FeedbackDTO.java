package com.xworkz.vaccination.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FeedbackDTO {
	
	private String name;
	private String email;
	private int rating;
	private String comments;

}
