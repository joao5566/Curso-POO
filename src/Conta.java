
class Conta {
	protected int numero;
	protected double saldo;
	protected Agencia agencia;
	protected Cliente titular;

	Conta (Cliente cliente){
		this.titular = cliente;
		this.saldo = 0;
	}
	
	protected void setNumero(int num) {
		this.numero = num;
	}	
	
	protected int getNumero() {
		return this.numero;
	}
	
	protected void setAgenticia(Agencia agen) {
		this.agencia = agen;
	}
	
	protected Agencia getAgencia() {
		return this.agencia;
	}
	
	protected void setTitular(Cliente cliente) {
		this.titular = cliente;
	}
	
	protected Cliente getTitular() {
		return this.titular;
		
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
	protected boolean transferir(Conta destino,double valor) {
		boolean sacou =this.saca(valor);
		
		if(sacou == false) {
		
			return false;
		}else {
			destino.deposita(valor);
			return true;
			
		}
		
		
	}
	
}