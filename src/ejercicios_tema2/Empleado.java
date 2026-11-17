package ejercicios_tema2;

import java.util.List;

public class Empleado {
	private String nombre;
	private double salario;
	private List<Empleado> subordinados; // Lista de empleados a su cargo
	
	public Empleado(String nombre, double salario) { 
		this.nombre = nombre;
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario; 
		}
	public List<Empleado> getSubordinados() {
		return this.subordinados; 
		}
	
	public static double presupuestoEquipo(Empleado jefe) {
		
		//Caso base
		if (jefe == null) {
			return 0.0;
		}
		//Codigo general
		double salarioTotal = jefe.getSalario();
		
		List<Empleado> listaSubordinados = jefe.getSubordinados();
		
		if(listaSubordinados != null) {
			for(Empleado subordinado: listaSubordinados) {
				salarioTotal += presupuestoEquipo(subordinado);
			}
		}
		
		return salarioTotal;
	}
	
}