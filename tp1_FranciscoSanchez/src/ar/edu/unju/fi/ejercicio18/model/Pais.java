package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private int codigoPais;
	private String nombrePais;
	
	public Pais() {
		
	}

	@Override
	public String toString() {
		return "Pais [codigoPais=" + codigoPais + ", nombrePais=" + nombrePais + "]";
	}

	public Pais(int codigoPais, String nombrePais) {
		this.codigoPais = codigoPais;
		this.nombrePais = nombrePais;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	
}