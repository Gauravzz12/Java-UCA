package Concepts.nestedclasses;
public class StaticNestedClasses01 {
	
	
//	public StaticNestedCLasses() {
//		
//	}
	
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

	}

	public static void main(String[] args) {
		StaticNestedClasses01 obj=new StaticNestedClasses01();
		System.out.println(obj.hashCode());
		CandidateInfo objCI=obj.new CandidateInfo();
		System.out.println(objCI.hashCode());
		objCI.setName("Tim");
		objCI.setAge(25);
		System.out.println("Name : "+ objCI.getName());
		System.out.println("Age : "+ objCI.getAge());
	}

}
