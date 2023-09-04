package Concepts.Generics;

public class Box2<T> {

	private T object;
	
	public Box2() {
		
	}

	public  T get() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public static void main(String[] args) {

		Box2<String>object = new Box2();
		
		object.setObject("Candy");
		System.out.println(object.get());
		
		object.setObject(new String("Pizza"));
		System.out.println(object.get());
		
		/*
		 //Can't Do this
		 
		object.setObject(new Double(10000.00));
		System.out.println(object.get());
		*/
		
		Box<Double> dObject=new Box<>();
		dObject.setObject(new Double((100.90)));
		System.out.println(dObject.getObject());
		
	}

}