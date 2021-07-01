package ExamenFinal.Ejercicio3;

public class Facebook implements Control{
	IRedSocial esc;

	public Facebook(IRedSocial esc) {
		this.esc = esc;
	}

	@Override
	public void mandar() {
		System.out.println("El amo está mandando");
		esc.obedecer();
	}
	
	
}
