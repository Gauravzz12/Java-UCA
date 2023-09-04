package QuestionPractice;

import java.util.Scanner;

public class nto1 {

	public nto1(int n) {
		while(n>1) {
			System.out.print(n--+",");
		}
		System.out.println(1);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		nto1 obj=new nto1(n);
		
	}

}
