package fi.unju.edu.ar.punto13;

import java.time.LocalDate;

public class Pricipal13 {

	public static void main(String[] args) {
		Empleado empleado= new Empleado();
		empleado.setNombre("Gabriel Aramayo");
		empleado.setLegajo(45);
		empleado.setEmail("aramayo@gmail.com");
		empleado.asignarSueldo(empleado, 167);
		empleado.setHorasTrabajadas(167);
		LocalDate fechaDeIngreso= LocalDate.of(2020, 10, 29);
		empleado.setFechaDeIngreso(fechaDeIngreso);
		empleado.mostrarEmpleado();
		
		
	}

}
