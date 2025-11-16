package com.shubham.EmployeeManagementSystem;

import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        

                Scanner sc = new Scanner(System.in);

                System.out.println("==========================================");
                System.out.println("     Welcome to Employee Management System");
                System.out.println("==========================================");
                

                while (true) {
                	
                    System.out.println("\nPlease choose an option:");
                    System.out.println("1. Insert Record");
                    System.out.println("2. View All Records");
                    System.out.println("3. Update Record");
                    System.out.println("4. Delete Record");
                    System.out.println("5. Exit");

                    System.out.print("Enter choice: ");
                    int choice = sc.nextInt();
                    

                    switch (choice) {

                        case 1:
                            System.out.println(" Insert Record Selected!");
                            new InsertRecord().insertRecord();
                            break;

                        case 2:
                            System.out.println(" View All Records Selected!");
                            new ShowRecord().getRecord();
                            break;

                        case 3:
                            System.out.println(" Update Record Selected!");
                            new UpdateRecord().updateRecord();
                            break;

                        case 4:
                            System.out.println(" Delete Record Selected!");
                            new DeleteRecord().deleteRecord();
                            break;

                        case 5:
                            System.out.println("Thank you for using Employee Management System!");
                            System.exit(0);

                        default:
                            System.out.println("❌ Invalid choice! Please try again.");
                    }
                }
        
    }
    
}
