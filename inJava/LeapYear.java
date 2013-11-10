package inJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeapYear {

	public void go() {
		String line = null;
		try (BufferedReader r = new BufferedReader(new InputStreamReader(
				System.in))) {

			System.out.println("press q to quit");

			while (true) {
				System.out.print("\nenter num : ");
				if ((line = r.readLine()).equals("q"))
					break;
				if (calc(Integer.parseInt(line)))
					System.out.format("%s is a Leap Year", line);
				else
					System.out.format("%s is NOT a Leap Year", line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean calc(final int num) {
		if ((num % 100) != 0)
			return (num % 4) == 0;
		return (num % 400) == 0;
	}

	public static void main(String[] args) {
		new LeapYear().go();
	}
}
