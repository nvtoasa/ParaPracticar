package ejercicios_tema2;

public class Texto {
	
	public static boolean esPalindromo(String texto) {
		
		//caso base: longitud 0 o 1
		
		if (texto.length() == 0 || texto.length() == 1 || texto == null) {
			return true;
		}
		
		if(texto.charAt(0) == texto.charAt(texto.length()-1)) {
			return(esPalindromo(texto.substring(1, texto.length()-1)));
		}
		
		return false;
	}
	
}
