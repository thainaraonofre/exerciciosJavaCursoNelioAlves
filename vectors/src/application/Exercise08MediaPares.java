package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		int[] pares = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		int contPares = 0;
		
		for (int i = 0; i < n ; i++) {
			if (vetor[i] % 2 == 0)	{
				pares[contPares] = vetor[i];
						contPares++;
			} 			
		}
		
		for (int i = 0; i < contPares; i++) {
		    somaPares += pares[i];
		}
		
		double mediaPares = (double) somaPares / contPares;
	
		
		if (mediaPares > 0) {
		System.out.println("Media pares : " + mediaPares);
		}
		else
			System.out.println("Nenhum par");
		
	
sc.close();
	}

}
