package Concepts.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example07 {

	public Example07() {
	}

	public static void main(String[] args) {
//		Pattern pattern=Pattern.compile("Flight No. : \\d\\d\\d\\d"); //for the exact digits
//		Pattern pattern=Pattern.compile("Flight No. : \\d{4}");//for 4 or more integers
//		Pattern pattern=Pattern.compile("Flight No. : 1024");
//		Pattern pattern=Pattern.compile("Flight No. : \\d{2,4}");//for min-2 and max-4 integers
//		Pattern pattern=Pattern.compile("^Flight No. : \\d{3,}$");//starts with ^ and ends with $
//		Pattern pattern=Pattern.compile("[f|F]light No. : \\d{4}");//will work for f and F both
		Pattern pattern=Pattern.compile("(F|f|AF)light No. : \\d{4}");//for multiple options


		Matcher matcher=pattern.matcher("AFlight No. : 1024");
		
		boolean matchFound=matcher.find();
		System.out.println(matchFound);
	}

}
