package com.xworkz.foodItems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="customer")
public class CustomerEntity {

	@Id
	
	@Column(name="CID")
	private int id;
	
	@Column(name="NAME")
	@NonNull
	private String name;
	
	@Column(name="LOCATION")
	@NonNull
	private String location;
	
	@Column(name="EMAIL")
	@NonNull
	private String email;
	
	@Column(name="RATING")
	@NonNull
	private int rating;
	
	@Column(name="PHONE_NO")
	@NonNull
	private long phoneNo;
	}