package Concepts.exceptionHandling;

public class ThrowsExamples {
	private String name;
	
	public ThrowsExamples(String name) {
		this.name=name;
	}
	public String getName() {
		if(name==null) {
			throw new NullPointerException("the Name is null");
		}
		else
		return name;
	}
	public void SendUserDetails(){
		int size = 0;
		try {
			 size=getNameLength(name);
		} catch (NullPointerException e) {
			System.out.println("Name is null ");
		}
	
		System.out.println(size+10);
	}
	//throws
	private int getNameLength(String name)throws NullPointerException{
		return name.length();
	}
	
	
	
	
	public static void main(String[] args) {
		
		String name=null;
		ThrowsExamples obj=new ThrowsExamples(name);
//		System.out.println(obj.getName());
//		System.out.println(obj.getNameLength(name));
		obj.SendUserDetails();
		try {
			System.out.println(obj.getNameLength(name));
		} catch (NullPointerException e) {
			System.out.println("OOps name is NULL");
		}
	}

}
