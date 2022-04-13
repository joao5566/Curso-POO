
public class ProgramaHeranca {

	public static void main(String[] args) {
		
		HerancaPai pai = new HerancaPai();
		HerancaFilho filho = new HerancaFilho();
		System.out.println(pai.imprimir());
		System.out.println(filho.mostrar());
		System.out.println(filho.imprimir());
	}
	
}
