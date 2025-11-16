package com.shubham.EmployeeManagementSystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteRecord {
	
	public void deleteRecord() {
		
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Employee ID to Delete: ");
				int id = scanner.nextInt();
				
				Session session = HibernateUtil.getSessionFactory().openSession();
				EmployeeEntity employeeEntity = session.get(EmployeeEntity.class, id);
				
				if (employeeEntity != null) {
					
					Transaction transaction = null;
					
					try {
						
						 	transaction = 	session.beginTransaction();
						
						 	session.remove(employeeEntity);
						
							transaction.commit();
						
							System.out.println("\nEmployee Deleted Successfully!");
						
							System.out.println("Deleted Record -> ID: " + employeeEntity.getId() +
		                                   ", Name: " + employeeEntity.getName() +
		                                   ", Salary: " + employeeEntity.getSalary());
						
					}catch(Exception ex) {
						
						 if (transaction != null) {
			                    transaction.rollback();
			                }
						 
						System.out.println(ex.getMessage());
						
					}finally {
						session.close();
					}					
					
				}else {
					
					System.out.println("Record Not Found !!");
					
				}		
	}

}
