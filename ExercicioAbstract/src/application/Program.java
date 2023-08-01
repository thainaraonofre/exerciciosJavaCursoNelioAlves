package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributors;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contributors> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tax payer #" + i + " data:");

			System.out.print("Individual or company (i/c)? ");

			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				Contributors con = new Individual(name, annualIncome, healthExpenditures);
				list.add(con);
			}

			else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();

				Contributors con = new Company(name, annualIncome, numberOfEmployee);
				list.add(con);
			}
		}

		System.out.println();
		System.out.println("TAXES PAD: ");

		double sum = 0.0;

		for (Contributors con : list) {
			double tax = con.tax();
			System.out.println(con.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

		sc.close();
	}

}
