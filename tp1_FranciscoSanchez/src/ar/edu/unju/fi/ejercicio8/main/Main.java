package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el valor de n : ");
		int num = scanner.nextInt();
		
		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		int sumatoriaResultado = calc.calcularSumatoria(num);
		int productoraResultado = calc.calcularProductoria(num);
		
		System.out.println("El resultado de la sumatoria es "+sumatoriaResultado);
		System.out.println("El resultado de la productora es "+productoraResultado);
		
		scanner.close();
	}

}