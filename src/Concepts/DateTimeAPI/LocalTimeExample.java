package Concepts.DateTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
	
	private LocalTime time;
	
	public LocalTimeExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Local Time");
		time=LocalTime.now();
	}
	public void showCurrentTime() {
		System.out.println("Time : " + time);
	}
	public void showCurrentHour() {
		System.out.println("Hour : " + time.getHour());
	}
	public void showCurrentMinute() {
		System.out.println("Minute : " + time.getMinute());
	}
	public void showCurrentSecond() {
		System.out.println("Second : " + time.getSecond());
	}
	public void showCurrentNano() {
		System.out.println("Nano Second: " + time.getNano());
	}
	public void showPositiveCounterInHour() {
		System.out.println("++COUNTDOWN++ : " + time.plusHours(24));    //CLOCK TIME
	}
	public void showNegativeCounterInHour() {
		System.out.println("--COUNTDOWN-- : " + time.minusHours(12));    //CLOCK TIME
	}
	public void shoeTimeWith_AM_PM() {
		
		//12 Hour Clock
		System.out.println(DateTimeFormatter.ofPattern("hh:mm").format(LocalTime.now()));
		
		//24 HourClock
		System.out.println(DateTimeFormatter.ofPattern("HH:mm").format(LocalTime.now()));
		
		//am or pm
		System.out.println(DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.now()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTimeExample obj = new LocalTimeExample();
		obj.showCurrentTime();
		obj.showCurrentHour();
		obj.showCurrentMinute();
		obj.showCurrentSecond();
		obj.showCurrentNano();
		obj.showPositiveCounterInHour();
		obj.showNegativeCounterInHour();
	}

}
