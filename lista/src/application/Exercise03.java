package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma sequência de números inteiros separados por espaços: ");
        String input = sc.nextLine();
        
        String[] numerosString = input.split(" ");
        List<Integer> numeros = new ArrayList<>();
       
        
        //for (String numeroString : numerosString) {
           // int numero = Integer.parseInt(numeroString);
           // numeros.add(numero);
           // } opcao no for each
        
        for (int i = 0; i < numerosString.length; i++) {
            String numeroString = numerosString[i];
            int numero = Integer.parseInt(numeroString);
            numeros.add(numero);
        }
        System.out.println("Números inseridos: " + numeros);
        
        for (int i = numeros.size() - 1; i >= 0; i--) {
            int numero = numeros.get(i);
            System.out.println(numero);
        }
        
	
		sc.close();
	}

}
