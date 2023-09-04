package oop.inheritence.Multilevel;

public class Father extends GrandParent {
	private boolean reRegistration; 
	
	public boolean isReRegistration() {
		return reRegistration;
	}

	public void setReRegistration(boolean reRegistration) {
		this.reRegistration = reRegistration;
	}

	public Father(String _name) {
		super(_name);
	}
	
}
