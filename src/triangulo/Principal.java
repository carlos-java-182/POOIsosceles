package triangulo;

import java.util.Scanner;

public class Principal {
	
	
	
	public static double mayorArea(Isosceles triangulo[]) {
		
		double area=triangulo[0].obtenerArea();
		
		
		
		
		for(int i=1; i<triangulo.length; i++) {
			
			if(triangulo[i].obtenerArea()>area) {
				area=triangulo[i].obtenerArea();	
			}
		}
		
		return area;
		
	}
	
	
	
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		double base, lado;
		int nTriangulos;
		
		
		
		System.out.println("\nDigita el número de triangulos que vas a introducir");
		nTriangulos = entrada.nextInt();
		
		Isosceles triangulo []= new Isosceles[nTriangulos];
		
		
		for(int i=0; i<triangulo.length; i++) {
			
			System.out.println("Digita los valores para el triangulo "+i+".- :");
			
			System.out.print(i+".- \nDigita la base");
			base = entrada.nextDouble();
			
			System.out.print(i+".- \nDigita el lado ");
			lado = entrada.nextDouble();
			
			triangulo[i]= new Isosceles(base, lado);
			
			System.out.println("El perímetro es: "+triangulo[i].obtenerPerimetro());
			System.out.println("El área es: "+triangulo[i].obtenerArea());
			
		}
				
		
		
		
		
		System.out.println("El área del triángulo de mayor superficie es: "+mayorArea(triangulo));

	}

}
