package Concepts.anonymous;
public class HelloWorldAnonymousClass {

		interface HelloWorld{
			public void greetings(String greet);
	}
		
		public void sayHello() {
			
			//Simple (Local) Inner Class
			class EnglishGreeting implements HelloWorld{
				public void greetings(String eGreet) {
					System.out.println("English " + eGreet);
				}
			};
			
			HelloWorld englishGreeting=new EnglishGreeting();
			
			//Anonymous Class
			HelloWorld frenchGreeting=new HelloWorld() 
			
											{
												public void greetings(String fgreet) {
												System.out.println("French : "+fgreet);
											}
											};
			
			//Anonymous Class
			HelloWorld spanishGreeting=new HelloWorld() 
											
											{
				
												public void greetings(String sgreet) {
												System.out.println("Spanish : "+sgreet);
											}
											};
			
			
			HelloWorld germanyGreeting=new HelloWorld()
			
											{
				
												public void greetings(String ggreet) {
												System.out.println("German : "+ggreet);
											}
											};
			
			HelloWorld hindiGreeting=new HelloWorld()
			
											{
				
												public void greetings(String hgreet) {
												System.out.println("Hindi : "+hgreet);
											}	
											};
			
			englishGreeting.greetings("Hello");
			frenchGreeting.greetings("Bonjour");
			spanishGreeting.greetings("Hola");
			germanyGreeting.greetings("Hallo");
			hindiGreeting.greetings("Namsate");
		}

	public static void main(String[] args) {
		HelloWorldAnonymousClass obj =new HelloWorldAnonymousClass();
		obj.sayHello();
	}

}
