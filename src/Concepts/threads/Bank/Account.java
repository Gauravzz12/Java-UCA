package Concepts.threads.Bank;

public class Account {
	private static Double balance=(double)1000;
	public Account() {
	}
	public Double getBalance() {
		return balance;

	}
	public void setBalance(Double balance) {
		Account.balance=balance;
	}

}
