package metoder;

public class övnprovmetoder {

	public static void main(String[] args) {


		int b=10;
		int h=10;

		double a=beräknaAreaTriangel(b,h);

		System.out.println(a);


	}

	public static double beräknaAreaTriangel(int b, int h) {

		double area=h*b/2;


		return area;
	}



}
