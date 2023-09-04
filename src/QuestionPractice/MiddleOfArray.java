package QuestionPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleOfArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter No. Of Rows : ");
		int m=in.nextInt();
		System.out.println("Enter No. Of Columns : ");
		int n=in.nextInt();
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for (int j = 0; j < n; j++) {
				array[i][j]=in.nextInt();
			}
		}
		System.out.print("middle of the array is : ");
		System.out.println(array[m/2][n/2]);
		
	}

}
