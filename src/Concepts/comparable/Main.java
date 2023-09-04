package Concepts.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7,10)));
		employees.add(new Employee(1004, "Chirs", 95000.00, LocalDate.of(2017, 3,19)));
		employees.add(new Employee(1015, "David", 150000.00, LocalDate.of(2017, 9,28)));
		System.out.println("Employees {Before Sorting} : "+ employees);
		for(Employee emp:employees) {
			System.out.println(emp.getId()+ " - "+emp.getName()+ " - "+emp.getSalary()+ " - "+ emp.getJoiningDate());
			
		}
		
		Collections.sort(employees);
		System.out.println("Employees {After Sorting} : "+ employees);

		for(Employee emp:employees) {
			System.out.println(emp.getId()+ " - "+emp.getName()+ " - "+emp.getSalary()+ " - "+ emp.getJoiningDate());
			
		}
	}

}
