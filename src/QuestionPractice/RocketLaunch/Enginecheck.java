package QuestionPractice.RocketLaunch;

public class Enginecheck  {

	
	public String engine_status(String fuel) {
		if(fuel.equalsIgnoreCase("ready")) {
			return "CHECK";
		}
		else {
			return "NOT CHECK";
		}

	}

}
