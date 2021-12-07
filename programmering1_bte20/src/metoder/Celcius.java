package metoder;

public class Celcius {

	public static double fToC(double f) {

		double c = ((f - 32) * 5) / 9;

		return c;
	}

	public static void main(String[] args) {

		//klass.metod
		double cc=Celcius.fToC(32);
		System.out.println(cc);
	}
}
