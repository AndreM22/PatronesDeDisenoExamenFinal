package ExamenFinal.Ejercicio5;

public class Carcasa implements IMarca {
	IMarca marca;
	int aumento;
	
	
	public Carcasa(IMarca base, int aumento) {
		this.marca = base;
		this.aumento=aumento;
		this.setPrecio(aumento);
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
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getCpu() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setCpu(int cpu) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getAlmacenamiento() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setAlmacenamiento(int almacenamiento) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		
	}

}
