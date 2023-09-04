package Concepts.Enums;
enum weekdays{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
enum Level{
	LOW,
	MEDIUM,
	HIGH
}
public class EnumClass {

	
	 public static void main(String[] args) {
	 
		weekdays _today=weekdays.FRIDAY;
		
		System.out.println("Today : "+_today);
		System.out.println("Length : "+weekdays.values().length);
		
		Level myVarLevel=Level.MEDIUM;
		System.out.println(myVarLevel);
	}

}
	

