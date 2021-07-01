package ExamenFinal.Ejercicio4;

public class Cliente {

	public static void main(String[] args) {
		Proxy proxy = new Proxy(new Servidor(), new Servidor());
		
		proxy.registrar("abc", "123"); //id 1 no primo
		proxy.registrar("def", "245");//id 2 primo
		proxy.registrar("ghi", "678");//id 3 primo
		proxy.registrar("jkl", "111");//id 4 no primo
		proxy.registrar("mno", "222");//id 5 primo
		proxy.registrar("pqr", "333");//id 6 no primo

		proxy.ingresar("abc", "222"); // ingreso incorrecto
		
		proxy.ingresar("abc", "123");
		proxy.ingresar("def", "245");
		proxy.ingresar("ghi", "678");
		proxy.ingresar("jkl", "111");
		proxy.ingresar("mno", "222");
		proxy.ingresar("pqr", "333");

	}

}
