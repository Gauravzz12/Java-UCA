package Concepts.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskedCreditCard {

	public static void main(String[] args) {
		String cardNumber="1234-2222-3333-0911";
		Pattern pattern= Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher= pattern.matcher(cardNumber);
		String maskedCardNumber=matcher.replaceAll("XXXX-XXXX-XXXX-");
		System.out.println(maskedCardNumber);

	}

}
