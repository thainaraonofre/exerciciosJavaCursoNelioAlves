package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("VALORES = ");
		 
		for (int i = 0; i < n; i++) {
				System.out.print(" " + vect[i]);
			}
		
		System.out.println();
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		System.out.println("SOMA: " + sum);
		double media = sum / n;
		System.out.println("MÉDIA: " + media);
		
sc.close();

	}

}
