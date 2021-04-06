package com.xworkz.foodItems;

import com.xworkz.foodItems.entity.CustomerEntity;
import com.xworkz.foodItems.repository.CustomerRepo;
import com.xworkz.foodItems.repository.CustomerRepoimpl;
import com.xworkz.foodItems.services.CustomerService;
import com.xworkz.foodItems.services.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerEntity entity=new CustomerEntity("Ananya", "Mysore", "anu@gmail.com", 4, 8900129164l);
		CustomerRepo repo=new CustomerRepoimpl();
		CustomerService service=new CustomerServiceImpl(repo);
		service.validateAndSave(entity);
	}

}
