package entities;

public class Account {
	
	private final int NUMBER;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.NUMBER = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		this.NUMBER = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return NUMBER;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double quantity) {
		this.balance += quantity ;
	}

	public void withdraw(double quantity) {
		this.balance -= quantity - 5.00;
	}
	
	public String toString() {
		return
			  "Account "
			  + NUMBER
			  + " Holder "
			  + holder
			  + " Balance $"
			  + String.format("%.2f", balance);
	}
}
