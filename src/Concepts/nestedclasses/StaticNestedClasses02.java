package Concepts.nestedclasses;

import Concepts.nestedclasses.StaticNestedClasses02.CandidateInfo.CandidateSalary;

public class StaticNestedClasses02 {

	private String companyName;
	
	 

	public class CandidateInfo{
		 
			private String name;
			private int Age;
			
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			this.Age = age;
		}
		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String _companyName) {
			companyName = _companyName;
		}
		
		public class CandidateSalary{
			private int salary;

			public int getSalary() {
				return salary;
			}

			public void setSalary(int salary) {
				this.salary = salary;
			}
			
		}

	}

	public static void main(String[] args) {
		StaticNestedClasses02 obj=new StaticNestedClasses02();
		CandidateInfo objCI=obj.new CandidateInfo();
		CandidateSalary objCS=objCI.new CandidateSalary();
		objCI.setCompanyName("ABC");
		objCI.setName("Tim");
		objCI.setAge(25);
		objCS.setSalary(25000);
		System.out.println("Company : "+objCI.getCompanyName());
		System.out.println("Name : "+ objCI.getName());
		System.out.println("Age : "+ objCI.getAge());
		System.out.println("Salary : "+ objCS.getSalary());
	}

}
