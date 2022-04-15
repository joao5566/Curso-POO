
public class ContaPoupanca extends Conta {
	private int diaDoAniversario;
	private double juros = 0.5;
	ContaPoupanca(Cliente cliente, int dia){
		super(cliente);
		this.diaDoAniversario = dia;
	}
	
	public int getdiaDoAniversario() {
		return diaDoAniversario;
		
	}
	
	public void imprimeExtradoCompleto() {
		System.out.println("EXTRATO DA CONTA POUPANÇA");
		System.out.println("Saldo: " + this.saldoAtual());
		System.out.println("Aniversário: "+ this.getdiaDoAniversario());
		System.out.println("Juros: " + this.saldoAtual()* this.juros);
		System.out.println("EXTRATO DA CONTA POUPANÇA");
		System.out.println("EXTRATO DA CONTA POUPANÇA");
		
	}
	
}
