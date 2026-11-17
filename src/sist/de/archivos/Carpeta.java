package sist.de.archivos;

import java.util.List;

//Representa una carpeta que puede contener archivos y otras subcarpetas
public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; // Archivos directos en esta carpeta
	private List<Carpeta> subcarpetas; // Carpetas dentro de esta carpeta
	
	public Carpeta (String nombre) {
		this.nombre = nombre;
	}
	public List<Archivo> getArchivos () {
		return this.archivos;
		}
	public List<Carpeta> getSubcarpetas () {
		return this.subcarpetas;
		}
	
	public static double calcularPesoTotal (Carpeta inicio) {
		
		// Caso base: si no hay carpeta
		
		if(inicio == null) {
			return 0;
		}
		// Código general
		
		double pesoTotal = 0;
		List<Archivo> listaArchivos = inicio.getArchivos();
		if(listaArchivos != null) {
			for(Archivo archivo: listaArchivos) {
				if(archivo != null) {
				pesoTotal += archivo.getPesoMB();
				}
			}
		}
		
		//Paso recursivo
		List<Carpeta> listaSubcarpetas = inicio.getSubcarpetas();
		if(listaSubcarpetas != null) {
			for(Carpeta subcarpeta: listaSubcarpetas) {
				pesoTotal += calcularPesoTotal(subcarpeta);
			}
		}
		return pesoTotal;
	}

}
