
public class Teste {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		cli.setNome("João Vitor Rodrigues");
		Conta c = new Conta(cli,2100);
		
		System.out.println("Codigo da Agencia: ");
	}

}

