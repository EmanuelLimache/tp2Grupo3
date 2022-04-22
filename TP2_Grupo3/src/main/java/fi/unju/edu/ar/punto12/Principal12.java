package fi.unju.edu.ar.punto12;

import java.util.Scanner;

public class Principal12 {

	public static void main(String[] args) {
		
		double g=9.8;
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese la altura");
		double altura=leer.nextDouble();
		double t=Math.sqrt(2*altura/g);
		System.out.println("Tiempo es: "+t);
		leer.close();
	}

}
