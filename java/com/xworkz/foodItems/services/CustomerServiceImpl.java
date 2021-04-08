package com.xworkz.foodItems.services;

import com.xworkz.foodItems.entity.CustomerEntity;
import com.xworkz.foodItems.repository.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepo customerRepo;
	
	public CustomerServiceImpl(CustomerRepo customerRepo) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.customerRepo=customerRepo;
	}

	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			customerRepo.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}
}
