package ExamenFinal.Ejercicio2;

public class Cliente {

	public static void main(String[] args) {
		CuadraTrack g = new Gasolina();
		CuadraTrack d = new Diesel();
		CuadraTrack ge = new GasolinaEspecial();

		CuadraTrack ace = new AdaptarCuadratrackElectrico(new CuadraTrackElectrico());
		
		g.estadoCombustible();
		g.llenarGasolina(50);
		
		d.estadoCombustible();
		d.llenarGasolina(20);
		
		ge.estadoCombustible();
		ge.llenarGasolina(30);
		
		ace.estadoCombustible();
		ace.llenarGasolina(20);

	}

}
