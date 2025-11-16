package com.shubham.EmployeeManagementSystem;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static  SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		try {
			
			if(sessionFactory == null) {
				
				 sessionFactory = new Configuration().configure().buildSessionFactory();
				
			}
				
		}catch(Exception ex) {
			System.out.println("SessionFactory creation failed: "+ex.getMessage());
		}
		
		return sessionFactory;

	}
	
		

}
