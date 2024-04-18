package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	private static Scanner scanner;
	private static List<Jugador> jugadores;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		jugadores = new ArrayList<>();
		
		int opcion = 0;
		do {
			menuOpcion();
			opcion = excepcionEnteros();
			switch(opcion) {
			case 1: 
				agregarJugador();
				break;
			case 2:
				if(jugadores.size()>0)
					mostrarJugador();
				else
					System.out.println("No se agregaron jugadores");
				break;
			case 3:
				if(jugadores.size()>0)
					ordenarPorApellido();
				else
					System.out.println("No se agregaron jugadores");
				break;
			case 4: 
				if(jugadores.size()>0)
					modificarJugador();
				else
					System.out.println("No se agregaron jugadores");
				break;
			case 5:
				if(jugadores.size()>0)
					borrarJugador();
				else
					System.out.println("No se agregaron jugadores");
				break;
			case 6:
				if(jugadores.size()>0)
					cantidadJugadores();
				else
					System.out.println("No se agregaron jugadores");
				break;
			case 7: 
				if(jugadores.size()>0)
					jugadorNacionalidad();
				else
					System.out.println("No se agregaron jugadores");
				break;
			case 8:
				System.out.println("Fin del programa...");
				break;
			default:System.out.println("Opcion Incorrecta!!!");
			}
		}while(opcion!=8);
	}
	
	/**
	 * Excepcion de numeros enteros
	 * @return valor entero
	 */
	public static int excepcionEnteros() {
		boolean band=false;
		int valor=0;
		do{
			band=false;
			try{
				valor=scanner.nextByte();
				band=true;
			}catch(InputMismatchException ex){
				System.out.println("Error, valor incorrecto");
				scanner.next();
			}
		}while(band==false);
		return valor;
	}
	
	/**
	 * Excepcion de numeros reales
	 * @return valor real
	 */
	public static float excepcionFloat() {
		boolean band=false;
		float valor=0;
		do{
			band=false;
			try{
				valor=scanner.nextFloat();
				band=true;
			}catch(InputMismatchException ex){
				System.out.println("Error, valor incorrecto");
				scanner.next();
			}
		}while(band==false);
		return valor;
	}
	
	/**
	 * Controla que la palabra ingresada sea correcta
	 * @return cadena palabra
	 */
	public static String validarPalabra() {
		boolean band=false;
		String palabra;
		do {
			palabra=scanner.next();
			if(palabra.length()<3 || palabra.matches(".*[^a-zA-Z].*")==true)
				System.out.println("El valor ingresado no corresponde a lo pedido");
			else
				band=true;
		}while(band==false);
		return palabra;
	}
	
	/*
	 * Menu de opciones
	 */
	public static void menuOpcion() {
		System.out.println("======================================================================");
		System.out.println("1-Alta de Jugador");
		System.out.println("2-Mostrar los datos del jugador");
		System.out.println("3-Mostrar todos los jugadore ordenados por apellido");
		System.out.println("4-Modificar los datos de un jugador");
		System.out.println("5-Eliminar un jugador");
		System.out.println("6-Mostrar la cantidad total de jugadores que tiene el ArrayList");
		System.out.println("7-Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		System.out.println("8-Salir");
		System.out.println("======================================================================");
		System.out.println("Ingrese una opcion: ");
	}
	
	/*
	 * Agregar un objeto jugador al ArrayList Jugador
	 */
	public static void agregarJugador() {
		Jugador jugador = new Jugador();
		System.out.print("Ingrese el nombre del jugador: ");
		jugador.setNombre(validarPalabra());
		System.out.print("Ingrese el apellido del jugador: ");
		jugador.setApellido(validarPalabra());
		
		boolean band=false;
		do {
			System.out.print("Ingrese la fecha de nacimiento (dd-MM-yyyy): ");
			String fechaNac = scanner.next();
			DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			band=false;
			try {
				LocalDate fechaNacimiento = LocalDate.parse(fechaNac,fecha);
				jugador.setFechaNacimiento(fechaNacimiento);
				band=true;
			} catch (Exception e) {
				System.out.println("Error, valor incorrecto");
			}
		}while(band==false);
		
		System.out.print("Ingrese el nacionalidad del jugador: ");
		jugador.setNacionalidad(validarPalabra());
		System.out.print("Ingrese la estatura del jugador: ");
		jugador.setEstatura(excepcionFloat());
		System.out.print("Ingrese el peso del jugador: ");
		jugador.setPeso(excepcionFloat());
		System.out.print("Posicion del jugador: ");
		String posicion = null;
		int opcion = 0;
		do {
			System.out.println("1-Delantero");
			System.out.println("2-Medio");
			System.out.println("3-Defensa");
			System.out.println("4-Arquero");
			opcion = excepcionEnteros();
			switch(opcion) {
			case 1: posicion = "Delantero";
				break;
			case 2: posicion = "Medio";
				break;
			case 3: posicion = "Defensa";
				break;
			case 4: posicion = "Arquero";
				break;
			default:System.out.println("Opcion Incorrecta");
			}
		}while(opcion<0 || opcion>=5);
		jugador.setPosicion(posicion);
		
		jugadores.add(jugador);
	}
	
	/*
	 * Muestra todos los objetos guardador en el arraylist Jugador
	 */
	public static void mostrarJugador() {
		System.out.println("---Lista de Jugadores---");
		boolean encontrado = false;
		System.out.println("Ingrese el nombre del jugador a buscar: ");
		String nombre = validarPalabra();
		System.out.println("Ingrese el apellido del jugador a buscar: ");
		String apellido = validarPalabra();
		for (Jugador jugador : jugadores) {
			if (nombre.equals(jugador.getNombre()) && apellido.equals(jugador.getApellido())) {
                encontrado = true;
                System.out.println("---Datos del Jugadores---");
                System.out.println(jugador.toString());
                break;
            }
		}
		if (!encontrado) 
            System.out.println("No se encontro el jugador o el jugador no existe!!!!");
	}
	
	/*
	 * Ordenar la lista de Jugadores
	 */
	public static void ordenarPorApellido() {
		System.out.println("---Jugadores ordenados por nombre---");
		jugadores.sort(Comparator.comparing(Jugador::getApellido));
		jugadores.forEach(j->System.out.println(j));
	}
	
	/*
	 * Modificar datos de un objeto Jugador
	 */
	public static void modificarJugador() {
		System.out.println("---Modificar un Jugador---");
		boolean encontrado = false;
		int opcion = 0;
		System.out.println("Ingrese el nombre del jugador: ");
		String nombre = validarPalabra();
		System.out.println("Ingrese el apellido del jugador: ");
		String apellido = validarPalabra();
		for (Jugador jugador : jugadores) {
            if (nombre.equals(jugador.getNombre()) && apellido.equals(jugador.getApellido())) {
                encontrado = true;
                do {
                	menuModificar();
                	opcion = excepcionEnteros();
                	switch(opcion) {
                	case 1:
                		System.out.println("Ingrese el nombre del jugador: ");
                		jugador.setNombre(validarPalabra());
                		break;
                	case 2: 
                		System.out.println("Ingrese el apellido del jugador: ");
                		jugador.setApellido(validarPalabra());
                		break;
                	case 3:
                		boolean band=false;
                		do {
                			System.out.println("Ingrese la nueva fecha de nacimiento (dd-MM-yyyy): ");
                			String fechaNac = scanner.next();
                			DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                			band=false;
                			try {
                				LocalDate fechaNacimiento = LocalDate.parse(fechaNac,fecha);
                				jugador.setFechaNacimiento(fechaNacimiento);
                				band=true;
                			} catch (Exception e) {
                				System.out.println("Error, valor incorrecto");
                			}
                		}while(band==false);
                		break;
                	case 4:
                		System.out.println("Ingrese el nacionalidad del jugador: ");
                		jugador.setNacionalidad(validarPalabra());
                		break;
                	case 5:
                		System.out.println("Ingrese la estatura del jugador: ");
                		jugador.setEstatura(excepcionFloat());
                		break;
                	case 6:
                		System.out.println("Ingrese el peso del jugador: ");
                		jugador.setPeso(excepcionFloat());
                		break;
                	case 7:
                		System.out.println("Posicion del jugador: ");
                		String posicion = null;
                		int op = 0;
                		do {
                			System.out.println("1-Delantero");
                			System.out.println("2-Medio");
                			System.out.println("3-Defensa");
                			System.out.println("4-Arquero");
                			op = excepcionEnteros();
                			switch(op) {
                			case 1: posicion = "Delantero";
                			break;
                			case 2: posicion = "Medio";
                			break;
                			case 3: posicion = "Defensa";
                			break;
                			case 4: posicion = "Arquero";
                			break;
                			}
                		}while(op<0 || op>=5);
                		jugador.setPosicion(posicion);
                		break;
                	case 8:
                		System.out.println("Saliendo del menu");
                		break;
                	default:System.out.println("Opcion Incorrecta!!!");
                	}
                }while(opcion!=8);
            }
        }
        if (!encontrado) 
            System.out.println("No se encontro el jugador");
	}
	
	/*
	 * Menu de opciones para la modificacion del jugador
	 */
	public static void menuModificar() {
		System.out.println("=============================");
		System.out.println("Que datos desea modificar?");
    	System.out.println("1_Nombre");
    	System.out.println("2_Apellido");
    	System.out.println("3_Fecha de nacimiento");
    	System.out.println("4_Nacionalidad");
    	System.out.println("5_Estatura");
    	System.out.println("6_Peso");
    	System.out.println("7_Posicion");
    	System.out.println("8_Salir");
    	System.out.println("Ingrese una opcion: ");
    	System.out.println("=============================");
	}
	
	/*
	 * Eliminar un objeto jugador del arrayList Jugador
	 */
	public static void borrarJugador() {
		System.out.println("---Borrar un Jugador---");
		System.out.println("Ingrese el nombre del jugador: ");
		String nombre = validarPalabra();
		System.out.println("Ingrese el apellido del jugador: ");
		String apellido = validarPalabra();
		Iterator<Jugador> iterator = jugadores.iterator();
		if(!jugadores.isEmpty()) {
			while(iterator.hasNext()) {
				Jugador aux = iterator.next();
				if(aux.getNombre().equals(nombre) && aux.getApellido().equals(apellido)) {
					iterator.remove();
					System.out.println("Se elimino el jugador "+nombre+" "+apellido);
				}
			}
		}else
			System.out.println("Lista de jugadores vacia!!!");
	}
	
	/*
	 * Muestra la cantidad de objetos registrados en el arrayList Jugador
	 */
	public static void cantidadJugadores() {
		int tamanio = jugadores.size();
		System.out.println("El número de jugadores registrados es de "+tamanio);
	}
	
	/*
	 * Muestra la cantidad de jugadores segun una nacionalidad
	 */
	public static void jugadorNacionalidad() {
		System.out.println("---Mostrar jugadores segun la nacionalidad---");
		System.out.print("Ingrese una Nacionalidad: ");
		String nac = validarPalabra();
		int i=0;
		for(Jugador juga:jugadores){
			if(juga.getNacionalidad().equals(nac))
				i++;
		}
		System.out.println("Cantidad de jugadores de "+nac+": "+i);
	}
}
