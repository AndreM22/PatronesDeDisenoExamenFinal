package ExamenFinal.Ejercicio5;

public class MemoriaExterna implements IMarca {
	IMarca marca;
	int memoriaE;
	int costo;

	public MemoriaExterna(IMarca base, int memoriaE,int costo) {
		System.out.println("Se incorporó una memoria Externa");
		this.marca = base;
		this.memoriaE = memoriaE;
		this.costo=costo;
		this.setPrecio(marca.precio() + costo);
		this.setAlmacenamiento(marca.getAlmacenamiento() + memoriaE);

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
