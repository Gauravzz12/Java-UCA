package Concepts.threads;
class DemoTimedWaitingRunnable implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("> "+Thread.currentThread().getState());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
}
public class TimedWaitingState {

	public static void main(String[] args)  throws InterruptedException{
		DemoTimedWaitingRunnable runnable=new DemoTimedWaitingRunnable();
		Thread t1=new Thread(runnable);
		t1.start();
		Thread.sleep(1000);
		System.out.println(t1.getState());
	//	Thread.sleep(4000);
	//  System.out.println(t1.getState());
		System.out.println(t1.isAlive());
		
	}

}
