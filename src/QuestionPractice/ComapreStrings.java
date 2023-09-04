package QuestionPractice;

public class ComapreStrings {

	public static void main(String[] args) {
		
		String a=new String("A");
		String b=new String("A");
		System.out.println(a==b);
		String c=a;
		System.out.println(c==a);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		String str="Hello World";
		System.out.println(String.join( "abc","-","hello","world"));
		String message = String.join("-", "Java", "is", "cool","ashjdhasd");
		System.out.println(message);
		
		}
}
