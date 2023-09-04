package Concepts.threads.Shared_Counter;

public class SharedCounter {
	static int counter=5;
	
	//Incrementing the Value
	public void IncreaseByOne() {
		for(int i=0;i<10;i++) {
			System.out.println("After INCREMENT : "+ ++counter);
		}
	}
	//Decrementing the Value
	public void DecreaseByOne() {
		for(int i=0;i<10;i++) {
			System.out.println("After DECREMENT : "+ --counter);
		}
	}
	
	public  int getCounter() {
		return counter;
		
	}
	

	

}
