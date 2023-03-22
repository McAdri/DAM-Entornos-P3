package main.java.ieseuropa;

public class Numero {

	private static int factorial(int numero) {
		int resultado = 1;
		for (int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	private static void pellSeries() { 
		int pell1 = 0, pell2 = 1;
		for (int i = 0; i < 15; i++) {
			System.out.print(pell1 + " ");
			int nextPell = pell2 * 2 + pell1;
			pell1 = pell2;
			pell2 = nextPell;
		}
	}
	
	private static boolean esNumeroDeLaSuerte(int numero) {
		int suma = numero;
		while (suma != 1 && suma != 4) {
			int nuevaSuma = 0;
			while (suma > 0) {
				int digito = suma % 10;
				int cuadrado = digito * digito;
				nuevaSuma += cuadrado;
				suma /= 10;
			}
			suma = nuevaSuma;
		}
		return (suma == 1);
	}
	public static void main(String[] args) {
		int num = 5;
		System.out.println("El factorial de " + num + " es " + factorial(num));
		System.out.print("La serie de Pell: ");
		pellSeries();
		System.out.println("\n¿" + num + " es un número de la suerte? " + esNumeroDeLaSuerte(num));

	}

}
