package oop.abstraction.advanced;
/*
 * ABSTRACT CLASS
 * 
 * Fields
 * Methods: (i) Simple methods 
 *         (ii) Abstract Method
 *         
 */
public abstract class AbstractPlatform implements SocialMediaPlatform {
	private static final String COMPLETE_NAME = "ABSTRACTED PLATFORM";
	private String name;
	private String foundedDate;
	private String url;
	private String country;
	private String founder;
	public AbstractPlatform(String name) {
		System.out.println("Socia Media PLatfroms -Linkedin");
			this.name=name;
	}
	//Non abstract Method
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	 public String geturl() {
		 return url;
	 }
	 public void seturl(String url) {
		 this.url=url;
	 }
	 public String getcountry() {
		 return country;
	 }
	 public void setcountry(String country) {
		 this.country=country;
	 }
	 public String getfounder() {
		 return founder;
	 }
	 public void setfounder(String founder) {
		 this.founder=founder;
	 }
	 public String getfoundedDate() {
		 return foundedDate;
	 }
	 public void setfoundedDate(String foundedDate) {
		 this.foundedDate=foundedDate;
	 }
	//Abstract method
     public abstract void  getAllPlatformDetails();

}
