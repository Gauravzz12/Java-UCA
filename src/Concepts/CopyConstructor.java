package Concepts;

public class CopyConstructor {
	String name;

	public CopyConstructor(String name) {
		this.name=name;
		System.out.println( name);
	}
	public CopyConstructor(CopyConstructor obj) {
		this.name=obj.name;
	}
	
		private String getName() {
			return name;
		}
		
		private void setName(String string) {
			this.name=string;	
			}
			
public static void main(String[] args) {
		
	CopyConstructor obj=new CopyConstructor("Gaurav");
	System.out.println("May I : "+obj.getName());
		
	CopyConstructor copiedObj=new CopyConstructor(obj);
	System.out.println("May I : "+copiedObj.getName());

	obj.setName("Thakur");
	System.out.println("May I : "+obj.getName());
	System.out.println("May I : "+copiedObj.getName());


	
	}


}
