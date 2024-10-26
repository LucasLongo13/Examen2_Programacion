package Examen;
import java.util.ArrayList;


public class Carrera {
	private int codigo;
	private String titulo;
	private double cuotaMensual;
	private ArrayList<Materia> materias;
	
	public Carrera(int codigo, String titulo, double cuotaMensual) {
		this.codigo=codigo;
		this.titulo= titulo;
		this.cuotaMensual= cuotaMensual;
		this.materias= new ArrayList<>();
	}
	public Double cambiarValorCuota(double nuevoValor) {
		this.cuotaMensual=nuevoValor;
		return this.cuotaMensual;
	}
	private class Materia {
        private String nombre;

        public Materia(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }
	
}
