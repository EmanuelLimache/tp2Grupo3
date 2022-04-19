package fi.unju.edu.ar.punto6;

import java.util.Scanner;

public class Alumno {
	public void estadoDeUnAlumno() {
		Scanner leer = new Scanner(System.in);
		boolean band=true;
		int numero=0;
			while(band==true) {
					System.out.println(" ");
					System.out.println("Ingrese un numero");
					numero = leer.nextInt();
					if (numero==6) {System.out.println(" Alumno regulariza");}
					if (numero>=7 && numero <=10) {System.out.println(" El alumno promociona");}
					if (numero>=1 && numero <6) {System.out.println(" El alumno desaprueba");}
					if (numero<=0) {System.out.println(" VALOR NO PERMITIDO ");
					band=false;}
					
			}
			leer.close();
	}
}
