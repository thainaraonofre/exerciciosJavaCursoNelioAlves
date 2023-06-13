package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle1;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle1 rectangle = new Rectangle1();

		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.printf("Area: %.2f%n ", rectangle.area());
		
		System.out.printf("Perimeter: %.2f%n ", rectangle.perimeter());
		
		System.out.printf("Diagonal: %.2f%n ", rectangle.diagonal());
		

		sc.close();
	}

}
