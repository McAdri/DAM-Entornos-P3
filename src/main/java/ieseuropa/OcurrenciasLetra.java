package main.java.ieseuropa;

public class OcurrenciasLetra {
	public static int contarLetra(String cadena, char letra) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		System.out.println("Número de ocurrencias:  " + contarLetra("Hola mundo", 'o'));

	}
}
