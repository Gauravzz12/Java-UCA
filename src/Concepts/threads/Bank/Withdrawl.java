package Concepts.threads.Bank;


public class Withdrawl implements Runnable {
	private Double amount;
	private Transaction objT;
	
	public Withdrawl(Transaction objT,Double amount) {
		this.objT=objT;
		this.amount=amount;
	}
	public void run() {
		objT.withdrawlTransactionService(amount);
	}

}
