package Concepts.Generics;

public class Box<T> {

	private Object object;
	
	public Box() {
		
	}

	public  Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static void main(String[] args) {

		Box objectBox= new Box();
		
		objectBox.setObject(new String("Gaurav"));
		System.out.println(objectBox.getObject());
		
		objectBox.setObject(new Double(10000.00));
		System.out.println(objectBox.getObject());
	}

}