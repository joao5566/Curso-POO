
public class Quadrado extends Figura {
	double lado;
	
	Quadrado(double lado) {
		this.lado = lado;
		
	}
	
	public double area() {
		double area = 0;
		area = this.lado*lado;
		return area;
		
	}

}
