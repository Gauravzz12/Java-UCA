package Concepts.threads;

 class Car  extends Thread{

	public Car(String str) {
		super(str);
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+" "+getName());
			try {
				sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("DONE! "+getName() );
	}
 }
 public class Race{
	 public Race() {
		 
	 }
	public static void main(String[] args) {
		new Car("HONDA").start();
		new Car("MITSUBISHI").start();
		new Car("YAMAHA").start();
		
	}

}
