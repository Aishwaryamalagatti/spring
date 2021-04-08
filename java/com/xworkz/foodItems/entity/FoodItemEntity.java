package com.xworkz.foodItems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.foodItems.constants.FoodType;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "food_item")
public class FoodItemEntity {

	@Id
	@Column(name = "FID")
	private int id;

	@Column(name = "NAME")
	@NonNull
	private String name;

	@Column(name = "PRICE")
	@NonNull
	private double price;

	@Column(name = "FOOD_TYPE")
	@NonNull
	private FoodType foodType;

	@Column(name = "QUANTITY")
	@NonNull
	private int quantity;

	@Column(name = "DISCOUNT")
	@NonNull
	private double discount;

}