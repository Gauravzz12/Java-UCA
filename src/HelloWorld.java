
public class HelloWorld {

	public HelloWorld() {
		
	}
	
	static {
		System.out.println("Static-Block");
	}

	static void staticMethod() {
		System.out.println("static-Method");
	}
	
	static public   void main(String[] args) {	
		HelloWorld obj;
		obj = new HelloWorld();
		System.out.println("object = "+obj);
		
		HelloWorld.staticMethod();
	}
	
	{//Init-Block
		System.out.println("Just a block");
	}
}