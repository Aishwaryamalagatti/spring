package com.xworkz.foodItems.repository;

import com.xworkz.foodItems.entity.FoodItemEntity;

public class FoodItemRepoImpl implements FoodItemRepo {
	
	public FoodItemRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save "+entity);
	}

}
