package QuestionPractice;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class GreaterBorderSum {

	public static void main(String[] args) {
		int m,n;
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
		int array[][]=new int[m][n];
		
		int sum=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=in.nextInt();
				if(i==0 || i==m-1 ||j==0 ||j==n-1) {
					sum+=array[i][j];
				}

			}
		}
		int middle =array[m/2][n/2];
		int middlesum=0;
		
		for(int i=m/2-1;i<=m/2+1;i++) {
			for (int j = n/2-1; j <= n/2+1; j++) {
				middlesum+=array[i][j];
			}
		}
		middlesum-=middle;
		System.out.println(sum +" "+middlesum);
		System.out.println("Greater Border sum : "+ Math.max(sum, middlesum));
		
	}

}
