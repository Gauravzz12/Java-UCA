package oop.abstraction;


public  class Platform extends Linkedin{
	
	
	public Platform(String name) {
		super(name);
		System.out.print("Platforms : ");
		
		
	}
	
	public String getPlatformName() {
		String name=getName();
		return name;
	}
	@Override
	public  void  getLinkedinDetails() {
		System.out.println("getLinkedinDetails()");
	}

	
	
}
