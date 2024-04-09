package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		
	}

	public int calcularSumatoria(int n) {
		int sumatoria = 0, numerador, denominador = 2;
		for(int k=1; k<=n; k++){
			numerador = k * (k+1);
			sumatoria += Math.pow((numerador / denominador), 2);
		}
		return sumatoria;
	}
	
	public int calcularProductoria(int n) {
		int productoria = 0;
		for(int k=1; k<=n; k++){
			productoria += k*(k+4) ;
		}
		return productoria;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
}