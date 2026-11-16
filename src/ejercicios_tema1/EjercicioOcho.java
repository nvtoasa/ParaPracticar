package ejercicios_tema1;

import java.util.Scanner;

/** Solicite al usuario dos vectores tridimensionales
 * e imprima su producto escalar
 */

public class EjercicioOcho {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Pedimos los datos del primer vector
        System.out.println("Introduce las componentes del primer vector tridimensional:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("z1: ");
        double z1 = scanner.nextDouble();

        // Pedimos los datos del segundo vector
        System.out.println("\nIntroduce las componentes del segundo vector tridimensional:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("z2: ");
        double z2 = scanner.nextDouble();

        // Calculamos el producto escalar
        double productoEscalar = (x1 * x2) + (y1 * y2) + (z1 * z2);

        // Mostramos el resultado
        System.out.println("\nEl producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
		
	}

}
