package QuestionPractice;

class Vehicle{
	void show() {
		System.out.println("Vehicle");
	}
}
class Car extends Vehicle{
	void show() {
		System.out.println("Car");
	}
}
class Bike extends Vehicle{
	void show() {
		System.out.println("Bike");
	}
}
public class Main {

	

	public static void main(String[] args) {
		Vehicle obj=new Bike();
		Car obj2=(Car)obj;
		obj2.show();
	}

}
