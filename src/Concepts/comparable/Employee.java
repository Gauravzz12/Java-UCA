package Concepts.comparable;

import java.time.LocalDate;
import java.util.Objects;

public class Employee  implements Comparable<Employee>{

		private int id;
		private String name;
		private double Salary;
		private LocalDate joiningDate;
		
	public Employee(int id,String name,double Salary,LocalDate joiningDate) {
		this.id=id;
		this.name=name;
		this.Salary=Salary;
		this.joiningDate=joiningDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
public LocalDate getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(LocalDate joiningDate) {
	this.joiningDate = joiningDate;
}
	@Override
	public int compareTo(Employee anotherEmployee) {
		if(this.getId()<anotherEmployee.getId()) {
			return -1;
		}
		else if(this.getId()>anotherEmployee.getId()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	@Override
	public boolean equals(Object O) {
		if(this== O)
			return true;
		if(O==null || getClass()!=O.getClass())
			return false;
		Employee employee=(Employee ) O;
		return id==employee.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	


}
