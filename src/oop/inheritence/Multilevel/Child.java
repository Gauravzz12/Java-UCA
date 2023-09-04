package oop.inheritence.Multilevel;

public class Child extends Father{
	
	private boolean isModified;
	
	public Child(String _name) {
		super(_name);
	}
	public boolean isModified() {
		return isModified;
	}

	public void setModified(boolean isModified) {
		this.isModified = isModified;
	}

	

	

}
