package ejercicios_tema1;

/** Calcule la suma de todos los múltiplos de 5 comprendidos entre 1 y
 * 100. También debe calcular cuántos hay y mostrar/ visualizar cada uno
 * de ellos
 */

public class ejercicioTres {
	
	public static void main(String [] args) {
		
		int suma = 0;
		int numMultiplos = 0;
		
		for (int multiplo = 5; multiplo <= 100; multiplo += 5 ) {
			suma = suma + multiplo;
			numMultiplos++;
			System.out.println(multiplo);
		}
		
		System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es de " + suma + ". Y el número de múltiplos que hay es: " + numMultiplos);
	}
	
}
