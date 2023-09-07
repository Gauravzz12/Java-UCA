package Concepts.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {

	public Example03() {
		
	}

	public static void main(String[] args) {
		Example03 obj=new Example03();
		int matches=obj.runTest(".","1234567.89");
		System.out.println(matches);
	}

	public int runTest(String regex, String text) {
		
		
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(text);
			int matches=0;
			while(matcher.find()) {
				matches++;
			}
			
			return matches;
	
	}

}
