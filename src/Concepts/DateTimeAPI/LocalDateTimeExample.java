package Concepts.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateTimeExample {

	private LocalDateTime dt;
	
	public LocalDateTimeExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Local Time");
		dt=LocalDateTime.now();
	}
	
	public void showLocalDate() {
		System.out.println("Date : " + dt.toLocalDate());
	}
	public void showLocalTime() {
		System.out.println("Time : " + dt.toLocalTime());
	}
	public void showLocalDateTimeOf() {
		dt= LocalDateTime.of(2023, Month.SEPTEMBER,1 ,5 ,14);
		System.out.println(dt);
	}
	public void showLocalDateInFormat() {
		String localDate = dt.format(DateTimeFormatter.ISO_DATE);
		System.out.println(localDate);
	}
	public void showLocalTimeInFormat() {
		String localDate = dt.format(DateTimeFormatter.ISO_TIME);
		System.out.println(localDate);
	}

	
	//AS DATE
	public void showCurrentYear() {
		System.out.println("Year : " +dt.getYear());
	}
	public void showCurrentMonth() {
		System.out.println("Month : " + dt.getMonth());
	}
	public void showDayOfTheWeek() {
		System.out.println("Day : " + dt.getDayOfWeek());
	}
	public void showDayOfTheMonth() {
		System.out.println("Day : " + dt.getDayOfMonth());
	}
	public void showDayOfTheYear() {
		System.out.println("Day : " + dt.getDayOfYear());
	}
	
	//AS TIME
	public void showCurrentHour() {
		System.out.println("Hour : " +dt.getHour());
	}
	public void showCurrentMinute() {
		System.out.println("Minute : " +dt.getMinute());
	}
	public void showCurrentSecond() {
		System.out.println("Second : " +dt.getSecond());
	}
	
	
	public void showCustomLocalDate() {
		String localDateUSA = dt.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		String localDateUK = dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(localDateUSA);
		System.out.println(localDateUK);
	}
	
	//SHORT,MEDIUM,FULL
	public void showCustomLocalDateTime() {
		String localDateUSA = dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK));
		String localDateUK = dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.US));
		System.out.println(localDateUSA);
		System.out.println(localDateUK);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTimeExample obj = new LocalDateTimeExample();
		
		obj.showLocalDate();
		obj.showLocalTime();
		obj.showLocalDateInFormat();
		obj.showLocalTimeInFormat();
		obj.showLocalDateTimeOf();
		
		obj.showCurrentYear();
		obj.showCurrentMonth();
		obj.showDayOfTheWeek();
		obj.showDayOfTheMonth();
		obj.showDayOfTheYear();
		
		obj.showCustomLocalDate();
		obj.showCustomLocalDateTime();
	}

}


//Print Calender of Current Month
//Day wise Date