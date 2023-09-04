package Concepts.markerInterface;
public class Employee implements Insertable,Deletable,Updatable{

	private int serial_no;
	private String id;
	private String name;
	
	
	public Employee() {
		
	}
	
	
	public int getSerial_no() {
		return serial_no;
	}


	public void setSeriial_no(int seriial_no) {
		this.serial_no = seriial_no;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		++serial_no;
		this.name = name;
	}


	
	
}
