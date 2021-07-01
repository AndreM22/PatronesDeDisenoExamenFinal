package ExamenFinal.Ejercicio3;

public class Cliente {

	public static void main(String[] args) {
		Control colegio = new Colegio("Colegio1", 1000, new Facebook(), "Vestimenta apropiada");

		Control universidad = new Universidad("Universidad1", 5000, new WhatsApp(), "Haber completado el colegio");

		Control escuela = new Escuela("Escuela1", 500, new Twitter(), "Portarse bien");

		colegio.addEstudiante("Andre");
		colegio.addEstudiante("Diego");

		universidad.addEstudiante("Sergio");
		universidad.addEstudiante("Nelson");

		escuela.addEstudiante("Samantha");
		escuela.addEstudiante("Lucia");

		colegio.mostrarDatos();
		universidad.mostrarDatos();
		escuela.mostrarDatos();
	}

}
