package QuestionPractice;
class A{
	void show() {
		System.out.println("In A");
	}
	void print() {
		System.out.println("in A Print");
	}
	
}
class B extends A{
	@Override
	void show() {
		System.out.println("In B");
	}
	void print() {
		System.out.println("In B Print");
	}
	void asd() {
		System.out.println("asd");
	}
}
public class Annotations {


	
	
	public static void main(String[] args) {
		A obj=new B();
		B obj2=(B)obj; 
		obj.print();
		obj2.print();
		obj2.asd();
	}


}