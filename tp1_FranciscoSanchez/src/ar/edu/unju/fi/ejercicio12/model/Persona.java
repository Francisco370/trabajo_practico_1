package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {
		
	}
	
	public int edadPersona() {
		int edad;
		Calendar fecha = Calendar.getInstance();
		fecha.getTime();
		edad = fecha.get(Calendar.YEAR) - this.getFechaNacimiento().get(Calendar.YEAR);
		if(this.getFechaNacimiento().get(Calendar.DAY_OF_YEAR) > fecha.get(Calendar.DAY_OF_YEAR) )
			edad--;
		return edad;
	}
	
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String estacionDelAnio() {
		String estacion = null;
		int mes = this.getFechaNacimiento().get(Calendar.MONTH) + 1;
		int dia = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
		if((dia>=21 && mes>=3) || (dia<=20 && mes<=6))
        	estacion="Otonio";
        else{
        	if((dia>=21 && mes>=6) || (dia<=20 && mes<=9))
        		estacion="Invierno";
        	else{
        		if((dia>=21 && mes>=9) || (dia<20 && mes<=12))
        			estacion="Primavera";
        		else
        			estacion="Verano";
        	}
        }
		return estacion;
	}
	
	public String signoZodiacal() {
		String signo = null;
		int mes = this.getFechaNacimiento().get(Calendar.MONTH)+1;
		int dia = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
		if (mes == 1) {
			if (dia >= 21) {
				signo = "acuario";
	        } else {
	        	signo = "capricornio";
	        }
	    }
	    if (mes == 2) {
	        if (dia >= 19) {
	        	signo = "piscis";
	        } else {
	        	signo = "acuario";
	        }
	    }
	    if (mes == 3) {
	        if (dia >= 20) {
	        	signo = "aries";
	        } else {
	        	signo = "piscis";
	        }
	    }
	    if (mes == 4) {
	        if (dia >= 20) {
	        	signo = "tauro";
	        } else {
	        	signo = "Aries";
	        }
	    }
	    if (mes == 5) {
	        if (dia >= 21) {
	        	signo = "geminis";
	        } else {
	        	signo = "tauro";
	        }
	    }
	    if (mes == 6) {
	        if (dia >= 20) {
	        	signo = "cancer";
	        } else {
	        	signo = "geminis";
	        }
	    }
	    if (mes == 7) {
	        if (dia >= 22) {
	        	signo = "leo";
	        } else {
	        	signo = "cancer";
	        }
	    }
	    if (mes == 8) {
	        if (dia >= 21) {
	        	signo = "virgo";
	        } else {
	        	signo = "leo";
	        }
	    }
	    if (mes == 9) {
	        if (dia >= 22) {
	        	signo = "libra";
	        } else {
	        	signo = "virgo";
	        }
	    }
	    if (mes == 10) {
	        if (dia >= 22) {
	        	signo = "escorpion";
	        } else {
	        	signo = "libra";
	        }
	    }
	    if (mes == 11) {
	        if (dia >= 21) {
	        	signo = "sagitario";
	        } else {
	        	signo = "escorpion";
	        }
	    }
	    if (mes == 12) {
	        if (dia >= 21) {
	        	signo = "capricornio";
	        } else {
	        	signo = "sagitario";
	        }
	    }
	    return signo;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre : "+this.getNombre());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha de nacimiento: "+sdf.format(this.getFechaNacimiento().getTime()));
		System.out.println("Edad : "+edadPersona());
		System.out.println("Signo Zodiacal : "+signoZodiacal());
		System.out.println("Estacion : "+estacionDelAnio());
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}