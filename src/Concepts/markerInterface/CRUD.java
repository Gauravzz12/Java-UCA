package Concepts.markerInterface;

public class CRUD {
	Employee emp;
	Employee[][] arr=new Employee[3][2];
	public CRUD() {
		emp=new Employee();
	}
	
	public void getArray(Employee[][] arr) {
		this.arr=arr;
	}
	public int addEmployee(String id,String name) {
		if(emp instanceof Insertable) {
			emp.setId(id);
			emp.setName(name);
			return 1;
		}
		return 0;
	}
	
	
	
	public int deleteEmployee(String id) {
		
		if(emp instanceof Deletable) {
			System.out.println("Deleting an Employee of id : "+id);
			return 1;
		}
		return 0;
		
	}
	public int updateEmployee(String id,String id2,String name) {
		if(emp instanceof Updatable) {
			System.out.println("Updated Data of the Employee : "+name + " with id : "+id);
			return 1;
		}
		return 0;
	}
	
	public void showEmployees() {
		System.out.println(emp.getSerial_no()+")"+ " Id : "+ emp.getId() + " Name : "+ emp.getName());
	}
	

}
