package com.xworkz.foodItems.services;

import com.xworkz.foodItems.entity.HotelVendorEntity;
import com.xworkz.foodItems.repository.HotelVendorRepo;

public class HotelVendorServiceImpl implements HotelVendorService {

	private HotelVendorRepo hotelVendorRepo;

	public HotelVendorServiceImpl(HotelVendorRepo hotelVendorRepo) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.hotelVendorRepo = hotelVendorRepo;
	}

	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
		System.out.println("invoked validateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			hotelVendorRepo.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}
}
