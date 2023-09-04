package Concepts.threads.Bank;


public class Deposit implements Runnable {
	private Double amount;
	private Transaction objT;
	
	public Deposit(Transaction objT,Double amount) {
		this.objT=objT;
		this.amount=amount;
	}
	public void run() {
		objT.depositTransactionService(amount);
	}

}
