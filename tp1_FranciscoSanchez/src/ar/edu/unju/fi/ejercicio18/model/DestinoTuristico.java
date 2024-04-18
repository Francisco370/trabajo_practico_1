package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private int codigoDestino;
	private String nombreDestino;
	private double precio;
	private Pais pais;
	private int cantDias;
	
	public DestinoTuristico() {
		
	}

	@Override
	public String toString() {
		return "DestinoTuristico [codigoDestino=" + codigoDestino + ", nombreDestino=" + nombreDestino + ", precio="
				+ precio + ", pais=" + pais + ", cantDias=" + cantDias + "]";
	}

	public DestinoTuristico(int codigoDestino, String nombreDestino, double precio, Pais pais, int cantDias) {
		this.codigoDestino = codigoDestino;
		this.nombreDestino = nombreDestino;
		this.precio = precio;
		this.pais = pais;
		this.cantDias = cantDias;
	}

	public int getCodigoDestino() {
		return codigoDestino;
	}

	public void setCodigoDestino(int codigoDestino) {
		this.codigoDestino = codigoDestino;
	}

	public String getNombreDestino() {
		return nombreDestino;
	}

	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}
	
	
}
