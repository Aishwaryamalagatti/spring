package com.xworkz.foodItems.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.foodItems.entity.FoodItemEntity;

public class FoodItemRepoImpl implements FoodItemRepo {

	private SessionFactory factory;

	public FoodItemRepoImpl(SessionFactory factory) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.factory = factory;
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save " + entity);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		// factory.close();
	}

}
