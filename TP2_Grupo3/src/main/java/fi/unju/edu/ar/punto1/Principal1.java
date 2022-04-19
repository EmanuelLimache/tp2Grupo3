package fi.unju.edu.ar.punto1;
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		boolean band=true;
		int numero=0;
		int resultado;
			while(band==true) {
					System.out.println("Ingrese un numero");
					numero = leer.nextInt();
					if (numero>=0 && numero <11) {	
					band=false;
				}
			}
			leer.close();
		
			Numero calcular= new Numero();
			resultado=calcular.calcularFatorial(numero);
			System.out.println("El factorial de "+numero+" es: "+resultado);
		}
	

}
