package Examen;

public class Secretaria extends Persona {
	private double salario;
	
	public Secretaria(int dni, String nombre, String apellido, double salario) {
		super(dni,nombre,apellido);
		this.salario = salario;
	}
	public void inscribirAlumnos() {
		System.out.println("Inscribiendo alumnos");
	}
	public void cobrarCuota() {
		System.out.println("Cobrando la cuota");
	}
	public void verDatos() {
		
	}
	
}
