package inJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PrimeNumbers {
	private boolean[] arr;

	public void go() {
		String line = null;
		try (BufferedReader r = new BufferedReader(new InputStreamReader(
				System.in))) {

			System.out.println("press q to quit");

			while (true) {
				System.out.print("\nenter num : ");
				if ((line = r.readLine()).equals("q"))
					break;
				calc(Integer.parseInt(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Sieve of Eratosthenes
	 */
	private void calc(final int num) {
		arr = new boolean[num + 1]; // for cases when num = prime

		for (int i = 2; i <= num; i++) {
			arr[i] = true;
		}

		for (int i = 2; i <= num; i++) {
			for (int j = 2 * i; j <= num; j = j + i) {
				if (arr[j])
					arr[j] = false;
			}
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i])
				System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		new PrimeNumbers().go();
	}
}
