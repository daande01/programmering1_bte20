package metoder;

public class Stars {

	public static void romb(int h, int b) {

		for (int i = 0; i < h; i++) {

			for (int k = 0; k < b; k++) {
				System.out.print("*");
			}
			System.out.println("");
			for (int d = -1; d < i; d++) {
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {
		Stars.romb(5, 10);
	}

}
