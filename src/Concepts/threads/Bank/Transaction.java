package Concepts.threads.Bank;
public class Transaction {
	
	private static final int DELAY=5000;
	Account account;
	public Transaction() {
		account=new Account();
		
	}
	public  synchronized void depositTransactionService(Double amount) {
	//public  void depositTransactionService(Double amount) {
		System.out.println("Before Deposit : "+account.getBalance());
		Double balance=account.getBalance() + amount;
		account.setBalance(balance);
		try {
			Thread.sleep(DELAY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After Deposit : "+account.getBalance());
	}
	public synchronized void withdrawlTransactionService(Double amount) {
	//public  void withdrawlTransactionService(Double amount) {
		System.out.println("Before Withdrawl : "+account.getBalance());
		Double balance=account.getBalance() - amount;
		account.setBalance(balance);
		try {
			Thread.sleep(DELAY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After WithDrawl : "+account.getBalance());
	}
}
