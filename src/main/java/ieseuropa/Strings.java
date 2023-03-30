
	package main.java.ieseuropa;

	public class Strings {
		
	private static int CalcularLongitud(String cadena) {
			return cadena.length();
	}
    
	private static String borrarApariencias(String cadena, String borrar) {
		return cadena.replace(borrar, "");
	}
  
	private static String repetirLetras(String cadena) {
		String salida = "";
		for (int i = 0; i < cadena.length(); i++) 
			salida += cadena.charAt(i)+""+cadena.charAt(i);
		return salida;
	}
	
	public static void main(String[] args) {
		
		System.out.println(borrarApariencias("Real Zaragoza", "Real"));
		System.out.println(repetirLetras("La casa del lago"));
	}
