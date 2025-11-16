package com.shubham.EmployeeManagementSystem;

import java.util.Scanner;

import org.hibernate.Session;

import org.hibernate.Transaction;

public class InsertRecord {
	
	public void  insertRecord(){
		
			Scanner scanner = new Scanner(System.in);
		
			EmployeeEntity employeeEntity = new EmployeeEntity();
			
			System.out.println("Enter the Employee Name :");
			employeeEntity.setName(scanner.next());
			System.out.println("Enter the Employee Salary : ");
			employeeEntity.setSalary(scanner.next());
		 
			Session session = HibernateUtil.getSessionFactory().openSession();
				        
			Transaction transaction  = session.beginTransaction();
		        
		    session.persist(employeeEntity);
		     
		     transaction.commit();
		        
		     session.close();
			
		     System.out.println("Employee Inserted Successfully!");
		     
	 }

}
