
public class Teste {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("João Vitor Rodrigues");
		Conta c = new Conta(cli,2500);
		
		System.out.println("Cliente " + c.getTitular().getNome());
		System.out.println("Limite " + c.getLimite());
	}

}

