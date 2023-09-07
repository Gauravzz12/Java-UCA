package Concepts.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example01 {

	public Example01() {
	}

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("Java");
		Matcher matcher=pattern.matcher("java");
		System.out.println(matcher.find());
	}

}
