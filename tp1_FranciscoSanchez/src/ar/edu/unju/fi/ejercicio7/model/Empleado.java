package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private float salario;
	
	final int SALARIO_M = 210000;
	final int AUMENTO = 20000;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, Integer legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		salario(salario);
	}
	
	public void salario(float salario) {
		if(salario>=SALARIO_M)
			this.salario = salario;
		else
			this.salario = SALARIO_M;
	}
	
	public void aumentoMeritos() {
		this.salario = this.salario + AUMENTO;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: $"+salario);
	}
	
}