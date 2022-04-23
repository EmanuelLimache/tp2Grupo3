package fi.unju.edu.ar.punto15;
import java.time.Period;
import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	//--------------------------------------------------------------
	public void edad() {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(getFechaDeNacimiento(), ahora);
		System.out.printf("Edad: %s años",periodo.getYears());

		/*System.out.printf("Edad: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
		*/
	}
	
	public String signoDelZodiaco() {
		int mes= getFechaDeNacimiento().getMonthValue();
		int dia=getFechaDeNacimiento().getDayOfMonth();
		String signo="";
		 switch (mes) {
	        case 1:
	            if (dia > 21) {
	                signo = "ACUARIO";
	            } else {
	                signo = "CAPRICORNIO";
	            }
	            break;
	        case 2:
	                if (dia > 19) {
	                    signo = "PISCIS";
	                } else {
	                    signo = "ACUARIO";
	                }
	                break;
	        case 3:
	                if (dia > 20) {
	                    signo = "ARIES";
	                } else {
	                    signo = "PISCIS";
	                }
	                break;
	        case 4:
	                if (dia > 20) {
	                    signo = "TAURO";
	                } else {
	                    signo = "ARIES";
	                }
	                break;
	        case 5:
	                if (dia > 21) {
	                    signo = "GEMINIS";
	                } else {
	                    signo = "TAURO";
	                }
	                break;
	        case 6:
	                if (dia > 20) {
	                    signo = "CANCER";
	                } else {
	                    signo = "GEMINIS";
	                }
	                break;
	        case 7:
	                if (dia > 22) {
	                    signo = "LEO";
	                } else {
	                    signo = "CANCER";
	                }
	                break;
	        case 8:
	                if (dia > 21) {
	                    signo = "VIRGO";
	                } else {
	                    signo = "LEO";
	                }
	                break;
	        case 9:
	                if (dia > 22) {
	                    signo = "LIBRA";
	                } else {
	                    signo = "VIRGO";
	                }
	                break;
	        case 10:
	                if (dia > 22) {
	                    signo = "ESCORPION";
	                } else {
	                    signo = "LIBRA";
	                }
	                break;
	        case 11:
	                if (dia > 21) {
	                    signo = "SAGITARIO";
	                } else {
	                    signo = "ESCORPION";
	                }
	                break;
	        case 12:
	                if (dia > 21) {
	                    signo = "CAPRICORNIO";
	                } else {
	                    signo = "SAGITARIO";
	                }
	        break;
		 }
		 return signo;
	}
	
	public String estacion() {
		String estacyon="";
		int mes= getFechaDeNacimiento().getMonthValue();
		int dia=getFechaDeNacimiento().getDayOfMonth();
		switch (mes) {
		case 1: estacyon = "Verano"; break;
        case 2: estacyon = "Verano"; break;
        case 3:
            if (dia >= 21) {
                estacyon = "Otoño";
                }else {
                	estacyon = "Verano";
                }break;
        case 4: estacyon = "Otoño"; break;
        case 5: estacyon = "Otoño"; break;
        case 6:
                if (dia < 21 ) {
                    estacyon = "Otoño";}
                else {
                	estacyon = "Invierno";
                }
                break;        
		case 7: estacyon = "Invierno"; break;
        case 8: estacyon = "Invierno"; break;
        case 9:
                if (dia < 21) {
                    estacyon="Invierno";
                } else {
                    estacyon = "Primavera";
                }
                break;
        case 10: estacyon="Primavera";
        case 11: estacyon="Primavera";
        case 12: 
        	if (dia < 21) {
                estacyon="Primavera";
            } else {
                estacyon = "Verano";
            }
            break;
		}
	return estacyon;
	}
	public void mostrar() {
		System.out.println("Datos Persona");
		System.out.println("Nombre: "+getNombre());
		edad();
		System.out.println("");
		System.out.println("Signo del zodiaco: "+signoDelZodiaco());
		System.out.println("Estacion: "+estacion());
	}
	
	
	//---------------------------------------------------------------
	public Persona() {
	}

	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	//------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
}
