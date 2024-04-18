package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	
	private static Scanner scanner;
	private static List<Pais> paises;
	private static List<DestinoTuristico> destinos;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		precargarPaises();
		destinos = new ArrayList<>();
		
		int opcion = 0;
		do {
			menuOpcion();
			opcion = excepcionEnteros();
			switch(opcion) {
			case 1:
				agregarDestinos();
				break;
			case 2:
				if(destinos.size()>0)
					mostrarDestinos();
				else
					System.out.println("No se agregaron los destinos turisticos");
				break;
			case 3:
				if(destinos.size()>0)
					modificarPais();
				else
					System.out.println("No se agregaron los destinos turisticos");
				break;
			case 4:
				if(destinos.size()>0)
					destinos.clear();
				else
					System.out.println("No se agregaron los destinos turisticos");
				break;
			case 5:
				if(destinos.size()>0)
					eliminarDestino();
				else
					System.out.println("No se agregaron los destinos turisticos");
				break;
			case 6:
				if(destinos.size()>0)
					ordenarDestinos();
				else
					System.out.println("No se agregaron los destinos turisticos");
				break;
			case 7:
				mostrarPaises();
				break;
			case 8:
				if(destinos.size()>0)
					destinoPais();
				else
					System.out.println("No se agregaron los destinos turisticos");
				break;
			case 9:
				System.out.println("Fin del programa...");
				break;
			default:System.out.println("Opcion Incorrecta!!!");
			}
		}while(opcion != 9);
	}
	
	/**
	 * Excepcion de numeros enteros
	 * @return valor entero
	 */
	public static int excepcionEnteros() {
		boolean band = false;
		int valor = 0;
		do{
			band = false;
			try{
				valor = scanner.nextByte();
				band = true;
			}catch(InputMismatchException ex){
				System.out.println("Error, valor incorrecto");
				scanner.next();
			}
		}while(band == false);
		return valor;
	}
	
	/**
	 * Excepcion de numero double
	 * @return valor double
	 */
	public static double excepcionDouble() {
		boolean band = false;
		double valor = 0;
		do{
			band=false;
			try{
				valor = scanner.nextDouble();
				band = true;
			}catch(InputMismatchException ex){
				System.out.println("Error, valor incorrecto");
				scanner.next();
			}
		}while(band == false);
		return valor;
	}
	
	/**
	 * Controla que la palabra ingresada sea correcta
	 * @return cadena palabra
	 */
	public static String validarPalabra() {
		boolean band = false;
		String palabra;
		do {
			palabra = scanner.next();
			if(palabra.length()<3 || palabra.matches(".*[^a-zA-Z].*") == true)
				System.out.println("El valor ingresado no corresponde a lo pedido");
			else
				band = true;
		}while(band == false);
		return palabra;
	}
	
	/*
	 * Se agregan objetos al ArrayList de Paises
	 */
	public static void precargarPaises() {
		if(paises == null) {
			paises = new ArrayList<>();
		}
		paises.add(new Pais(10,"Argentina"));
		paises.add(new Pais(20,"Chile"));
		paises.add(new Pais(30,"Mexico"));
		paises.add(new Pais(40,"Estados Unidos"));
		paises.add(new Pais(50,"Peru"));
	}
	
	/*
	 * Menu de opciones
	 */
	public static void menuOpcion() {
		System.out.println("==============================================================");
		System.out.println("1-Alta de Destino Turistico");
		System.out.println("2-Mostrar todos los destinos turisticos");
		System.out.println("3-Modificar el pais de un destino turistico");
		System.out.println("4-Limpiar el ArrayList de destino turisticos");
		System.out.println("5-Eliminar un destino turistico");
		System.out.println("6-Mostrar los destinos turisticos ordenados por nombre");
		System.out.println("7-Mostrar todos los paises");
		System.out.println("8-Mostrar los destinos turisticos que pertenecen a un pais");
		System.out.println("9_Salir");
		System.out.println("==============================================================");
		System.out.println("Ingrese una opcion: ");
	}
	
	/*
	 * Agregar un objeto al ArrayList destino turistico
	 */
	public static void agregarDestinos() {
		DestinoTuristico destino = new DestinoTuristico();
		System.out.println("Ingrese el codigo del destino: ");
		destino.setCodigoDestino(excepcionEnteros());
		System.out.println("Ingrese el nombre del destino: ");
		destino.setNombreDestino(validarPalabra());
		System.out.println("Ingrese el precio del destino: ");
		destino.setPrecio(excepcionDouble());
		boolean band = false;
		do {
			System.out.println("Ingrese el codigo del pais: ");
			int codigo = excepcionEnteros();
			Pais pais = buscarPais(codigo);
			if(pais == null) {
				System.out.println("El pais no existe!!!");
			}else {
				destino.setPais(pais);
				band = true;
			}
		}while(band == false);
		System.out.println("Ingrese la cantidad de dias: ");
		destino.setCantDias(excepcionEnteros());
		
		destinos.add(destino);
	}
	
	/**
	 * Buscar un objeto pais dentro del arraylist de paises
	 * @param codigo
	 * @return objeto paisEncontrado
	 */
	public static Pais buscarPais(int codigo) {
		Pais paisEncontrado = null;
		for(Pais pais:paises) {
			if(pais.getCodigoPais() == codigo) {
				paisEncontrado = pais;
				break;
			}
		}
		return paisEncontrado;
	}
	
	/*
	 * Muestra todos los objetos guardador en el arraylist de DestinoTuristico
	 */
	public static void mostrarDestinos() {
		System.out.println("---Lista de Destinos Turisticos---");
		destinos.forEach(d->System.out.println(d));
	}
	
	/*
	 * Modificar datos de destino turistico, pais
	 */
	public static void modificarPais() {
		System.out.println("---Modificar Destino Turistico---");
		System.out.println("Ingrese el codigo del destino turistico: ");
		int cod = excepcionEnteros();
		for(DestinoTuristico dest:destinos) {
			if(dest.getCodigoDestino() == cod) {
				boolean band=false;
				do {
					System.out.println("Ingrese el nuevo codigo del pais: ");
					int codigoPais = excepcionEnteros();
					if(buscarPais(codigoPais) != null) {
						band=true;
						Pais pais = buscarPais(codigoPais);
						dest.setPais(pais);
						System.out.println("Se modifico el pais");
					}else
						System.out.println("El codigo ingresado no existe!!!");
				}while(band == false);
			}
		}
	}
	
	/*
	 * Eliminar un objeto destino del arrayList destino turistico
	 */
	public static void eliminarDestino() {
		System.out.println("---Eliminar destino turistico---");
		System.out.println("Ingrese el codigo del destino turistico a eliminar: ");
		int cod = excepcionEnteros();
		Iterator<DestinoTuristico> iterator = destinos.iterator();
		if(!destinos.isEmpty()) {
			while(iterator.hasNext()) {
				DestinoTuristico aux = iterator.next();
				if(aux.getCodigoDestino() == cod) {
					iterator.remove();
					System.out.println("Se elimino el destino turistico con el codigo "+cod);
				}
			}
		}else {
			System.out.println("Lista de destinos turisticos vacia!!!");
		}
	}
	
	/*
	 * Ordenar la lista de destinos turisticos
	 */
	public static void ordenarDestinos() {
		System.out.println("---Destinos turisticos ordenados por nombre---");
		destinos.sort(Comparator.comparing(DestinoTuristico::getNombreDestino));
		destinos.forEach(d->System.out.println(d));
	}
	
	/*
	 * Muestra todos los objetos guardador en el arraylist de Paises
	 */
	public static void mostrarPaises() {
		System.out.println("-----Listas de paises-----");
		paises.forEach(p->System.out.println(p));
	}
	
	/*
	 * Muestra los destinos turisticos segun el pais
	 */
	public static void destinoPais() {
		System.out.println("---Mostrar destino turistico por pais---");
		System.out.println("Ingrese un Pais: ");
		String p = validarPalabra();
		for(DestinoTuristico dest:destinos){
			if(dest.getPais().getNombrePais().equals(p)) {
				System.out.println(dest.toString());
			}else
				System.out.println("El pais ingresado no esta registrado");
		}
	}
}
