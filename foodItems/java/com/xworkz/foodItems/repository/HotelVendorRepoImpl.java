package com.xworkz.foodItems.repository;

import com.xworkz.foodItems.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepo {
	
	public HotelVendorRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save"+entity);
	}
}
