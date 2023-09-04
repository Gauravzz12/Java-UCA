package oop.abstraction;
/*
 * ABSTRACT CLASS
 * 
 * Fields
 * Methods: (i) Simple methods 
 *         (ii) Abstract Method
 *         
 */

public abstract class Twitter {
	private String name;
	private static final String COMPLETE_NAME = "Twitter";
	private String foundedDate;
	private String url;
	private String country;
	private String founder;
	public Twitter(String name) {
		System.out.println("Socia Media PLatfroms -Linkedin");
			this.name=name;
	}
	//Non abstract Method
	public String getName() {
		return name;
	}
	//Abstract method
     public abstract void  getTwitterDetails();

}
