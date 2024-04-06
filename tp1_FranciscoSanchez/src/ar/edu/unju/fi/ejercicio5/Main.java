package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un numero <entre 1 y 9>: ");
		int num = scanner.nextInt();
		
		if(num>=1 && num<=9) {
			for(int i=0;i<11;i++) {
				System.out.println(+num+"*" +i+"= " +num*i);
			}
		}else {
			System.out.println("Error, el numero ingresado no es valido");
		}
		scanner.close();
	}

}