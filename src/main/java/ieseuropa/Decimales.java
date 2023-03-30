package main.java.ieseuropa;

public class Decimales {
	
	private static float[] ecuacion2Grado(float a, float b , float c) {
		float raiz = (float) Math.sqrt(Math.pow(b, 2) -4 *a *c);
		return new float[] {(-b+raiz)/(2*a) ,(-b-raiz)/(2*a)};
	}

	private static int eliminarDecimales(float num) {
		return (int) num;
	}
	private static int redondear(float num) {
		return (int) Math.ceil(num);
	}
	public static void main(String[] args) {
		
		System.out.println(eliminarDecimales(15.03f));
    
		float ecuacion[] = ecuacion2Grado(2f, -7f, 3f);
		System.out.println("Solucion x1:"+ecuacion[0]+ " Solucion x2:"+ecuacion[1]);
		
		System.out.println(redondear(13.2f));
		
	}

}
