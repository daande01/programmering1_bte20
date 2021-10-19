import java.util.Scanner;

public class Trestegsfinal {
	public static void main(String[] args) {

		double max = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("ange ett resultat");

		double längd = sc.nextDouble();

		while (längd > 0) {

			if (längd > max) {

				max = längd;

			}

			System.out.println("ange ett resultat");

			längd = sc.nextDouble();

		}
		System.out.print("max:"+max);
	}
}
