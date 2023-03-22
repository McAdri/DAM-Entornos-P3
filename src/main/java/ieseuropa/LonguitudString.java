package main.java.ieseuropa;

public class LonguitudString {

	public static String devolverLongitud(String nombre) {
		int longitud = nombre.length();
		return "La longitud de la cadena es: " + longitud;
	}
	
	

	public static void main(String[] args) {
		System.out.println(devolverLongitud("Hola mundo"));

	}

}
