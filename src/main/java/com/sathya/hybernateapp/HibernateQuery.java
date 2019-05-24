package com.sathya.hybernateapp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sathya.model.Product;

public class HibernateQuery {

	public static void main(String[] args) {
		Configuration configuration;
		configuration=new Configuration();
		configuration.configure("dbconfig.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List list=query.list();
		for(Object object:list)
		{
			Product product=(Product)object;
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getProductPrice());
		}

	}

}
