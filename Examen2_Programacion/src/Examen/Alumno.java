package Examen;

import java.util.ArrayList;

public class Alumno extends Persona {
	private int legajo;
	private ArrayList<Carrera> carrera;
	
	public Alumno (int dni, String nombre, String apellido, int legajo, ArrayList<Carrera> carrera) {
		super (dni, nombre, apellido);
        this.legajo = legajo;
        this.carrera = carrera;
	}
	public void verCronogramaCarrera() {
		System.out.println("Cronograma de la carrera");
	}
	public void verDatos() {
		
	}

}
