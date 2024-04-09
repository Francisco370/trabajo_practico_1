package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private float precio;
	private int descuento;
	
	public Producto() {
		
	}
	
	public float calcularDescuento(float precio, int descuento) {
		float desc=0;
		System.out.println("Se aplico el descuento");
		desc = ((float) descuento / 100)*precio;
		precio = precio - desc;
		return precio;
	}
	
	public void mostrarDatos() {
		System.out.println("PRODUCTO");
		System.out.println("Nombre del producto: "+this.getNombre());
		System.out.println("Codigo del producto: "+this.getCodigo());
		System.out.println("Precio del producto: $"+this.getPrecio());
		System.out.println("Descuento: "+this.getDescuento()+"%");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
}