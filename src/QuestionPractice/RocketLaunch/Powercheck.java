package QuestionPractice.RocketLaunch;

public class Powercheck {

	
	public String power_status(String fuel) {
		if(fuel.equalsIgnoreCase("ready")) {
			return "CHECK";
		}
		else {
			return "NOT CHECK";
		}

	}

}
