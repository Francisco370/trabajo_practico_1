package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona(){
		
	}
	
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}


	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}


	public int edadPersona(LocalDate fechaNacimiento) {
		LocalDate fechaActual = LocalDate.now();
		Period period = Period.between(fechaNacimiento, fechaActual);
		int edad = period.getYears();
		return edad;
	}
	
	public boolean esMayor(int edad) {
		if (edad > 18)
			return true;
		else
			return false;
	}
	
	public void mostrarDatos() {
		System.out.println();
		System.out.println("Nombre : "+this.getNombre());
		System.out.println("DNI: "+this.getDni());
		System.out.println("Fecha de nacimiento: "+this.getFechaNacimiento());
		int edad = edadPersona(this.getFechaNacimiento());
		System.out.println("Edad: "+edad);
		System.out.println("Provincia: "+this.getProvincia());
		if(esMayor(edad) == true)
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}