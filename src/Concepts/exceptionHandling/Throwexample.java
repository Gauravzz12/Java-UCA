package Concepts.exceptionHandling;

public class Throwexample {

	public void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access Denied");
		}
		else {
			System.out.println("Access Granted");
		}
	}
	
	public static void main(String[] args) {
		Throwexample obj=new Throwexample();
		obj.checkAge(18);

	}

}
