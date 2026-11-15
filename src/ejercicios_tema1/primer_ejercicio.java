package ejercicios_tema1;

/** 1. Defina variables que representen el número de días de un año,
 * el número de horas que tiene un día, el número de minutos que tiene
 * una hora y el número de segundos que tiene un minuto. Emplee las 
 * que ocupen el mínimo espacio de memoria posible. A continuación, 
 * calcule el número de segundos que tiene un año y almacene el valor
 * de dicho cálculo en otra variable.
 */

public class primer_ejercicio {
	
	public static void main(String [] args) {
		short daysYear = 365;
		byte hoursDay = 24;
		byte minsHour = 60;
		byte segsMin = 60;
		
		int segs_year = segsMin*minsHour*hoursDay*daysYear;
		System.out.println("Segundos en un año:" + segs_year);
		
	}
	
}
