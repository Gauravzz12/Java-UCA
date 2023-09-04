import java.util.Scanner;

public class Arrays2D {

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
		
		System.out.println(sum +" "+middlesum);
		
		
	}

}
