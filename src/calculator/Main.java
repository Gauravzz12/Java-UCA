package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner _input =new Scanner(System.in);
		System.out.print("Enter Value 1 : ");
		float Value1 = _input.nextFloat();
		System.out.println();
		System.out.print("Enter operator : ");
		String operator = _input.next();
		System.out.println();
		System.out.print("Enter Value 2 : ");
		float Value2 =_input.nextFloat();
		boolean firstIteration=true;
		float result = 0;
	while(true) {
			if(!firstIteration) {
				Value1= result;
				System.out.print("Enter operator(\"=\" to exit) : ");
				operator = _input.next();
				if(operator.equals("=")) {
					System.out.println("\nFinal Result is : " + result);
					break;
				}
				System.out.print("Enter  Value : ");
				Value2=_input.nextFloat();
			}
		switch (operator) {
		case "+":
			result=Addition.add(Value1, Value2);
			System.out.println("Current Output : "+ result);
			break;
		case "-":
			result=Subtraction.sub(Value1, Value2);
			System.out.println("Current Output : "+ result);
			break;
		case "*":
			result=Multiplication.Multiply(Value1, Value2);
			System.out.println("Current Output : "+ result);
			break;
		case "/":
			result=Division.Divide(Value1, Value2);
			System.out.println("Current Output : "+ result);
			break;

		default:
			System.out.println("Enter a Valid Operator");
			break;
		}
		firstIteration=false;
		
		
	}
		

	}

}
