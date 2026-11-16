package ejercicios_tema1;

import java.util.Scanner;

/** Tome un número entero escrito por el usuario y descompóngalo
 * en factores primos. 
 */

public class EjercicioSiete {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int originalNum = num;
		
		System.out.print(originalNum + "=");
		
		int divisor = 2;
		
		while (num > 1) {
			if (num % divisor == 0) {
				System.out.print(divisor);
				num = num/divisor;
				
				if (num > 1) {
					System.out.print("x");
				}
			} else {
				divisor++;
			}
			
			
		}
			scanner.close();
			
	}

}
