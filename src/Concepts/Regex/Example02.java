package Concepts.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example02 {

	public Example02() {
	}

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("Java");//regex
		Matcher matcher=pattern.matcher("JavaJavaJava");//text
		int matches=0;
		while(matcher.find()) {
		matches++;
		}
		System.out.println(matches);
	}

}
