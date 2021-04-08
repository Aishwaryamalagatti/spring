package com.xworkz.foodItems;

import com.xworkz.foodItems.constants.VendorType;
import com.xworkz.foodItems.entity.HotelVendorEntity;
import com.xworkz.foodItems.repository.HotelVendorRepo;
import com.xworkz.foodItems.repository.HotelVendorRepoImpl;
import com.xworkz.foodItems.services.HotelVendorService;
import com.xworkz.foodItems.services.HotelVendorServiceImpl;

public class HotelVendorTester {

	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("Aditi", "Hubli", 4, VendorType.RETAILERS, 9811205460l);
		HotelVendorRepo repo = new HotelVendorRepoImpl();
		HotelVendorService service = new HotelVendorServiceImpl(repo);
		service.validateAndSave(entity);
	}
}
