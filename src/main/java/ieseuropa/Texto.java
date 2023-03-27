package main.java.ieseuropa;

public class Texto {

	private static int calcularLongitud(String string) {
		return string.length();
	}

	private static String todoMayus(String string) {
		return string.toUpperCase();
	}

	private static String todoMinus(String string) {
		return string.toLowerCase();
	}

	private static int ocurrencias(char letra, String string) {
		int ocurrencias = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.toLowerCase().charAt(i) == Character.toLowerCase(letra)) {
				ocurrencias++;
			}
		}
		return ocurrencias;
	}

	public static void main(String[] args) {
		String bicho = "aaaaay mi madre el bicho";
		System.out.println(calcularLongitud(bicho));
		System.out.println(todoMayus(bicho));
		System.out.println(todoMinus(bicho));
		System.out.println(ocurrencias('a', bicho));
	}

}
