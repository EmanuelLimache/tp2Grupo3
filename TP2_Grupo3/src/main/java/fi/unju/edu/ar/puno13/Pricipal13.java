package fi.unju.edu.ar.puno13;

public class Pricipal13 {

	public static void main(String[] args) {
		Fecha fecha= new Fecha();
		Empleado emp= new Empleado();
		emp.setNombre("Gabriel Aramayo");
		fecha.setDia(12);
		fecha.setMes(5);
		fecha.setAño(2019);
		emp.setLegajo(45);
		emp.setEmail("aramayo@gmail.com");
		emp.asignarSueldo(emp, 167);  
		emp.setHorasTrabajadas(167);
		emp.setFechaDeIngreso(fecha);
		emp.mostrarEmpleado(emp, fecha);
		
	}

}
