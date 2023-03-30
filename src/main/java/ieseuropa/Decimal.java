package main.java.ieseuropa;

public class Decimal {
	
	public static double redondearAlAlza(float numero) {
		return Math.ceil(numero);
	}
	
	public static int eliminarDecimales(float numero) {
		return (int) numero;
	}

	public static void ecuacionSegundoGrado(int a, int b, int c) {
		float discriminante = b * b - 4 * a * c;
		if (discriminante < 0) {
			System.out.println("La ecuación no tiene soluciones reales.");
		} else if (discriminante == 0) {
			double x = -b / (2 * a);
			System.out.println("La ecuación tiene una solución real: " + x);
		} else {
			double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("La ecuación tiene dos soluciones reales: " + x1 + " y " + x2);
		}
	}

	public static void main(String[] args) {
		System.out.println(redondearAlAlza((float) 23.45));
		System.out.println(eliminarDecimales((float) 23.45));
		ecuacionSegundoGrado(2,-7,3);
	}
}
