package ejercicios_tema2;

import java.util.List;

public class Pieza {
	private String nombre;
	private boolean esDefectuosa;
	private List<Pieza> componentes; // Piezas necesarias para montar esta
	
	public boolean isDefectuosa() { return this.esDefectuosa; }
	public List<Pieza> getComponentes() { return this.componentes; }
	
	public static boolean contieneDefectos(Pieza piezaPrincipal) {
		
		if(piezaPrincipal == null) {
			return false;
		}
		
		if(piezaPrincipal.isDefectuosa() == true) {
			return true;
		}
		
		List<Pieza> listaComp = piezaPrincipal.getComponentes();
		if(listaComp != null) {
			for(Pieza comp: listaComp) {
				if(contieneDefectos(comp)) {
					return true;
				}
			}
		}
		
		return false;
	}
}