
public class Teste {

	public static void main(String[] args) {
		Agencia ag = new Agencia(1);
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.deposita(100);
		
		c1.transferir(c1, 10);
		System.out.println("Codigo da Agencia: "+ ag.getCodigo());
	}

}

