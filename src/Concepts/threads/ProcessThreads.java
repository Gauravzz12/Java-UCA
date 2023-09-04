package Concepts.threads;


public class ProcessThreads implements Runnable{

	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("Thread Started  : "+t.getName());
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Thread Ended  : "+t.getName());

	}
	

}
