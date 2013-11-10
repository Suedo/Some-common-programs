package inJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palindrome {

	public void go() {
		String line = null;
		try (BufferedReader r = new BufferedReader(new InputStreamReader(
				System.in))) {

			System.out.println("press q to quit");

			while (true) {
				System.out.print("\nenter data : ");
				if ((line = r.readLine()).equals("q"))
					break;
				if (calc(line))
					System.out.format("%s is a Palindrome", line);
				else
					System.out.format("%s is NOT a Palindrome", line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean calc(String line) {
		int f = 0, l = line.length() - 1;
		while (f <= l) {
			if (line.charAt(f++) != line.charAt(l--))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new Palindrome().go();
	}
}
