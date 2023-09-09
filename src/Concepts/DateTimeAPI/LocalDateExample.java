package Concepts.DateTimeAPI;

import java.time.LocalDate;

public class LocalDateExample {

	private LocalDate date;
	
	public LocalDateExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Local Date");
		date = LocalDate.now();	
	}
	public void showTodayDate() {
		System.out.println("Today : " + date);
	}
	public void showCurrentYear() {
		System.out.println("Today : " + date.getYear());
	}
	public void showCurrentMonth() {
		System.out.println("Today : " + date.getMonth());
	}
	public void showCurrentMonthValue() {
		System.out.println("Month : " + date.getMonthValue());
	}
	public void showDayOfTheWeek() {
		System.out.println("Today : " +date.getDayOfWeek());
	}
	public void showDayOfTheMonth() {
		System.out.println("Today : " + date.getDayOfMonth());
	}
	public void showDayOfTheYear() {
		System.out.println("Today : " + date.getDayOfYear());
	}
	public void showNextDate() {
		System.out.println("Next Date : " + date.plusDays(1));
	}
	public void showPreviousDate() {
		System.out.println("Previous Date: " +date.plusDays(-1));
	}
	public void showPreviousMonth() {
		System.out.println("Previous Month : " + date.plusMonths(-1));
	}
	public void showNextWeek() {
		System.out.println("Next Week : " + date.plusWeeks(1));
	}
	public void showPreviousWeek() {
		System.out.println("Next Week : " + date.plusWeeks(-1));
	}
	public void showNextYear() {
		System.out.println("Next Year : " + date.plusYears(1));
	}
	public void showPreviousYear() {
		System.out.println("Next Week : " + date.plusYears(-1));
	}
	
	public void showLeapYear() {
		if(date.isLeapYear()) {
			System.out.println(date.getYear() + " is a leap Year.");
		}
		else {
			System.out.println(date.getYear() + " is not a leap Year.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateExample obj = new LocalDateExample();
		obj.showTodayDate();
		obj.showCurrentYear();
		obj.showCurrentMonth();
		obj.showDayOfTheWeek();
		obj.showDayOfTheMonth();
		obj.showDayOfTheYear();
		obj.showCurrentMonthValue();
		obj.showNextDate();
		obj.showNextWeek();
		obj.showNextYear();
		obj.showPreviousDate();
		obj.showPreviousMonth();
		obj.showPreviousWeek();
		obj.showPreviousYear();
		obj.showLeapYear();
		
	}

}
