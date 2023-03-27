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

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(maxArray(array));
	}

}
