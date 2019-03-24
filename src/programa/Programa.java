package programa;

import java.util.Locale;
import java.util.Scanner;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo x;
		
		x = new Retangulo();
		
		
		System.out.println("Digite a altura do retangulo:");
		x.a = sc.nextDouble();
		System.out.println("Digite a base do retangulo:");
		x.b = sc.nextDouble();
		
		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal();
		
		
		System.out.printf("A area do retangulo é: %.2f%n",area);
		System.out.printf("O perimetro do retangulo é: %.2f%n",perimetro);
		System.out.printf("A diagonal do retangulo é: %.2f%n",diagonal);
		
		
		sc.close();
		

	}

}
