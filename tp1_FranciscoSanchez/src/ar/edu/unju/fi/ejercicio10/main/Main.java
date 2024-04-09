package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numPizza = 1;
		int diamPizza=0;
		
		while(numPizza <= 3) {
			boolean validar=false;
			while(validar==false) {
				System.out.println("Ingrese el diametro de la pizza <20,30 o 40>: ");
				diamPizza = scanner.nextInt();
				if(diamPizza == 20 || diamPizza == 30 || diamPizza == 40 ) {
					validar=true;
				}else
					System.out.println("Diametro invalido");	
			}
			System.out.println("La pizza tiene ingredientes especiales? <true o false>: ");
			boolean ingredientes = scanner.nextBoolean();
			
			Pizza pizza = new Pizza();
			
			pizza.setDiametro(diamPizza);
			pizza.setIngredientesEspeciales(ingredientes);
			
			int precio = pizza.calcularPrecio(diamPizza, ingredientes);
			double area = pizza.calcularArea(diamPizza);
			
			pizza.setPrecio(precio);
			pizza.setArea(area);
			
			System.out.println("**PIZZA "+numPizza+"**");
			pizza.mostrarDatos();
			
			numPizza++;
		}
		scanner.close();
	}

}