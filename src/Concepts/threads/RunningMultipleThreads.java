package Concepts.threads;
public class RunningMultipleThreads extends Thread {

	public RunningMultipleThreads() {
		System.out.println("Multiple Threads");
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		RunningMultipleThreads obj=new RunningMultipleThreads();
		Thread T1=new Thread(obj);
		Thread T2=new Thread(obj);
		Thread T3=new Thread(obj);
		T1.start();
		T2.start();
		T3.start();
	}

}
