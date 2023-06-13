package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> lista = new ArrayList<>();

		String sair = "sair";
		String entrada = " ";
		
System.out.println("Digite sua lista e quando acabar digite sair: ");
		while (!entrada.equals(sair)) {
			entrada = sc.nextLine();
			lista.add(entrada);
			lista.remove(sair);
		}
		System.out.println();
		System.out.println("Elementos da lista:");
		for (String elemento : lista) {
			System.out.println(elemento);
		}

		System.out.println();
		System.out.println("Elementos que repetem na lista :");
	      
sc.close();
}
}
