package Concepts.threads;

public class ProcessByRunnableInterface  implements Runnable {

	public ProcessByRunnableInterface()  {
	
	}
	@Override
	public void run() {
		System.out.println("Inside Run : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {	
		System.out.println("Inside : "+ Thread.currentThread().getName());
		ProcessByRunnableInterface obj=new ProcessByRunnableInterface();
		Thread objThread=new Thread(obj);
		objThread.start();
		System.out.println("Main Thread is Running");
	
	}
}
