
public class Polimorfismo {

	public static void main(String[] args) {
		
		Figura circulo = new Circulo(10);
		Figura reta = new Retangulo(2,20);
		Figura tri = new Triangulo(5,4);
		Figura quad = new Quadrado(10);
		
		
		System.out.println("Area do Circulo = "+circulo.area());
		System.out.println("Area do Retangulo = "+reta.area());
		System.out.println("Area do Triangulo = "+tri.area());
		System.out.println("Area do Quadrado = "+quad.area());
		
	}
	
}



