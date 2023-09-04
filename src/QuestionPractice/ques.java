package QuestionPractice;

interface GrandParent {
	public void suggestion();
	public void instruction();
}

abstract class Parent {
	public abstract void suggestion();	
	public void instruction() {
		System.out.println("Parent");
	}
}

class Child extends Parent implements GrandParent{

	@Override
	public void suggestion() {
		System.out.print("Child obeys the suggestions by ");		
	}
	
	@Override
	public void instruction() {
		System.out.print("Child follows the instructions by ");
	}
	
}


public class ques {

	public static void main(String[] args) {
		
		GrandParent obj1  = new Child();
		Parent obj2 = (Parent) obj1;
		obj2.instruction();
		System.out.println(obj2.getClass().getSimpleName());
	
	}

}
