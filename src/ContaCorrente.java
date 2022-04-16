
public class ContaCorrente extends Conta {
	
	private int diasUsado =0;
	private double limite;
	ContaCorrente(Cliente cliente,double limite){
		super(cliente);
		this.limite = limite;
	}
	
	public int getDiasUsados() {
		return this.diasUsado;
	}
	
	public void setDiasUsado(int diasUsado) {
		this.diasUsado = diasUsado;
		
	}
	
	public double getlimite() {
		return this.limite;
		
	}
	
	public void setlimite(double limite) {
		this.limite = limite;
		
	}
	
	@Override
	public void imprimeExtradoCompleto() {
		double total = 0;
		total = this.saldoAtual()+ this.getlimite();
		System.out.println("EXTRATO DA CONTA CORRENTE");
		System.out.println("Saldo: "+ this.saldoAtual());
		System.out.println("limite: "+this.getlimite());
		System.out.println("juros: "+this.saldoAtual()*(0.02*this.getDiasUsados()));
		System.out.println("Saldo Disponivel: "+ total);
		
	}
	
}
