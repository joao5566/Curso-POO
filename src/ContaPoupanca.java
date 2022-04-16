
public class ContaPoupanca extends Conta {
	private int diaDoAniversario;
	ContaPoupanca(Cliente cliente, int dia){
		super(cliente);
		this.diaDoAniversario = dia;
	}
	
	public int getdiaDoAniversario() {
		return diaDoAniversario;
		
	}
	
	
	@Override
	public void imprimeExtradoCompleto() {
		double total = 0;
		total = (saldoAtual() *0.05+ this.saldoAtual());
		System.out.println("EXTRATO DA CONTA POUPANÇA");
		System.out.println("Saldo: " + this.saldoAtual());
		System.out.println("Aniversário: "+ this.getdiaDoAniversario());
		System.out.println("Juros: " + this.saldoAtual()*0.05);
		System.out.println("Saldo total: " + total);
		
	}
	
}
