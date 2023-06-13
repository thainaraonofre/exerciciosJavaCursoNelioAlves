package entities;

public class CurrencyConverter4 {

	public static double dollarPrice;

	public static int quantityDollar;

	public static double priceToPay() {
		double totalPrice = (dollarPrice * quantityDollar) * 1.06;
		return totalPrice;
	}

}
