package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numProducto = 1;
		
		while(numProducto <= 3) {
			boolean validar = false;
			int descuentoProducto = 0 ;
			
			System.out.println("Ingrese el nombre del producto: ");
			String nomProducto = scanner.next();
			System.out.println("Ingrese el codigo del producto: ");
			int codProducto = scanner.nextInt();
			System.out.println("Ingrese el precio del producto: ");
			float precioProducto = scanner.nextFloat();
			while(validar == false) {
				System.out.println("Ingrese el descuento del producto: ");
				descuentoProducto = scanner.nextInt();
				if (descuentoProducto>=0 && descuentoProducto<=50) {
					validar=true;
				}else
					System.out.println("Descuento no valido");
			}
			
			Producto producto = new Producto();
			
			producto.setNombre(nomProducto);
			producto.setCodigo(codProducto);
			producto.setPrecio(precioProducto);
			producto.setDescuento(descuentoProducto);
			
			producto.mostrarDatos();
			if(producto.getDescuento()>0) {
				float precioActualizado = producto.calcularDescuento(precioProducto, descuentoProducto);
				producto.setPrecio(precioActualizado);
			}else
				System.out.println("No se aplico ningun descuento");
			producto.mostrarDatos();
			
			
			numProducto++;
		}
		scanner.close();
	}

}