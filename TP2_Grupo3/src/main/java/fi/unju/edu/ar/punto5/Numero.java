package fi.unju.edu.ar.punto5;

import java.util.Scanner;

public class Numero {
	public void NumeroCorrespoondeAunMes() {
		
		Scanner leer = new Scanner(System.in);
		boolean band=true;
		int numero=0;
		
			while(band==true) {
					System.out.println(" ");
					System.out.println("Ingrese un numero");
					numero = leer.nextInt();
					
					switch(numero) {
					  case 1:
					    System.out.println("corresponde a Enero");
					    break;
					  case 2:
					    System.out.println("corresponde a Febrero."); break;
					  case 3:
					    System.out.println("corresponde a Marzo"); break;
					  case 4:
					  	System.out.println("corresponde a Abril"); break;
					  case 5:
					  	System.out.println("corresponde a Mayo"); break;
					  case 6:
					  	System.out.println("corresponde a Junio"); break;
					  case 7:
					  	System.out.println("corresponde a Julio"); break;
					  case 8:
					  	System.out.println("corresponde a Agosto"); break;
					  case 9:
					  	System.out.println("corresponde a Septiembre"); break;
					  case 10:
					  	System.out.println("corresponde a Octubre"); break;
					  case 11:
					  	System.out.println("correpsonde a Noviembre"); break;
					  case 12:
					  	System.out.println("corresponde a Diciembre");	break;
					  default:
					    System.out.println(" No existe ese mes ");
					    System.out.println(" Fin del programa");
					    band=false;
					}
			}
			leer.close();
	}
}
