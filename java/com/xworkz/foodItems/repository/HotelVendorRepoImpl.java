package com.xworkz.foodItems.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.foodItems.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepo {
	
	public HotelVendorRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save"+entity);
		Configuration config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}