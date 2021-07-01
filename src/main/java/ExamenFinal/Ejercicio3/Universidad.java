package ExamenFinal.Ejercicio3;

import java.util.LinkedList;
import java.util.List;

public class Universidad implements Control {
	IRedSocial esc;
	String nombre;
	int capacidad;
	List<String> estudiantes = new LinkedList<String>();
	String requisitos;

	public Universidad(String nombre, int capacidad, IRedSocial esc, String requisitos) {
		this.esc = esc;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.requisitos = requisitos;
	}

	public IRedSocial getEsc() {
		return esc;
	}

	public void setEsc(IRedSocial esc) {
		this.esc = esc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<String> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<String> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	@Override
	public void addEstudiante(String estudiante) {
		estudiantes.add(estudiante);

	}

	@Override
	public void mostrarDatos() {
		System.out.println("**Mostrando datos de universidad**");
		esc.mostrarIntegracion(this);

	}

}
