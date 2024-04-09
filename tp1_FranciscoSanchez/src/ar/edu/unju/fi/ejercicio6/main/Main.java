package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {
	public static void main(String[] args) {
		Persona persona1 = generarPersona();
		persona1.mostrarDatos();
		
		LocalDate fecha = LocalDate.of(2001, 6, 21);
		Persona persona2 = new Persona("43527360", "Francisco", fecha, "Jujuy");
		persona2.mostrarDatos();
		
		LocalDate fecha2 = LocalDate.of(1985, 2, 13);
		Persona persona3 = new Persona("12345678", "Juan", fecha2);
		persona3.mostrarDatos();
		
	}
	public static Persona generarPersona() {
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.println("Ingrese el nombre : ");
		String nom = scanner.nextLine();
		System.out.println("Ingrese el dni : ");
		String documento = scanner.nextLine();
		System.out.println("Ingrese el provincia : ");
		String prov = scanner.nextLine();
		System.out.println("Fecha de nacimiento : ");
		System.out.println("Ingrese el dia : ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese el mes : ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese el anio : ");
		int anio = scanner.nextInt();
		LocalDate f = LocalDate.of(anio, mes, dia);
		
		persona.setNombre(nom);
		persona.setDni(documento);
		persona.setProvincia(prov);
		persona.setFechaNacimiento(f);
		
		scanner.close();
		return persona;
	}
	
}