package ExamenFinal.Ejercicio1;

import java.util.Random;

public class Turista implements ITurista {
	private String nombre;
	private double montoDinero;
	private int ci;

	public Turista(String nombre, double montoDinero, int ci) {
		this.nombre = nombre;
		this.montoDinero = montoDinero;
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMontoDinero() {
		return montoDinero;
	}

	public void setMontoDinero(double montoDinero) {
		this.montoDinero = montoDinero;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	@Override
	public void visitar(LaPaz laPaz) {
		System.out.println("Visitando La Paz");
		Random rd = new Random();
		
		double dineroGastado=montoDinero*rd.nextDouble();
		System.out.println("Dinero Gastado "+dineroGastado);
		montoDinero-=dineroGastado;
		laPaz.setDineroTurismo(laPaz.getDineroTurismo()+dineroGastado);
		System.out.println("Nuevo dinero de turismo en La Paz: "+laPaz.getDineroTurismo());
		this.mostrarInfo();
	}

	@Override
	public void visitar(SantaCruz santaCruz) {
		System.out.println("Visitando Santa Cruz");
		double dineroGastado=(santaCruz.getNumeroProvincias()*0.5);
		System.out.println("Dinero Gastaado "+dineroGastado);
		montoDinero-=dineroGastado;
		santaCruz.setDineroTurismo(santaCruz.getDineroTurismo()+dineroGastado);
		System.out.println("Nuevo dinero de turismo en Santa Cruz: "+santaCruz.getDineroTurismo());

		this.mostrarInfo();
	}

	
	@Override
	public void visitar(Cochabamba cochabamba) {
		System.out.println("Visitando Cochabamba");
		double dineroGastado=(cochabamba.getNumeroHabitantes()*0.1);
		System.out.println("Dinero gastado "+dineroGastado);
		montoDinero-=dineroGastado;
		cochabamba.setDineroTurismo(cochabamba.getDineroTurismo()+dineroGastado);
		System.out.println("Nuevo dinero de turismo en Cochabamba: "+cochabamba.getDineroTurismo());

		this.mostrarInfo();
		
	}
	@Override
	public void mostrarInfo() {
		System.out.println("Info Turista");
		System.out.println("Nombre: "+nombre);
		System.out.println("CI: "+ci);
		System.out.println("Dinero: "+montoDinero);
	}

	
}
