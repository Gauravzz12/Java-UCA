package QuestionPractice.RocketLaunch;

public class Oxygencheck {

	
	public String oxygen_status(String fuel) {
		if(fuel.equalsIgnoreCase("ready")) {
			return "CHECK";
		}
		else {
			return "NOT CHECK";
		}

	}

}
