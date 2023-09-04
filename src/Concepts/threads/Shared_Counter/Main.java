package Concepts.threads.Shared_Counter;

public class Main{

	public static void main(String[] args) {
		final SharedCounter obj=new SharedCounter();
		Thread t1=new Thread() {
			
			@Override
			public void run() {
				obj.IncreaseByOne();
			}
		};
		Thread t2=new Thread() {
			
			@Override
			public void run() {
				obj.DecreaseByOne();
			}
		};
		t1.start();
		t2.start();
		
		
	}

}
