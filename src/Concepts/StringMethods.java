package Concepts;

public class StringMethods {

	public StringMethods() {
		String _string=new String ("Solar System");
		
		System.out.println(_string.charAt(0));
		System.out.println(_string.length());
		System.out.println(_string.toLowerCase());
		System.out.println(_string.toUpperCase());
		
		String string =new String("our Universe");
		_string=_string.concat(" "+string);
		System.out.println(_string);
		System.out.println(string.substring(2,9));
		char[] c=string.toCharArray();
		for(char x:c) {
			System.out.print(x);
		}
	}

	public static void main(String[] args) {
		
		StringMethods obj=new StringMethods();
		System.out.println(obj.getClass());
	}

}
