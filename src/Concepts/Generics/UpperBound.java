package Concepts.Generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
		
	public UpperBound() {
	}
	
	//UpperBound Wildcard
	public void printData(List<? extends Number> numbers) {
		
		int counter = 0;
		for(Object obj : numbers){
			counter++;
			if(counter/2 == 0) { System.out.print(obj); }else { System.out.print(" - " + obj); }
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		UpperBound obj = new UpperBound();
		
		//For Integer
		List<Integer> iList = new ArrayList<>();
		
		iList.add(100);
		iList.add(200);
		iList.add(300);
		
		obj.printData(iList);
		
		
		
		//For Double
		List<Double> dList = new ArrayList<>();
		
		dList.add(100.00);
		dList.add(200.00);
		dList.add(300.00);
		
		obj.printData(dList);
		
		
		/*
		//For String
		List<String> sList = new ArrayList<>();
		
		sList.add("Tim");
		sList.add("Tom");
		sList.add("Tum");
		
		obj.printData(sList);
		*/
		
	
	}

}
