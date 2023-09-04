package oop.inheritence.Multilevel;

public class GrandParent {
	private String _name;
	private boolean _isRegistered;
	
	
	public boolean get_isRegistered() {
		return _isRegistered;
	}

	public void set_isRegistered(boolean _isRegistered) {
		this._isRegistered = _isRegistered;
	}

	
	public GrandParent(String _name) {
		this._name=_name;
	}

	public String getName() {
		return _name;
	}

}
