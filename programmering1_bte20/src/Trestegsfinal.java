import java.util.Scanner;

public class Trestegsfinal {
	public static void main(String[] args) {

		double max = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("ange ett resultat");

		double l�ngd = sc.nextDouble();

		while (l�ngd > 0) {

			if (l�ngd > max) {

				max = l�ngd;

			}

			System.out.println("ange ett resultat");

			l�ngd = sc.nextDouble();

		}
		System.out.print("max:"+max);
	}
}
