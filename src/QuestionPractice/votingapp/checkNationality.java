package QuestionPractice.votingapp;

public class checkNationality {

	public boolean isEligibleNationality(String nationality) {
		if(nationality.equalsIgnoreCase("INDIA"))
			return true;
		return false;
	}
}
