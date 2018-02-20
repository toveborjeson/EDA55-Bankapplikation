package model;

public class BankAccount {
	private Customer holder;
	private int accountNumber;
	private double balance;

	/*
	 * Skapar ett nytt bankkonto åt en innehavare med namn "holderName" och
	 * "holderId". Kontot tilldelas ett unikt kontonummer och innehåller
	 * inledningsvis 0 kr.
	 */
	public BankAccount(String holderName, long holderId) {
		this.holder.setIdNr(holderId);
		this.holder.setName(holderName);
	}

	/*
	 * Skapar ett nytt bankkonto med innehavare 'holder'. Kontot tilldelas ett unikt
	 * kontonummer och innehåller inledningsvis 0 kr.
	 */
	public BankAccount(Customer holder) {
		this.holder = holder;
	}

	public Customer getHolder() {
		return holder;
	}

	public void setHolder(Customer holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Du har för lite pengar på kontot!");
		}
	}

	/* Returnerar en strängrepresentation av bankkontot. */
	public String toString() {
		return holder.getName() + " " + holder.getIdNr() + " " + accountNumber;
	}
}
