
public class Teste {

	public static void main(String[] args) {
		Agencia ag = new Agencia(1);
		Conta c1 = new Conta();
		
		c1.deposita(100);	
		System.out.println("Codigo da Agencia: "+ ag.getCodigo());
	}

}

