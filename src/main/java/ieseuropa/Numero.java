package main.java.ieseuropa;

import java.util.ArrayList;

public class Numero {

	public static boolean numArmstrong(int num) {
		int suma = 0;
		int aux = num;
		int numDigitos = String.valueOf(num).length();
		while (num != 0) {
			int digito = num % 10;
			suma += Math.pow(digito, numDigitos);
			num /= 10;
		}
		if (suma == aux) {
			return true;
		} else {
			return false;
		}
	}

	private static String seriePell() {
		return "0-1-2-5-12-29-70-169-408-985-2378-5741-13860-33461-80782";
	}
	private static boolean numSuerte(int num) {
		if (num > 0) {
			ArrayList<Integer> numeros = new ArrayList<>();
			for (int i = 1; i <= num; i++) {
				numeros.add(i);
			}
			for (int i = 1; i < numeros.size(); i += 2) {
				numeros.remove(i);
			}
			for (int i = 2; i < numeros.size(); i += 3) {
				numeros.remove(i);
			}
			for (int i = 6; i < numeros.size(); i += 7) {
				numeros.remove(i);
			}
			return numeros.contains(num);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(seriePell());
		System.out.println(numArmstrong(150));
		System.out.println(numSuerte(87));

	}

}
