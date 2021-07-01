package ExamenFinal.Ejercicio5;

public class Samsung implements IMarca {
	int ram;
	int cpu;
	int almacenamiento;
	int precio;


	public Samsung(int ram, int cpu, int almacenamiento, int precio) {
		this.ram = ram;
		this.cpu = cpu;
		this.almacenamiento = almacenamiento;
		this.precio = precio;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Informacion de Samsung");
		System.out.println("Ram: " + ram + " GB");
		System.out.println("CPU: " + cpu + " de potencia");
		System.out.println("Almacenamiento: " + almacenamiento + " GB");
	}

	@Override
	public int getRam() {
		return this.ram;
	}

	@Override
	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public int getCpu() {
		return this.cpu;

	}

	@Override
	public void setCpu(int cpu) {
		this.cpu = cpu;

	}

	@Override
	public int getAlmacenamiento() {
		return almacenamiento;
	}

	@Override
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;

	}

	@Override
	public int precio() {
		return this.precio;
	}

	@Override
	public void setPrecio(int precio) {
		this.precio=precio;
		
	}

}