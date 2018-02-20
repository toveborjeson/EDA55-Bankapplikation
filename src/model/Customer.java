package model;

import java.util.ArrayList;

public class Customer {
	private String name;
	private long idNr;
	private int customerNr;
	private ArrayList<BankAccount> accountList;
	/*
	 * Skapar den kund (kontoinnehavare) med namnet "name" och id-nummer "idNr".
	 * Kunden tilldelas också ett unikt kundnummer.
	 */
	public Customer(String name, long idNr) {
		this.setName(name);
		this.setIdNr(idNr);
	}

	/* Returnerar en strängbeskrivning av kunden. */
	public String toString() {
		return name + " " + idNr + " " + customerNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdNr() {
		return idNr;
	}

	public void setIdNr(long idNr) {
		this.idNr = idNr;
	}

	public int getCustomerNr() {
		return customerNr;
	}

	public void setCustomerNr(int customerNr) {
		this.customerNr = customerNr;
	}

}