package ExamenFinal.Ejercicio4;

public class Servidor implements IServidor {

	@Override
	public void ingresar(String usuario, String password) {
		System.out.println("Se est� atendiendo al usuario: " + usuario);

	}

}
