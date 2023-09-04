package Concepts.threads;

public class ProcessByThreadClass extends Thread {

	public ProcessByThreadClass()  {

	}
	@Override
	public void run() {
		System.out.println("Inside Run: "+ Thread.currentThread().getName());
//		System.out.println("Child Thread is Running");
	}

	public static void main(String[] args) {	
		System.out.println("Inside : "+ Thread.currentThread().getName());
		//ProcessByThreadClass obj=new ProcessByThreadClass();
	//Thread objThread=new Thread(obj);
	Thread objThread=new ProcessByThreadClass();
		objThread.start();
		System.out.println("Main Thread is Running");
	}

}
