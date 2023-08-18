package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;



public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);	
		
		Set<Integer> set = new HashSet<>();
	
		System.out.print("How many students for course A? ");
		int A = sc.nextInt();
		for(int i = 0; i<A; i++) {
			int code = sc.nextInt();

			set.add(code);
		}
		
		

		System.out.print("How many students for course B? ");
		int B = sc.nextInt();
		for(int i = 0; i<B; i++) {
			int code = sc.nextInt();
			
			set.add(code);
		}
		
		
		System.out.print("How many students for course C? ");
		int C = sc.nextInt();
		for(int i = 0; i<C; i++) {
			int code = sc.nextInt();
			
			set.add(code);
		}
		
	
		System.out.println("Total students " + set.size()); 
		
		
		
	sc.close();	
	}
}
