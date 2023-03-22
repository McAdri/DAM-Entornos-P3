package main.java.ieseuropa;

public class CalcularMaximo {

	public static int valorMaximo(int[] numeros) {
		int maxValue = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maxValue) {
				maxValue = numeros[i];
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 50, 20, 15 };
		int maxValue = valorMaximo(numbers);
		System.out.println("Valor máximo: " + maxValue);
	}

}
