package Concepts.nestedclasses;

public class StaticNestedClasses03 {
	private static String companyName;
	
	static public class CandidateInfo{
		 
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
		
		

	}


	public static void main(String[] args) {
		StaticNestedClasses03 obj=new StaticNestedClasses03();
		CandidateInfo objCI=new CandidateInfo();
		objCI.setCompanyName("ABC");
		objCI.setName("Tim");
		objCI.setAge(25);
		System.out.println("Company : "+objCI.getCompanyName());
		System.out.println("Name : "+ objCI.getName());
		System.out.println("Age : "+ objCI.getAge());
	}

}
