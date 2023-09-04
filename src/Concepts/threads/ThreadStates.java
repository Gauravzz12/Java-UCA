package Concepts.threads;

public class ThreadStates {

	public ThreadStates() {
for(Thread.State c : Thread.State.values())
	System.out.println(c);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ThreadStates obj=new ThreadStates();
	}

}
