package oop.encapsulation;

/*
 * Encapsulation: To wrap-up the fields and  methods
 */
public class Encapsulation {
	int serialNo=100;
	

	public Encapsulation() {
	System.out.println("Serial No. = "+ serialNo);	
	System.out.println("Serial No. = "+ ++serialNo);
	System.out.println("Serial No. = "+ (1+serialNo));	
		
		
	}
	public void Method() {
		System.out.println("SerialNo. = "+serialNo);
	}
	
	

}
