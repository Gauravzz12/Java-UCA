package QuestionPractice.RocketLaunch;

import java.util.Scanner;

public class Launch_status {
private String fuel;
private String oxygen;
private String power;
private String engine;


	public Launch_status() {
		
		Scanner in=new Scanner(System.in);
		
		Fuelcheck FUEL=new Fuelcheck();
		Oxygencheck OXYGEN=new Oxygencheck();
		Powercheck POWER=new Powercheck();
		Enginecheck ENGINE=new Enginecheck();
		
		System.out.println("Enter Fuel Status : ");
		fuel=FUEL.fuel_status(in.next());
		System.out.println("Enter Oxygen Status : ");
		oxygen=OXYGEN.oxygen_status(in.next());
		System.out.println("Enter Power Status : ");
		power=POWER.power_status(in.next());
		System.out.println("Enter Engine Status : ");
		engine=ENGINE.engine_status(in.next());
		
		
		System.out.println("FUEL STATUS : " + fuel);
		System.out.println("OXYGEN STATUS : " + oxygen);
		System.out.println("POWER STATUS : " + power);
		System.out.println("ENGINE STATUS : " + engine);
		
		if(fuel.equals("CHECK") && oxygen.equals("CHECK") && power.equals("CHECK") && engine.equals("CHECK")) {
			launch();
		}
		else {
			abort();
		}
		
		
	}
	
	 public static void abort() {
	        String rocketAsciiArt =
	                "        ^\n" +
	                "       / \\\n" +
	                "      /   \\\n" +
	                "     /_____\\\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "    /|\\   /|\\\n" +
	                "   /_|_\\ /_|_\\\n";

	        String abortedMessage = "Launch Aborted";

	        System.out.println(rocketAsciiArt);
	        System.out.println(abortedMessage);
	 }
	
	 public static void launch() {
	        String rocketAsciiArt =
	                "        ^\n" +
	                "       / \\\n" +
	                "      /   \\\n" +
	                "     /_____\\\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "     |     |\n" +
	                "    /|\\   /|\\\n" +
	                "   /_|_\\ /_|_\\\n";

	        String launchMessage = "Launch Successful";

	        System.out.println(rocketAsciiArt);
	        System.out.println(launchMessage);
	    }

}
