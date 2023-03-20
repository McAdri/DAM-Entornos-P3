package main.java.ieseuropa;

public class ArrayMenor {
	
	private static int calcularMinimo(Integer [] numerosArray) {
		int menor = numerosArray[0];
		for (int i=0; i<numerosArray.length; i++) {
			if (numerosArray[i] < menor) {
				menor = numerosArray[i];
			}
		}
		return menor;
	}

	public static void main(String[] args) {
		Integer [] numerosArray = {5, 7, 3, 20, 12, 22};
		System.out.println("El numero menor es: " + calcularMinimo(numerosArray));
	}
}
