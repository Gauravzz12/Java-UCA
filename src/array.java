import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] icecream=new String[] {"Mango","Vanilla","Chocolate","BlackCurrent","Fruity"};
		Scanner scan=new Scanner(System.in);
		int[] iceCreamPrices=new int[] {30,25,35,45,20,40};
		for(int i=0;i<5;i++) {
			System.out.println("Ice-Cream at INDEX["+i+"]:"+icecream[i]);
		}
		Arrays.sort(icecream,2,4);
		for(String x:icecream) {
			System.out.println(x);
		}
		
//		int[] array=new int[5];
//		
//		for(int i=0;i<5;i++) {
//			array[i]=scan.nextInt();
//		}
//		for(int i=0;i<5;i++) {
//			System.out.println(array[i]);
//		
	Arrays.sort(iceCreamPrices);
		System.out.println(Arrays.binarySearch(iceCreamPrices, 45));
	System.out.println(Arrays.toString(iceCreamPrices));
	}
	
	

}
