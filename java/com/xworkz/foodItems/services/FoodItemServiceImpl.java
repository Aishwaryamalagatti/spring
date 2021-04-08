package com.xworkz.foodItems.services;

import com.xworkz.foodItems.entity.FoodItemEntity;
import com.xworkz.foodItems.repository.FoodItemRepo;

public class FoodItemServiceImpl implements FoodItemService {

	private FoodItemRepo itemRepo;

	public FoodItemServiceImpl(FoodItemRepo itemRepo) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.itemRepo = itemRepo;
	}

	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			itemRepo.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}
}