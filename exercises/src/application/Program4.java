package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter4;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("what is the dollar price?");
		CurrencyConverter4.dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter4.quantityDollar = sc.nextInt();
		System.out.printf("Amount to be paid in reais = %.2f%n ", CurrencyConverter4.priceToPay());		
sc.close();
	}

}
