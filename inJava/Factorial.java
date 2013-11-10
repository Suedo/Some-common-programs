package inJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Factorial {

	public int calc() {
		int num = 0;
		String line = null;
		try (BufferedReader r = new BufferedReader(new InputStreamReader(
				System.in))) {
			System.out.println("press q to quit");
			while (true) {
				System.out.print("\nenter number : ");
				if ((line = r.readLine()).equals("q"))
					break;
				System.out.format("%d factorial is : %d",
						Integer.parseInt(line), calc(Integer.parseInt(line)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	private int calc(final int num) {
		int acc = 1;
		for (int i = 2; i <= num; i++)
			acc = i * acc;
		return acc;

	}

	public static void main(String[] args) {
		new Factorial().calc();
	}
}
