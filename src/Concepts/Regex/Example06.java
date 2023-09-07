package Concepts.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example06 {

	public Example06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String regex="Python";
		String senetence="Python Regular Expression -In Python ";
		String replaceString ="Java";
		System.out.println("Before replacing "+senetence);
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(senetence);
		senetence=matcher.replaceAll(replaceString);
		System.out.println("After Replacing : "+senetence);}

}
