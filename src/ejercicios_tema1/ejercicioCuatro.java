package ejercicios_tema1;

import java.util.Scanner;

/** Calcule el mínimo y el máximo de una serie de números enteros 
 * positivos introducidos por el usuario. Cuando el usuario 
 * introduzca un número negativo se considerará que el anterior era
 * el último número.
 */

public class ejercicioCuatro {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.println("Introduzca números enteros positivos:");
		
		int numero = scanner.nextInt();
		
		while (!(numero < 0)) {
			if(numero<min) {
				min = numero;
			}
			if(numero>max) {
				max = numero;
			}
			numero = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("El número mínimo es: " + min);
        System.out.println("El número máximo es: " + max);
	}

}
