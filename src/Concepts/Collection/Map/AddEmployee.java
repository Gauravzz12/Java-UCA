package Concepts.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AddEmployee {

	private static Scanner input;
	private int N;
	public static final int Total_DATA=4;
	private Map<String,List<String>>map;
	private List<String> list=new ArrayList<>();
	static {
		input=new Scanner(System.in);
	}
	public AddEmployee(int N) {
		N=input.nextInt();
		this.N=N;
	}
	public int getN() {
		return N;
	}
	public void  addEmployee(int total_employees) {
		String emp_id=null;
		map=new HashMap<>();
		for (int i = 0;i<total_employees;i++) {
			list=new ArrayList<>();
			emp_id=input.next();

			for(int j=0;j<Total_DATA;j++) { //Name - Location -TeamName -Salary
				list.add(input.next());
			}
			map.put(emp_id, list);
		}
		
		
	}
	
	public void showEmployees() {
		for(Entry<String, List<String>> entry :map.entrySet()) {
			System.out.println(entry.getKey() + " - "+ entry.getValue());
		}
	}
	public static void main(String[] args) {
		int N=0;
		AddEmployee obj=new AddEmployee(N);
		obj.addEmployee(obj.getN());
		obj.showEmployees();
	}
		
	
}
