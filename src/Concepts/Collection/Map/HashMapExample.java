package Concepts.Collection.Map;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public HashMapExample() {

	}

	public static void main(String[] args) {
		HashMap<Integer, String>data=new HashMap<>();
				
		//Put is used to add or update value
		data.put(101,"Mercury");
		data.put(102,"Venus");
		data.put(103,"Earth");
		data.put(104,"Mars");
		data.put(105,"Saturn");
		data.put(106,"Jupiter");
		data.put(107,"Uranus");
		data.put(108,"Pluto"); //wrong 
		data.put(108,"Neptune"); //corrected
		
		System.out.println(data.size());  
		System.out.println(data.get(103));
		System.out.println(data.containsKey(103));
		System.out.println(data.remove(103));
		System.out.println(data.containsKey(103));
		
		//How to print values
		//1 Print method
			System.out.println(data);
		//2 entrySet() Method
		for(Map.Entry<Integer,String>entry :data.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		//3 keySet() Method
		for(Integer key:data.keySet()) {
			System.out.println(key);
		}
		
		//4 values() Method
		
		for(String value:data.values()) {
			System.out.println(value);
		}
		
		//5 forEach Loop
		
		data.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		});
		
		
	}

}
