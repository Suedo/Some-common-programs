package inJava;

import java.util.Arrays;

public class PascalsTriangle {

	private double factorial(int num) {
		double acc = 1;
		for (int i = num; i > 1; i--)
			acc = acc * i;
		return acc;
	}

	private int nCr(int n, int r) {
		return (int) ((factorial(n)) / (factorial(n - r) * factorial(r)));
	}

	private void display(int[] arr, int height) {
		int index = 0;
		for (int h = 0; h < height; h++) {
			int elems = h + 1;
			for (int j = 0; j < elems; j++) {
				System.out.print(arr[index++]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pascal(int height) {
		int[] arr = new int[height * (height + 1) / 2];
		int index = 0;
		/**
		 * h : height at each turn <br/>
		 * elems : num of row elements at a particular height
		 */
		for (int h = 0; h < height; h++) {
			int elems = h + 1;
			for (int j = 0; j < elems; j++) {
				arr[index++] = nCr(h, j);
			}
		}
		// System.out.println(Arrays.toString(arr)); // just for testing
		display(arr, height);
	}

	public static void main(String[] args) {
		new PascalsTriangle().pascal(6);
	}
}
