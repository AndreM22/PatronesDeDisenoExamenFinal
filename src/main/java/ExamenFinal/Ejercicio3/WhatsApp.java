package ExamenFinal.Ejercicio3;

public class WhatsApp implements IRedSocial {

	@Override
	public void mostrarIntegracion(Control c) {
		System.out.println("Mostrando datos desde WhatsApp");
		System.out.println("Sistema de: " + c.getNombre());
		System.out.println("Capacidad: " + c.getCapacidad());
		System.out.println("Requisitos: " + c.getRequisitos());
		System.out.println("Estudiantes:");
		for (String e : c.getEstudiantes()) {
			System.out.println("    " + e);
		}

	}

}