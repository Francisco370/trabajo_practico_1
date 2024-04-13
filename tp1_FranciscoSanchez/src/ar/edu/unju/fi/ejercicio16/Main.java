package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arreglo=new String[5];
		int posicion=0, i;
		byte eliminar = 0;
		
		for(i=0; i<5; i++) {
			System.out.println("Ingrese un nombre: ");
			String nombre = scanner.next();
			arreglo[i]=nombre;
		}
		
		while(posicion<5) {
			System.out.println("Elemento en la posicion "+posicion+ " = "+arreglo[posicion]);
			posicion++;
		}
		
		posicion = 0;
		
		System.out.println("Tamaño del arreglo: "+arreglo.length);
		
		int tamanio = arreglo.length - 1;
		
		do{
			System.out.println("Ingrese una posicion a eliminar del 0 al 4: ");
			eliminar=scanner.nextByte();
		}while(eliminar<0 || eliminar>4);
		
		boolean band = false;
		while(posicion<=tamanio && band==false){
			if(eliminar==posicion)
				band=true;
			else
				posicion++;
		}
		if(band==true){
			while(posicion<tamanio){
				arreglo[posicion]=arreglo[posicion+1];
				posicion++;
			}
			tamanio--;
		}
		
		posicion = 0;
		while(posicion<=tamanio) {
			System.out.println("Elemento en la posicion "+posicion+ " = "+arreglo[posicion]);
			posicion++;
		}
		
		scanner.close();
	}

}
