package fi.unju.edu.ar.punto13;

import java.time.LocalDate;


public class Empleado {
	private String nombre;
	private LocalDate fechaDeIngreso;
	private int legajo;
	private String email;
	private int sueldo;
	private int horasTrabajadas;
	
	public Empleado() {}

	public Empleado(String nombre, LocalDate fechaDeIngreso, int legajo, String email, int sueldo, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaDeIngreso = fechaDeIngreso;
		this.legajo = legajo;
		this.email = email;
		this.sueldo = sueldo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	

	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		legajo= -9999;
		fechaDeIngreso=LocalDate.of(1900, 01, 01);
		
	}

	public Empleado(String nombre, LocalDate fechaDeIngreso, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaDeIngreso = fechaDeIngreso;
		this.horasTrabajadas = horasTrabajadas;
		legajo= -9999;
	}

	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
		fechaDeIngreso=LocalDate.of(1900, 01, 01);
	}

	public void asignarSueldo(Empleado a,int horas) {
		int b =0;
		if(horas >0 && horas<161) {
			b=horas*600;
		}else {
			b=horas*650;
		}
		a.setSueldo(b);}
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + nombre + ", FechaDeIngreso=" + fechaDeIngreso + ", Legajo=" + legajo + ", Email="
				+ email + ", Sueldo=" + sueldo + ", HorasTrabajadas=" + horasTrabajadas + "]";
	}

	public void mostrarEmpleado() {
		
		System.out.println("***DATOS DEL EMPLEADO*** ");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Fecha de Ingreso: "+getFechaDeIngreso());
		System.out.println("Legajo: "+getLegajo());
		System.out.println("Email: "+getEmail());
		System.out.println("Sueldo: $"+getSueldo());
		System.out.println("Horas trabajadas: "+getHorasTrabajadas()+" hs");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
		
	
	
	
	
}
