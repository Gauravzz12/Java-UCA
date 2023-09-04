package Concepts.WrapperClasses;

public class Wrapperclass {

	public Wrapperclass() {
		
	}

	public static void main(String[] args) {
		int i=10;
		int j=20;
		System.out.println("Sum : "+i+j);
		System.out.println("Sum : "+(i+j));
		
		Integer my_int_i=10;
		Integer my_int_j=20;
		System.out.println("Sum : "+my_int_i+my_int_j);
		System.out.println("Sum : "+(my_int_i+my_int_j));
		
		
		System.out.println("Sum : "+(i+my_int_j));
		
		
		Integer myIntObj01=new Integer(100);
		Integer myIntObj02=new Integer(10);
	
		
		System.out.println("myIntObj1: "+myIntObj01);
		System.out.println("myIntObj2: "+myIntObj02);
		
		System.out.println("Sum : "+(myIntObj01+myIntObj02));
		
		System.out.println("SUM : "+(i+myIntObj02));
		
		
		//Primitive Type to Wrapper Object
		
		int a=10;
		Integer _aobj=Integer.valueOf(i);
		
		//Wrapper Object to Primitive Type
		
		Integer _bobj=10;
		int b=_bobj.intValue();
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
