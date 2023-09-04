package oop.abstraction;
/*
 * ABSTRACT CLASS
 * 
 * Fields
 * Methods: (i) Simple methods 
 *         (ii) Abstract Method
 *         
 */

public abstract class Linkedin {
	private String name;
	private static final String COMPLETE_NAME = "LINKEDIN";
	private String foundedDate;
	private String url;
	private String country;
	private String founder;
	public Linkedin(String name) {
		System.out.println("Socia Media PLatfroms -Linkedin");
			this.name=name;
	}
	//Non abstract Method
	public String getName() {
		return name;
	}
	//Abstract method
     public abstract void  getLinkedinDetails();

}
