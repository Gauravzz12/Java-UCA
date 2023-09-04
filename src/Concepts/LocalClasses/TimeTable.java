package Concepts.LocalClasses;

public class TimeTable {
	
	private int time;
	private String[] activities;

	private static final int EXPECTED_ACTIVITIES = 10; //Total Activities : 25

	public TimeTable() {
		activities=new String[25];
	}
	public void morningTimeTable(int time) {

		class Morning{
			public void wakeUp(int time) {
				System.out.println("WakeUp Time : " + time);
			}
			public String[] getActivitieStrings() {
				String[] morning_activities=new String[EXPECTED_ACTIVITIES];//Max 10 Activities
				
				return morning_activities;
			}
		}
		
		Morning objM=new Morning();
		objM.wakeUp(time);
		
	}
	
	public void noonTimeTable(int time) {

		class AfterNoon{
			public void wakeUp(int time) {
				System.out.println("WakeUp Time : " + time);
			}
			public String[] getActivitieStrings() {
				String[] morning_activities=new String[EXPECTED_ACTIVITIES];//Max 10 Activities
				
				return morning_activities;
			}
		}
		
		AfterNoon objM=new AfterNoon();
		objM.wakeUp(time);
		
	}
	
	public void EveningTimeTable(int time) {

		class Evening{
			public void wakeUp(int time) {
				System.out.println("WakeUp Time : " + time);
			}
			public String[] getActivitieStrings() {
				String[] morning_activities=new String[EXPECTED_ACTIVITIES];//Max 10 Activities
				
				return morning_activities;
			}
		}
		
		Evening objM=new Evening();
		objM.wakeUp(time);
	}
	

	public static void main(String[] args) {

		TimeTable obj=new TimeTable();
		int time=5;
		obj.morningTimeTable(time);
		obj.noonTimeTable(time);
		obj.EveningTimeTable(time);
	}

	

}
