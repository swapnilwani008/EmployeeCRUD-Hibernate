package com.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Employee;

public class HibernateUtil1 {

	static SessionFactory factory = null;
	static {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		factory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static Session getSession() {
		return factory.openSession();
	}
}