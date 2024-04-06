package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int fact = 1;
		
		System.out.println("Por favor ingrese un numero <entre 0 y 10>: ");
		int num = scanner.nextInt();
		
		if(num<0 || num>10) {
			System.out.println("Error, el numero ingresado no es valido");
		}else {
			while(num > 0) {
				fact = fact * num;
				num--;
			}
			System.out.println("Su factorial es: "+fact);
		}
		scanner.close();
	}	
}

