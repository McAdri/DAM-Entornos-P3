package main.java.ieseuropa;

public class CalcularLongitud {
	
	private static int calcularLongitud(String nombre) {
		return nombre.length();
	}

	public static void main(String[] args) {
		String nombre = "Pepito";
		System.out.println("La longitud de la cadena es de " + calcularLongitud(nombre) + " letras");
	}
}
