package QuestionPractice.RocketLaunch;


public class Fuelcheck  {
	
	public String fuel_status(String fuel) {
		if(fuel.equalsIgnoreCase("ready")) {
			return "CHECK";
		}
		else {
			return "NOT CHECK";
		}

	}

}
