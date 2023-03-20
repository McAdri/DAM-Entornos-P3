package main.java.ieseuropa;

public class ArrayMayor {
	
	private static int calcularMaximo(Integer [] numerosArray) {
		int mayor = numerosArray[0];
		for (int i=0; i<numerosArray.length; i++) {
			if (numerosArray[i] > mayor) {
				mayor = numerosArray[i];
			}
		}
		return mayor;
	}

	public static void main(String[] args) {
		Integer [] numerosArray = {5, 7, 3, 20, 12, 22};
		System.out.println("El numero mayor es: " + calcularMaximo(numerosArray));
	}
}
