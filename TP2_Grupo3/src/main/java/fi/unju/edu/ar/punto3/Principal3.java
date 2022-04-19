package fi.unju.edu.ar.punto3;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		
		//int num=0;
				Scanner entrada = new Scanner(System.in);
				Numero nuevoNumero =  new Numero();
			
				for(int i=1;i<6;i++){
					System.out.println(" ");
					System.out.println("Ingrese un numero");
					int nume= entrada.nextInt();
					boolean a=nuevoNumero.esPar(nume);
					if (a==true) {
						System.out.println("El numero ingresado es Par");
					}else {
						System.out.println("El numero ingresado es Impar");
					}
					System.out.println("Fin programa");
				}
				entrada.close();

		
	}

}
