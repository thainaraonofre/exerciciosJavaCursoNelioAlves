package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas03;

public class Exercise03AlturasNovo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoas03[] pessoa = new Pessoas03[n];
		Pessoas03 pessoaAltura = new Pessoas03();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.next();			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoas03(name, idade, altura);					
		}
		
		System.out.println();
		
		double totalAlturas = 0;
		for (int i = 0; i < n; i++) {
			totalAlturas += pessoa[i].getAltura();

		}
		double mediaAlturas = pessoaAltura.calculaMediaAltura(totalAlturas, n);
		
		System.out.printf("Altura média: %.2f ", mediaAlturas);
		System.out.println();
		
		
		double pessoaMenorQueDezesseis = pessoaAltura.mediaPessoasMenosDeDezesseis(pessoa, n);
		
		System.out.println("Porcentagem menor que 16: " + pessoaMenorQueDezesseis);

		sc.close();
	}

}
