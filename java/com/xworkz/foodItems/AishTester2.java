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
import com.xworkz.foodItems.services.HotelVendorService;

public class AishTester2 {

	public static void main(String[] args) {

		/*
		 * FoodItemService service=container.getBean(FoodItemService.class);
		 * FoodItemEntity entity=new FoodItemEntity("Dosa", 40, FoodType.VEG, 1, 0);
		 * service.validateAndSave(entity);
		 */
		
		/*
		 * CustomerService container1=container.getBean(CustomerService.class);
		 * CustomerEntity entity1=new CustomerEntity("Ananya", "Mangalore",
		 * "Ananya@gmail.com", 4, 8711902435l); container1.validateAndSave(entity1);
		 */
		
		/*
		 * HotelVendorService Container2=container.getBean(HotelVendorService.class);
		 * HotelVendorEntity entity2=new HotelVendorEntity("Swati", "Dharwad", 3,
		 * VendorType.RETAILERS, 7866129077l); Container2.validateAndSave(entity2);
		 */
		ApplicationContext container=new ClassPathXmlApplicationContext("FoodHotelCustomer.xml");
		
		  FoodItemService service=container.getBean(FoodItemService.class);
		  FoodItemEntity entity=new FoodItemEntity("Mushroom Friedrice", 100, FoodType.MEXICAN, 1, 0); 
		  service.validateAndSave(entity);
		 
		
		
		  CustomerService service1=container.getBean(CustomerService.class);
		  CustomerEntity entity1=new CustomerEntity("Aneesh", "Hubli","aneesh@gmail.com", 4, 9980123455l); 
		  service1.validateAndSave(entity1);
		 
		
		HotelVendorService service2=container.getBean(HotelVendorService.class);
		HotelVendorEntity entity2=new HotelVendorEntity("Swati", "Gadag", 3, VendorType.WHOLESALERS, 9800761233l);
		service2.validateAndSave(entity2);
	
	}
}