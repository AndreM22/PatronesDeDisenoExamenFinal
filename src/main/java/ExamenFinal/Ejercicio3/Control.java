package ExamenFinal.Ejercicio3;

import java.util.List;

public interface Control {
	void addEstudiante(String estudiante);
	void mostrarDatos();
	public String getNombre();
	public int getCapacidad();
	public List<String> getEstudiantes();
	public String getRequisitos();
}
