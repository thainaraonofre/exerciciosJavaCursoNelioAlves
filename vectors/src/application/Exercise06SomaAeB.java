package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06SomaAeB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}
	
		int[] resultado = new int[n];
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			resultado[i] = vetorA[i] + vetorB[i];
			System.out.println(resultado[i] + " ");
		}
				
sc.close();
	}

}
