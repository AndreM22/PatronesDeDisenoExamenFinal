package ExamenFinal.Ejercicio5;

public class Cliente {

	public static void main(String[] args) {
		IMarca apple = new Apple(5, 6, 32, 1000);

		IMarca samsung = new Samsung(8, 10, 16, 1000);

		IMarca xiaomi = new Xiaomi(3, 25, 8, 1000);

		apple.mostrarInfo();
		samsung.mostrarInfo();
		xiaomi.mostrarInfo();

		apple = new Carcasa(apple, 50);

		samsung = new VidrioTemplado(samsung, 100);

		xiaomi = new MemoriaExterna(xiaomi, 64, 300);

		System.out.println("*************************");

		apple.mostrarInfo();
		samsung.mostrarInfo();
		xiaomi.mostrarInfo();

	}

}
