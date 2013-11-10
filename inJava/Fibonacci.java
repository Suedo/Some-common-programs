package inJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Fibonacci {

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

	private void calc(final int num) {
		int f1 = 1, f2 = 1, temp = f2;
		if (num <= 2) {
			System.out.println(f1);
			System.out.println(f2);
		} else {
			System.out.print(f1);
			System.out.print(" " + f2);
			for (int i = 3; i <= num; i++) {
				temp = f1 + f2;
				f1 = f2;
				f2 = temp;
				System.out.print(" " + temp);

			}
		}

	}

	public static void main(String[] args) {
		new Fibonacci().go();
	}
}
