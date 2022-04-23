package fi.unju.edu.ar.punto14;
import java.time.LocalDate;

import fi.unju.edu.ar.punto13.Empleado;
public class Principal14 {

	public static void main(String[] args) {
		//Creacion de 4 objetos de la clase empleando.
		Empleado empleado1 =new Empleado();
		Empleado empleado2 =new Empleado("Jose",1,15); //nombre, legajo y hs trabajadas
		LocalDate f=LocalDate.of(2020, 10, 29);
		Empleado empleado3 =new Empleado("Marcos",f,24); //name,fecha,horas
		Empleado empleado4 =new Empleado("Melani",23);//nombre,hs trabajadas
		
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
	}

}
