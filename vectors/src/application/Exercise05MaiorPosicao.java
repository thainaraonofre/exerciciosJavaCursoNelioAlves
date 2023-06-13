package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] numero = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextDouble();
		}

		int posicaoMaior = 0;
		double maior = numero[0];

		for (int i = 1; i < n; i++) {
			if (numero[i] > maior) {
				maior = numero[i];
				posicaoMaior = i;
			}
		}

		System.out.println();
		System.out.println("Maior Valor = " + maior);
		System.out.print("Posição do maior valor = " + posicaoMaior);

		sc.close();
	}
}
