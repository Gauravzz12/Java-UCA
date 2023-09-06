package Concepts.Generics;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
		
	public Unbounded() {
	}
	
	//Unbounded Wildcard
	public void printData(List<?> numbers) {
		
		int counter = 0;
		for(Object obj : numbers){
			counter++;
			if(counter/2 == 0) { System.out.print(obj); }else { System.out.print(" - " + obj); }
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Unbounded obj = new Unbounded();
		
		//For Integer
		List<Integer> iList = new ArrayList<>();
		
		iList.add(100);
		iList.add(200);
		iList.add(300);
		
		obj.printData(iList);
		
		
		//For String
		List<String> sList = new ArrayList<>();
		
		sList.add("Tim");
		sList.add("Tom");
		sList.add("Tum");
		
		obj.printData(sList);
		
		
	
	}

}
