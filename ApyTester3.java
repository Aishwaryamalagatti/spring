package com.xworkz.foodItems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.foodItems.constants.FoodType;
import com.xworkz.foodItems.constants.VendorType;
import com.xworkz.foodItems.entity.CustomerEntity;
import com.xworkz.foodItems.entity.FoodItemEntity;
import com.xworkz.foodItems.entity.HotelVendorEntity;
import com.xworkz.foodItems.services.CustomerService;
import com.xworkz.foodItems.services.FoodItemService;
import com.xworkz.foodItems.services.FoodItemServiceImpl;
import com.xworkz.foodItems.services.HotelVendorService;

public class ApyTester3 {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("FoodHotelCustomer.xml",
				"application-db.xml");
		FoodItemService service = container.getBean(FoodItemService.class);
		FoodItemEntity entity = new FoodItemEntity("Lasagna", 180, FoodType.ITALIAN, 1, 2);
		service.validateAndSave(entity);

		CustomerService service1 = container.getBean(CustomerService.class);
		CustomerEntity entity1 = new CustomerEntity("Swetha", "Mandya", "swe@gmail.com", 4, 9800354176l);
		service1.validateAndSave(entity1);

		HotelVendorService service2 = container.getBean(HotelVendorService.class);
		HotelVendorEntity entity2 = new HotelVendorEntity("Shawn", "Belgaum", 4, VendorType.WHOLESALERS, 8755263013l);
		service2.validateAndSave(entity2);
	}

}
