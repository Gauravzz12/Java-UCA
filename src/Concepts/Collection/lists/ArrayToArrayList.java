package Concepts.Collection.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] array=new String[] {"Steve","Tim","Lucy","Pat","Angela","Tom"};
		
		//1. Using Arrays.asList() Method
		
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(array));
		System.out.println(list);
		
		
		//2. Using Collection.addAll() Method
		ArrayList<String> list2=new ArrayList<String>();
		Collections.addAll(list2,array);
		System.out.println(list2);
		
		
		//3. Using Arraylist.addALl() Method
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.addAll(Arrays.asList(array));
		System.out.println(list3);
		
		
	}

}
