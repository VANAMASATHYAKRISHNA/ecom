package com.sathya.hybernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sathya.model.Product;

public class Test {

	public static void main(String[] args) {
		Configuration configuration;
		configuration=new Configuration();
		configuration.configure("dbconfig.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Product product=new Product();
		product.setProductId(101);
		product.setProductName("dell");
		product.setProductPrice(500000);
        session.save(product);
        Transaction transaction=session.beginTransaction();
       transaction.commit();
        
        
	}

}
