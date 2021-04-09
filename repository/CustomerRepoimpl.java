package com.xworkz.foodItems.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.xworkz.foodItems.entity.CustomerEntity;

public class CustomerRepoimpl implements CustomerRepo {
	
	//LocalSessionFactoryBean
	private SessionFactory factory;
	
	public CustomerRepoimpl(SessionFactory factory) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save "+entity);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}
}
