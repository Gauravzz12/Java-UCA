package oop.abstraction.advanced;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("ENTER PLATFORM NAME : ");
		String name = input.next();
		Platform obj = new Platform(name);
		System.out.print("ENTER PLATFORM URL : ");
		String url = input.next();
		obj.setPlatformurl(url);
		System.out.print("ENTER PLATFORM COUNTRY : ");
		String country = input.next();
		obj.setPlatformcountry(country);
		System.out.print("ENTER PLATFORM FOUNDER : ");
		String founder = input.next();
		obj.setPlatformfounder(founder);
		System.out.print("ENTER PLATFORM FoundedDate : ");
		String FoundedDate = input.next();
		obj.setfoundedFoundedDate(FoundedDate);
		
		//to see all details
		
		obj.getAllPlatformDetails();
	}

}
