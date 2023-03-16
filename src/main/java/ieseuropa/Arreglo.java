package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	public static void ordenar(int [] a) {
		Arrays.sort(a);
	}
	
	public static double mediana (int [] a) {
		ordenar(a);
		double mediana = 0;
		if (a.length % 2 != 0) {
			mediana = a[(a.length/2)];
		}else {
			int n = a[a.length / 2 - 1];
			int m = a[a.length / 2];
			mediana = (n+m) / 2;
		}
		return mediana;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,4,5,9,3,1,7};
		ordenar(a);
		System.out.println(mediana(a));
		System.out.println(Arrays.toString(a));
	}

}
