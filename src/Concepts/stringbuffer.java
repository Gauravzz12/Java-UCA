package Concepts;

public class stringbuffer {
	public static void main(String[] args)
	{
		
		StringBuffer s2=new StringBuffer("Gaurav");
		System.out.println(s2.capacity());		
		s2.insert(6, " Thakur");
		System.out.println(s2);
		s2.insert(s2.length(), "is From Harriapur village ");
		System.out.println(s2.length());
		System.out.println(s2.capacity());		

		}
}

//blog 
//login system
//email validation