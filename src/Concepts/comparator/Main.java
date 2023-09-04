package Concepts.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7,10)));
		employees.add(new Employee(1004, "Chirs", 95000.00, LocalDate.of(2017, 3,19)));
		employees.add(new Employee(1015, "David", 150000.00, LocalDate.of(2017, 9,18)));
		employees.add(new Employee(1023, "Steve", 112200.00, LocalDate.of(2014, 1,23)));

		System.out.println("Employees {Before Sorting} : "+ employees);
		for(Employee emp:employees) {
			System.out.println(emp.getId()+ " - "+emp.getName()+ " - "+emp.getSalary()+ " - "+ emp.getJoiningDate());
			
		}
		//Sort By Name
		Comparator<Employee> employeeNameComparator=new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};
		
		Comparator<Employee> employeeSalaryComparator=new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSalary().compareTo(e2.getSalary());
			}
		};
		Comparator<Employee> employeeJoiningDataComparator=new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getJoiningDate().compareTo(e2.getJoiningDate());
			}
		};
		
		Collections.sort(employees,employeeNameComparator);
		System.out.println("Employees {After Sorting By Name} : "+ employees);

		for(Employee emp:employees) {
			System.out.println(emp.getId()+ " - "+emp.getName()+ " - "+emp.getSalary()+ " - "+ emp.getJoiningDate());
			
		}
		Collections.sort(employees,employeeSalaryComparator);
		System.out.println("Employees {After Sorting By Salary} : "+ employees);

		for(Employee emp:employees) {
			System.out.println(emp.getId()+ " - "+emp.getName()+ " - "+emp.getSalary()+ " - "+ emp.getJoiningDate());
			
		}
		Collections.sort(employees,employeeJoiningDataComparator);
		System.out.println("Employees {After Sorting By JoiningDate} : "+ employees);

		for(Employee emp:employees) {
			System.out.println(emp.getId()+ " - "+emp.getName()+ " - "+emp.getSalary()+ " - "+ emp.getJoiningDate());
			
		}
	}

}
