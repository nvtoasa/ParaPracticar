package ejercicios_tema1;

/** Muestre por pantalla la lista de los 100 primeros números primos.
 */

public class EjercicioSeis {

	public static void main(String [] args) {
		
		int primosEncontrados = 0;
		int numero = 2;
		
		while (primosEncontrados < 100) {
			boolean esPrimo = true;
			
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
				}
			}
			
			if(esPrimo) {
				primosEncontrados++;
				System.out.println(primosEncontrados+"º primo: "+ numero);
			}
			numero++;
		}
	}
	
}
