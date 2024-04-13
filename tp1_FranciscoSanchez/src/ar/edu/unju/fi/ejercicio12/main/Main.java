package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre : ");
		String nom = scanner.nextLine();
		
		Calendar fechaNac = Calendar.getInstance();
		
		System.out.println("Fecha de nacimiento : ");
		System.out.println("Ingrese el dia : ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese el mes : ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese el anio : ");
		int anio = scanner.nextInt();
		fechaNac.set(anio, mes-1, dia);
		
		Persona persona = new Persona();
		
		persona.setNombre(nom);
		persona.setFechaNacimiento(fechaNac);
		persona.mostrarDatos();
		
		scanner.close();
	}

}