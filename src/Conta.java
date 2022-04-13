
class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Agencia agencia;
	private Cliente titular;

	Conta (Cliente cliente, double limite){
		this.titular = cliente;
		this.saldo = 0;
		this.limite = limite;
	}
	
	public void setNumero(int num) {
		this.numero = num;
	}	
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgenticia(Agencia agen) {
		this.agencia = agen;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}
	
	public Cliente getTitular() {
		return this.titular;
		
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	public double getLimite() {
		return this.limite;
		
	}
	
	void deposita(double valor) {
		this.saldo += valor;
		
	}
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
			
		}else {
			this.saldo -= valor;
			return true;
		}
			
		
	}
	double saldoAtual(){
		return this.saldo;
		
	}
	public boolean transferir(Conta destino,double valor) {
		boolean sacou =this.saca(valor);
		
		if(sacou == false) {
		
			return false;
		}else {
			destino.deposita(valor);
			return true;
			
		}
		
		
	}
	
}