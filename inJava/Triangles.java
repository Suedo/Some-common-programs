package inJava;

public class Triangles {

	public void t1(int num) {

		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public void upward(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void downward(int num) {
		for (int i = num - 1, step = 0; i >= 0; i--, step++) {
			for (int j = 0; j < step; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				// this needs i to end as 0 to print out the apex "*"
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Triangles t = new Triangles();
		System.out.println("printing upward pointing triangle\n");
		t.upward(5);
		System.out.println("\nprinting downward pointing triangle\n");
		t.downward(5);
		System.out.println("\nprinting left aligned number triangle\n");
		t.t1(5);

	}
}
