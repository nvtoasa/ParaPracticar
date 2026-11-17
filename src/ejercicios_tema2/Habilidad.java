package ejercicios_tema2;

import java.util.List;

public class Habilidad {
	private String id;
	private int costePuntos; // Coste para desbloquear esta habilidad
	private List<Habilidad> desbloqueables; // Habilidades que dependen de esta
	
	public int getCoste() {
		return this.costePuntos; 
		}
	
	public List<Habilidad> getDesbloqueables() {
		return this.desbloqueables; 
		}
	
	public static int costeRamaCompleta(Habilidad raiz) {
		
		//Caso base: no hay más habilidades
		
		if (raiz == null) {
			return 0;
		}
		
		int costeTotal = raiz.getCoste();
		
		List<Habilidad> listaDesbloqueables = raiz.getDesbloqueables();
		
		if(listaDesbloqueables != null) {
			for (Habilidad desbloqueable: listaDesbloqueables) {
			costeTotal += costeRamaCompleta(desbloqueable);
			}
		}
		return costeTotal;
	}
}
