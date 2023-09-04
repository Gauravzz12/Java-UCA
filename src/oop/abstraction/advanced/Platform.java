package oop.abstraction.advanced;

public  class Platform extends AbstractPlatform{
	
	public Platform(String name) {
		super(name);
		System.out.print("Platforms : ");
	}
	/*
	 * public String getPlatformName() {
	 * return getName();
	 * }
	 */
	@Override
	public void setname(String name) {
		setname(name);
	}
	 public void setPlatformurl(String url) {
		 seturl(url);	 }
	 public void setPlatformcountry(String country) {
		setcountry(country);
	 }
	 public void setPlatformfounder(String founder) {
		 setfounder(founder);
	 }
	 public void setfoundedFoundedDate(String foundedDate) {
		 setfoundedDate(foundedDate);
	 }	
	@Override
	public  void  getAllPlatformDetails() {
		System.out.println("All Platform details  : ");
		System.out.println(getName());
		System.out.println(geturl());
		System.out.println(getcountry());
		System.out.println(getfounder());
		System.out.println(getfoundedDate());
	}	
	
}

