package oop.inheritence.Multilevel;
import java.util.Scanner;
/*
 * GrandPArent Bought car -Honda/Registration
 * Father got this from his father- Re-registered
 * Child get this car from his father - Modified
 */
public class Main {
	public static void main(String[] args) {
		Scanner _input =new Scanner(System.in);
		System.out.print("Car Name: ");
		String _name = _input.next();
		Child obj=new Child(_name);
		System.out.println(obj.getName());
		
		//Did you modify the car?
		obj.set_isRegistered(true);
		if(obj.get_isRegistered()){
		
			obj.setReRegistration(true);
			if(obj.isReRegistration()) {
		System.out.println("Did you modify the car?");
		String _sModified=_input.next();
		if(_sModified.equals("YES")) {
			obj.setModified(true);
			System.out.println("Great Job");
		}
		else {
			System.out.println("NO Problem,Old is Gold");
		}
			}
			else {
				System.out.println("Sorry,You cannot use this car");
			}	
		}	
	}
}
