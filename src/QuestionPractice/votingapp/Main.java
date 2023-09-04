package QuestionPractice.votingapp;

import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("VOTING APP");
		
		System.out.print("Enter Your Age : ");
		int age=in.nextInt();
		System.out.print("\nEnter Your Nationality : ");
		String nationality=in.next();
		checkAge obj1 = new checkAge();
		boolean isAge= obj1.isEligibleAge(age);
		checkNationality obj2=new checkNationality();
		boolean isNationality=obj2.isEligibleNationality(nationality);
		
		if(isAge && isNationality) {
			System.out.println("YOU ARE ELIGIBLE FOR VOTING");
			
		}
		else {
			if(!isAge && isNationality) {
				System.out.println("Wait for "+(18-age)+" Years");
			}
			else if(!isNationality && isAge) {
				
				System.out.println("You are not of INDIAN nationality");
			}
			else {
				System.out.println("You can not vote");
			}
		}
	}
}

