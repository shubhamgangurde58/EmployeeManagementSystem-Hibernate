package com.shubham.EmployeeManagementSystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateRecord {
	
	public void updateRecord() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID to Update:");
		
		int id = scanner.nextInt();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		EmployeeEntity employeeEntity =  session.get(EmployeeEntity.class, id);
		
		if(employeeEntity != null) {
			
			 	System.out.println("\nCurrent Details:");
	            System.out.println("ID     : " + employeeEntity.getId());
	            System.out.println("Name   : " + employeeEntity.getName());
	            System.out.println("Salary : " + employeeEntity.getSalary());
			
				try {
						
						System.out.println("Enter New Name :");
						employeeEntity.setName(scanner.next());
						
						System.out.println("Enter New Salary :");
						employeeEntity.setSalary(scanner.next());
						
						Transaction transaction = session.beginTransaction();
						
						session.merge(employeeEntity);
					
						transaction.commit();
						
		                System.out.println("\nEmployee Record Successfully Updated!");
						
				}catch (Exception e) {
					
					System.out.println(e.getMessage());
					
				}finally {
					session.close();
				}	
				
		}else {
			
			System.out.println("Record Not Found !!");
		}
	}

}
