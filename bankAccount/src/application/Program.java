package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		String holder = sc.next();

		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		Account account = null;

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(number, holder, balance);
		} else {

			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: \n" + account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double quantity = sc.nextDouble();
		account.deposit(quantity);

		System.out.println();
		System.out.println("Updated account data: \n" + account);
		System.out.println();

		System.out.print("Enter a withdraw value:");
		quantity = sc.nextDouble();
		account.withdraw(quantity);
		System.out.println("Updated account data: \n" + account);

		sc.close();
	}

}