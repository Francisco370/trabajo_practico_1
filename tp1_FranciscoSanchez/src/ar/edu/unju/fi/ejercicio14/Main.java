package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		boolean validar=false;
		while(validar==false) {
			System.out.println("Ingrese un numero que este en el rango de <3,10>: ");
			num= scanner.nextInt();
			if(num>=3 && num<=10) {
				validar=true;
			}else
				System.out.println("El valor ingresado no es el correcto, porfavor ingrese nuevamente");
		}
		
		int x=0;
		int[] enteros = new int[num];
		
		while(x<num) {
			System.out.println("Ingrese un numero para el arreglo: ");
			int arreglo = scanner.nextInt();
			enteros[x]=arreglo;
			x++;
		}
		
		int suma = 0;
		for(int i=0; i<enteros.length; i++) {
			System.out.println("Elemento en la posicion "+i+ " = "+enteros[i]);
			suma = suma + enteros[i];
		}
		System.out.println("La suma de los elementos da como resultado "+suma);
		
		scanner.close();
	}

}