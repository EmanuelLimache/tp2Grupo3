package fi.unju.edu.ar.punto2;

import java.util.Scanner;

public class AnioBisiesto {
	
	public void determinarAnioBisiesto() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un año");
		int anio= leer.nextInt();
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
		
		leer.close();
		
	}
	
}
