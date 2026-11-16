package ejercicios_tema1;

/** Muestre por pantalla la tabla de multiplicar de los 10 primeros números
 * naturales
 */

public class EjercicioCinco {
	
	public static void main(String [] args) {
	
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla de multiplicar de " + i +":");
			for (int j = 1; j <= 10; j++) {
				int res = i*j;
				System.out.println(i + "x" +j + "= " + res);
			}
		}
	}

}
