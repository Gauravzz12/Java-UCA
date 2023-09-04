package oop.inheritence.Multiple;

public class Car extends Car1 implements CompanyInterface,ProductInterface {

	public String _name;
	
	public Car() {
		System.out.println("CAR");
	}
	public void companyName() {
		System.out.println("HONDA");
	}
	@Override
	public void carTypes() {
		System.out.println("ELEVATE-AMAZE-CITY");
		
	}
	@Override
	public void ProductType() {
		System.out.println("SUV-SEDAN");
		
	}
	
}
