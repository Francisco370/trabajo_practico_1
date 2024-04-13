package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0,i=0;
		boolean validar=false;
		while(validar==false) {
			System.out.println("Ingrese un numero que este en el rango de <5,10>: ");
			num = scanner.nextInt();
			if(num>=5 && num<=10) {
				validar=true;
			}else
				System.out.println("El valor ingresado no es el correcto, porfavor ingrese nuevamente");
		}
		
		String nombre = null;
		String[] arreglo=new String[num];
		do {
			System.out.println("Ingrese un nombre: ");
			nombre = scanner.next();
			arreglo[i]=nombre;
			i++;
		}while(i<num);
		
		System.out.println("Desde la primera posicion hasta la ultima posicion");
		for(i=0; i<arreglo.length; i++) {
			System.out.println("Elemento en la posicion "+i+ " = "+arreglo[i]);
		}
		
		
		System.out.println("Desde la ultima posicion hasta la primera posicion");
		for(int j=arreglo.length-1; j>=0; j--) {
			System.out.println("Elemento en la posicion "+j+ " = "+arreglo[j]);
		}
		
		scanner.close();
	}

}