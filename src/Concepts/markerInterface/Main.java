package Concepts.markerInterface;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Employee[][] arr=new Employee[3][2];
		
		Scanner in=new Scanner(System.in);
		String id;
		String name;
		CRUD obj=new CRUD();
		
		String operation;
		System.out.println("Enter Operation : ");
		operation =in.next();
		operation=operation.toUpperCase();
		while(!operation.equalsIgnoreCase("END")) {
			
			switch (operation) {
			case "INSERT":
				System.out.println("Enter Employee Id : ");
				id=in.next();
				System.out.println("Enter Employee Name : ");
				 name=in.next();
				obj.addEmployee(id, name);
				break;
			case "DELETE":
				System.out.println("Enter Employee Id : ");
				id=in.next();
				obj.deleteEmployee(id);
			case "UPDATE":
				System.out.println("Enter Employee Id : ");
				id=in.next();
				System.out.println("Enter New Employee Id : ");
				String id2=in.next();
				System.out.println("Enter New Employee Name : ");
				String name2=in.next();
				obj.updateEmployee(id,id2, name2);
				break;
			default:
				System.out.println("NO Such Operation");
				break;
			}
			System.out.println("Enter Operation : ");
			operation =in.next();
			operation=operation.toUpperCase();
		
		obj.showEmployees();
		}
		}

}
