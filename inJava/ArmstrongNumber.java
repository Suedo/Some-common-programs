package inJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArmstrongNumber {

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
				num = Integer.parseInt(line);
				if (calc(num))
					System.out.format("%d is an Armstrong number!\n", num);
				else
					System.out.format("%d is NOT an Armstrong number!\n", num);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	private boolean calc(final int num) {
		int temp = num, copy = num, sum = 0;
		while (copy > 0) {
			temp = copy % 10;
			copy = copy / 10;
			sum = sum + (int) Math.pow(temp, 3);
		}
		System.out.println("sum of digits of " + num + " is : " + sum);
		return sum == num;

	}

	public static void main(String[] args) {
		new ArmstrongNumber().calc();
	}
}
