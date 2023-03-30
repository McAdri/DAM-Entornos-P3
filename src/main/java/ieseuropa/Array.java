package main.java.ieseuropa;

public class Array {

	private static int maxArray(int[] array) {
		int max = 0;
		for (int num : array) {
			if (num > max)
				max = num;
		}
		return max;
	}
	
	public static int calcularMinimo(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(maxArray(array));
		System.out.println(calcularMinimo(array));
	}

}
