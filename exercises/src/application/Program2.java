package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee2 employee = new Employee2();

		System.out.print("Name : ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.print(" Employee : " + employee);
		System.out.println();

		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();

		System.out.print("Updated data: " + employee);

		sc.close();
	}

}
