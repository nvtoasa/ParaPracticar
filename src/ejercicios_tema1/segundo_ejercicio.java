package ejercicios_tema1;

/**
 *  2. Muestre por pantalla los mayores números enteros que se pueden
 *  representar mediante un char, un short y un int.
 */

public class segundo_ejercicio {
	
	public static void main(String[] args) {
		char maxChar = Character.MAX_VALUE;
		int maxCharComoInt = (int) maxChar;
		
		short maxShort = Short.MAX_VALUE;
		int maxInt = Integer.MAX_VALUE;
		
		System.out.println("Valor máximo char:" + maxCharComoInt + ". Valor máximo short:" + maxShort + ". Valor máximo int:" + maxInt);
	}
	
}
