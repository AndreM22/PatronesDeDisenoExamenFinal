package ExamenFinal.Ejercicio5;

public class VidrioTemplado implements IMarca {
	IMarca marca;
	int aumento;

	public VidrioTemplado(IMarca base, int aumento) {
		System.out.println("Se incorporó un vidrio templado");
		this.marca = base;
		this.aumento = aumento;
		this.setPrecio(marca.precio() + aumento);
	}

	@Override
	public void mostrarInfo() {
		marca.mostrarInfo();

	}

	@Override
	public int getRam() {
		return marca.getRam();
	}

	@Override
	public void setRam(int ram) {
		marca.setRam(ram);

	}

	@Override
	public int getCpu() {
		// TODO Auto-generated method stub
		return marca.getCpu();
	}

	@Override
	public void setCpu(int cpu) {
		marca.setCpu(cpu);

	}

	@Override
	public int getAlmacenamiento() {
		// TODO Auto-generated method stub
		return marca.getAlmacenamiento();
	}

	@Override
	public void setAlmacenamiento(int almacenamiento) {
		marca.setAlmacenamiento(almacenamiento);

	}

	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return marca.precio();
	}

	@Override
	public void setPrecio(int precio) {
		marca.setPrecio(precio);

	}

}
