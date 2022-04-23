package fi.unju.edu.ar.punto15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona1= new Persona();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse("21/09/1993", fmt);
		persona1.setNombre("Gisel");
		persona1.setFechaDeNacimiento(fechaNac);
		
		persona1.mostrar(); }

}
