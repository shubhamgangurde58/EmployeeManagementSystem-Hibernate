package com.shubham.EmployeeManagementSystem;

import java.util.List;

import org.hibernate.Session;

public class ShowRecord {
	
	public void getRecord() {
		
		
        System.out.println("------ All Employee Records ------");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		List<EmployeeEntity> employeeList = session.createQuery("from EmployeeEntity ", EmployeeEntity.class).list();
		
		if (employeeList.isEmpty()) {
			
			System.out.println("No Records Found!");
			
		}else {
			
			for (EmployeeEntity emp : employeeList) {
                System.out.println("ID     : " + emp.getId());
                System.out.println("Name   : " + emp.getName());
                System.out.println("Salary : " + emp.getSalary());
                System.out.println("----------------------------------");
            }
		}
		
		session.clear();
	}

}
