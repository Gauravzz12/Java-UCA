package oop.abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ENTER PALTFORM NAME : ");
		String name = input.next();
		Platform obj = new Platform(name);
		System.out.println(obj.getPlatformName());
		obj.getLinkedinDetails();
	}

}
