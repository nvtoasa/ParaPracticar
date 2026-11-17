package ejercicios_tema2;

import java.util.List;

public class ElementoHTML {
	private String tag; // Ejemplo: "div", "p", "img"
	private List<ElementoHTML> hijos;
	
	public String getTag() {
		return this.tag; 
		}
	public List<ElementoHTML> getHijos() {
		return this.hijos; 
		}
	public static int contarEtiquetas(ElementoHTML elemento, String tagBuscado) {
		
		//Caso base
		if(elemento == null) {
			return 0;
		}
		int numeroTagTotal = 0;
		if(tagBuscado != null && elemento.getTag().equals(tagBuscado)) {
			numeroTagTotal = 1;
		}
		
		List<ElementoHTML> listaHijos = elemento.getHijos();
		if (listaHijos !=  null) {
			for(ElementoHTML hijo: listaHijos) {
				numeroTagTotal += contarEtiquetas(hijo, tagBuscado);
			}
		}
		return numeroTagTotal;
		
	}
}