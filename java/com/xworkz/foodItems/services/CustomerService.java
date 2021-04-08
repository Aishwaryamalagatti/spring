package com.xworkz.foodItems.services;

import com.xworkz.foodItems.entity.CustomerEntity;

public interface CustomerService {
	public boolean validateAndSave(CustomerEntity entity);
}
