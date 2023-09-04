package Concepts.threads;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		Thread _processThread_01=new Thread(new ProcessThreads(),"Process Threads_01");
		Thread _processThread_02=new Thread(new ProcessThreads(),"Process Threads_02");
		Thread _processThread_03=new Thread(new ProcessThreads(),"Process Threads_03");
		_processThread_01.start();
		_processThread_01.join();
		_processThread_02.start();
		_processThread_02.join();
		_processThread_03.start();
		_processThread_03.join();
		
	
	}

}
