package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<>();
		
		 System.out.println("Digite a lista de números e para parar digite 0: ");
	     int numero = sc.nextInt();
	     
	     while (numero != 0) {
	            numeros.add(numero);
	            numero = sc.nextInt();
	        }
	     
	     System.out.println("Lista na ordem inversa: ");
	     
	     Collections.reverse(numeros);
		
	     for (int num : numeros) {
	            System.out.println(num);
	        }
	
sc.close();
	}
}
