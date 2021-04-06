package com.xworkz.foodItems.repository;

import com.xworkz.foodItems.entity.CustomerEntity;

public class CustomerRepoimpl implements CustomerRepo {
	
	public CustomerRepoimpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save "+entity);
	}
}
