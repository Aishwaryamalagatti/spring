package com.xworkz.foodItems;

import com.xworkz.foodItems.constants.FoodType;
import com.xworkz.foodItems.entity.FoodItemEntity;
import com.xworkz.foodItems.repository.FoodItemRepo;
import com.xworkz.foodItems.repository.FoodItemRepoImpl;
import com.xworkz.foodItems.services.FoodItemService;
import com.xworkz.foodItems.services.FoodItemServiceImpl;

public class FoodItemTester {

	public static void main(String[] args) {

		FoodItemEntity entity = new FoodItemEntity("Biryani", 100, FoodType.NON_VEG, 1, 5);
		FoodItemRepo repo = new FoodItemRepoImpl();
		FoodItemService service = new FoodItemServiceImpl(repo);
		service.validateAndSave(entity);
	}
}