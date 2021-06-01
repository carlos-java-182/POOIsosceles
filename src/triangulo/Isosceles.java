package triangulo;

public class Isosceles {

	// Atributos

	private double base;
	private double lado;

	// M�todos

	// M�todo constructor

	public Isosceles(double base, double lado) {

		this.base = base;
		this.lado = lado;
	}

	public double obtenerPerimetro() {

		double perimetro = ((2 * lado) + base);
		return perimetro;
	}

	public double obtenerArea() {
		double area = ((base * (Math.sqrt(Math.pow(lado, 2) - (Math.pow(lado, 2) / 4))) / 2));
		return area;
	}

	public String mostrarDatos() {

		return "\nEl largo es: " + lado + "\nLa base es: " + base + "\nEl �rea es: " + obtenerArea()
				+ "\n El per�metro es: " + obtenerPerimetro();

	}

}
