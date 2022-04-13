
public class HerancaFilho extends HerancaPai {
	
	public String mostrar() {
		return "Está é a classe filha";
		
	}
	
	public String imprimir() {
		return super.imprimir() + " - Este metodo é da classe filho";
		//return "Este metodo é da classe filho";
		
	}
		
}
 