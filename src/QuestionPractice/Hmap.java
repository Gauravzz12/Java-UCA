package QuestionPractice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.Soundbank;

public class Hmap {

	public static void main(String[] args) {
//		  int [] arr=new int[] {1,2,2,11,1,1,3,4,55,5,5,6,4,4,4};
//		  HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
//		  for(int i=0;i<arr.length;i++) {
//			  if(map.containsKey(arr[i])) {
//				  map.put(arr[i], map.get(arr[i])+1);
//			  }
//			  else {
//				  map.put(arr[i], 1);
//			  }
//		  }
//		  for( Map.Entry<Integer,Integer> entry:map.entrySet()) {
//			  System.out.println("ELEMENT | Frequency");
//			  System.out.println(entry.getKey() + "            "+entry.getValue());
//		  }
		  
		  
		  ArrayList<Integer>list=new ArrayList<Integer>();
		  list.add(3);
		  list.add(2);
		  list.add(1);
		  Collections.sort(list);
		  System.out.println(list);
		  
	}

}
