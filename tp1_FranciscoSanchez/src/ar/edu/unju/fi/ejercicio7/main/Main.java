package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Por favor salario: ");
		float salario = scanner.nextFloat();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		empleado.aumentoMeritos();
		empleado.mostrarDatos();
		scanner.close();
		
	}
}