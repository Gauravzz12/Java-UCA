package Concepts.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example05 {

	public Example05() {
		
	}

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("University+",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("University Chitkara  UNIVERSITY");
		while(matcher.find()) {
			System.out.println("Match Found from "+matcher.start()+" and ends at "+(matcher.end()-1)+".");
		}
	}

}
