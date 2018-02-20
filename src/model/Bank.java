package model;

import java.util.ArrayList;

public class Bank {
	/* Skapar en ny bank utan konton. */
	private String holderName;
	private long idNr;
	private int accountNumber;
	
	
	
	public Bank() {
		
	}

	/*
	 * Öppna ett nytt konto i banken. Om det redan finns en kontoinnehavare med de
	 * givna uppgifterna ska inte en ny Customer skapas, utan istället den
	 * befintliga användas. Det nya kontonumret returneras.
	 */
	public int addAccount(String holderName, long idNr) {
		return 0;
	}

	/*
	 * Returnerar den kontoinnehavaren som har det givna id-numret, eller null om
	 * igen sådan finns.
	 */
	public Customer findHolder(long idNr) {
		return 0;
	}

	/*
	 * Tar bort konto med nummer 'number' från banken. Returnerar true om kontot
	 * fanns (och kunde tas bort), annars false.
	 */
	public boolean removeAccount(int number) {
		return 0;
	}

	/*
	 * Returnerar en lista innehållande samtliga bankkonton i banken. Listan är
	 * sorterad på kontoinnehavarnas namn.
	 */
	public ArrayList<BankAccount> getAllAccount() {
		return 0;
	}

	/*
	 * Söker upp och returnerar bankkontot med kontonummer 'accountNumber'.
	 * Returnerar null om inget sådant konto finns.
	 */
	public BankAccount findByNumber(int accountNumber) {
		return 0;
	}

	/*
	 * Söker upp alla bankkonton som innehas av kunden med id-nummer 'idNr'. Kontona
	 * returneras i en lista. Kunderna antas ha unika id-nummer.
	 */
	public ArrayList<BankAccount> findAccountsForHolder(long idNr) {
		return 0;
	}

	/*
	 * Söker upp kunder utifrån en sökning på namn eller del av namn. Alla personer
	 * vars namn innehåller strängen 'namePart' inkluderas i resultatet, som
	 * returneras som en lista. Samma person kan förekomma flera gånger i
	 * resultatet. Sökningen är "case insensitive", det vill säga gör ingen skillnad
	 * på stora och små bokstäver (gjordes i Sten sax påse ignoreCase)
	 */
	public ArrayList<Customer> findByPartofName(String namePart) {
		return 0;
	}
}
