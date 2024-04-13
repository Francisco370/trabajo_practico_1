package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] enteros = new int[8];
		
		int x=0;
		while(x<8) {
			System.out.println("Ingrese un numero: ");
			int num = scanner.nextInt();
			enteros[x]=num;
			x++;
		}
		
		for(int i=0; i<enteros.length; i++) {
			System.out.println("Elemento en la posicion "+i+ " = "+enteros[i]);
		}
		
		scanner.close();
	}

}