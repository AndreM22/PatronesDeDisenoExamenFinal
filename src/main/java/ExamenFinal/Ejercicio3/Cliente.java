package ExamenFinal.Ejercicio3;

public class Cliente {

	public static void main(String[] args) {
		Control amo = new Facebook(new ConcreteEsclavo());
		amo.mandar();

	}

}
