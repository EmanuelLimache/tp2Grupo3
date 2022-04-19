package fi.unju.edu.ar.punto4;

import java.util.Scanner;

public class Numero {

	public void NumeroCorrespoondeAunMes() {
		
		Scanner leer = new Scanner(System.in);
		boolean band=true;
		int numero=0;
		//int resultado;
			while(band==true) {
					System.out.println(" ");
					System.out.println("Ingrese un numero");
					numero = leer.nextInt();
					if (numero==1) {System.out.println(numero+ " = "+ " Enero");}
					if (numero==2) {System.out.println(numero+ " = "+ " Febrero");}
					if (numero==3) {System.out.println(numero+ " = "+ " Marzo");}
					if (numero==4) {System.out.println(numero+ " = "+ " Abril");}
					if (numero==5) {System.out.println(numero+ " = "+ " Mayo");}
					if (numero==6) {System.out.println(numero+ " = "+ " Junio");}
					if (numero==7) {System.out.println(numero+ " = "+ " Julio");}
					if (numero==8) {System.out.println(numero+ " = "+ " Agosto");}
					if (numero==9) {System.out.println(numero+ " = "+ " Septiembre");}
					if (numero==10) {System.out.println(numero+ " = "+ " Octubre");}
					if (numero==11) {System.out.println(numero+ " = "+ " Noviembre");}
					if (numero==12) {System.out.println(numero+ " = "+ " Diciembre");}
					if (numero==0 || numero>12) {band=false; System.out.println("No existe este mes");
					System.out.println("FIN DE MES");}
			}
			leer.close();
		
	}
	
}
