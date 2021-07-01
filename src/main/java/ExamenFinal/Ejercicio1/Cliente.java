package ExamenFinal.Ejercicio1;

public class Cliente {

	public static void main(String[] args) {
		LaPaz lp = new LaPaz(40,100,"Frio",10000);
		SantaCruz sc = new SantaCruz(20, 2000, "Calido", 15000);
		Cochabamba cb = new Cochabamba(15, 2000, "Templado", 10000);
		
		ITurista t = new Turista("Andre",10000,1235639);

		sc.serVisitado(t);
		lp.serVisitado(t);
		cb.serVisitado(t);

		

	}

}
