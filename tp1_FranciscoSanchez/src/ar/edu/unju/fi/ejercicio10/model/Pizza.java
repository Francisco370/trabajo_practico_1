package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private int precio;
	private double area ;
	private boolean ingredientesEspeciales ;
	
	final int ING_ESP20 = 500;
	final int ING_ESP30 = 750;
	final int ING_ESP40 = 1000;
	final double PI = 3.141591;
	
	public Pizza() {
		
	}
	
	public int calcularPrecio(int diametro, boolean ingredientesEspeciales) {
		int resultado = 0;
		if(diametro == 20 && ingredientesEspeciales==false) {
			resultado = 4500;
		}else {
			if(diametro == 20 && ingredientesEspeciales==true) {
				resultado = 4500 + ING_ESP20;
			}else {
				if(diametro == 30 && ingredientesEspeciales==false) {
					resultado = 4800;
				}else {
					if(diametro == 30 && ingredientesEspeciales==true) {
						resultado = 4800 + ING_ESP30;
					}else {
						if(diametro == 40 && ingredientesEspeciales==false) {
							resultado = 5500;
						}else {
							if(diametro == 40 && ingredientesEspeciales==true) {
								resultado = 5500 + ING_ESP40;
							}
						}
					}
				}
			}
		}
		return resultado;
	}
	
	public double calcularArea(int diametro) {
		int radio=0;
		double area;
		radio= diametro / 2;
		area = PI * Math.pow(radio,2);
		return area;
	}
	
	public void mostrarDatos() {
		System.out.println("Diametro: "+this.getDiametro());
		System.out.println("Ingredientes especiales: "+this.isIngredientesEspeciales());
		System.out.println("Precio Pizza: $"+this.getPrecio());
		System.out.println("Area de la Pizza: "+this.getArea());
	}
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
}