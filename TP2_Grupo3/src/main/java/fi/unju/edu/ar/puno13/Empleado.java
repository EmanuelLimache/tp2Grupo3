package fi.unju.edu.ar.puno13;


public class Empleado {
	private String Nombre;
	private Fecha FechaDeIngreso;
	private int Legajo;
	private String Email;
	private int Sueldo;
	private int HorasTrabajadas;
	
	public Empleado() {}

	public Empleado(String nombre, Fecha fechaDeIngreso, int legajo, String email, int sueldo, int horasTrabajadas) {
		super();
		this.Nombre = nombre;
		this.FechaDeIngreso = fechaDeIngreso;
		this.Legajo = legajo;
		this.Email = email;
		this.Sueldo = sueldo;
		this.HorasTrabajadas = horasTrabajadas;
	}

	public void asignarSueldo(Empleado a,int horas) {
		int b =0;
		if(horas >0 && horas<161) {
			b=horas*600;
		}else {
			b=horas*650;
		}
		a.setSueldo(b);
	}
	
	public void mostrarEmpleado(Empleado a,Fecha f) {
		
		System.out.println("***DATOS DEL EMPLEADO*** ");
		System.out.println("Nombre: "+a.getNombre());
		//System.out.println("Fecha de Ingreso: "+f.getDia()+"/"+f.getMes()+"/"+f.getAño());
		System.out.println("Fecha de Ingreso: "+a.FechaDeIngreso.getDia()+"/"+a.FechaDeIngreso.getMes()+"/"+a.FechaDeIngreso.getAño());
		System.out.println("Legajo: "+a.getLegajo());
		System.out.println("Email: "+a.getEmail());
		System.out.println("Sueldo: $"+a.getSueldo());
		System.out.println("Horas trabajadas: "+a.getHorasTrabajadas()+" hs");
		
	}
		
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Fecha getFechaDeIngreso() {
		return FechaDeIngreso;
	}

	public void setFechaDeIngreso(Fecha fechaDeIngreso) {
		FechaDeIngreso = fechaDeIngreso;
	}

	public int getLegajo() {
		return Legajo;
	}

	public void setLegajo(int legajo) {
		Legajo = legajo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getSueldo() {
		return Sueldo;
	}

	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}

	public int getHorasTrabajadas() {
		return HorasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		HorasTrabajadas = horasTrabajadas;
	}
	
	
	
	
}
