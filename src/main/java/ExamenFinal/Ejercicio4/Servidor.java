package ExamenFinal.Ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Servidor implements IServidor {
	List<String> usuarios= new LinkedList<String>();

	@Override
	public void ingresar(String usuario, String password) {
		System.out.println("Se está atendiendo y guardando al usuario: " + usuario);
		usuarios.add(usuario);

	}

}
