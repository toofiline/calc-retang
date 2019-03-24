package entidades;

public class Retangulo {
	public double a;//altura
	public double b;//base
	public double area;
	public double perimetro;
	public double diagonal;
	
	public double area() {
		return b * a;
	}
	
	public double perimetro() {
		return a + b;
	}
	
	public double diagonal() {
		return Math.sqrt((b*b) + (a*a));
	}
	
	public String toString() {
		return area
				+ String.format("%.2f", area)
				+ perimetro
				+ String.format("%.2f", perimetro)
				+ diagonal
				+ String.format("%.2f", diagonal);
				
	}

}
