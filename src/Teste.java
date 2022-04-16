
public class Teste {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("João Vitor");
		ContaPoupanca cp = new ContaPoupanca(cli, 30);
		cp.deposita(1000);
		
		ContaCorrente cc = new ContaCorrente(cli, 2000);
		cc.deposita(500);
		
		System.out.println("--------------");
		cp.imprimeExtradoCompleto();
		System.out.println("--------------");
		cc.imprimeExtradoCompleto();
		
	}

}

