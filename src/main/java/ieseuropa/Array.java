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
	public static int[] arrayMenorAMayor(int[] datos) {
		for (int i = 0; i < datos.length - 1; i++) {
			for (int j = 0; j < datos.length - i - 1; j++) {
				if (datos[j] > datos[j + 1]) {
					int temp = datos[j];
					datos[j] = datos[j + 1];
					datos[j + 1] = temp;
				}
			}
		}
		return datos;
	}
	public static float mediana (int[] datos) {
		int [] ordenada= arrayMenorAMayor(datos);
		float mediana;
		if(ordenada.length%2!=0) {
			mediana=ordenada[ordenada.length/2];
		}
		else {
			float m1=ordenada[ordenada.length/2];
			System.out.println(m1);
			float m2=ordenada[ordenada.length/2-1];
			System.out.println(m2);
			mediana=(m1+m2)/2;
		}
		return mediana;
	}
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(maxArray(array));
		System.out.println(calcularMinimo(array));
	}

}
