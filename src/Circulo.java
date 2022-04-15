
public class Circulo extends Figura{
	
	private double raio;
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	public double area() {
		double area = 0;
		area = 3.14 *raio*raio;
		return area;
		
	}
	
}
