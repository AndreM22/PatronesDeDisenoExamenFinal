package ExamenFinal.Ejercicio5;

public class Cliente {

	public static void main(String[] args) {
		IMarca o = new Apple();
		o.operacion();

		o = new Carcasa(o);
		o.operacion();

	}

}
