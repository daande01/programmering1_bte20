package loopar;

public class Rik {


	public static void main(String[] args) {

		int f�rm�genhet=0;
		int dagsL�n=1;
		int dagar=0;

		while(f�rm�genhet<=1000000000) {

			dagar++;
			f�rm�genhet+=dagsL�n;
			System.out.println(f�rm�genhet);
			dagsL�n*=2;

		}


		System.out.println("det tar"+dagar+"dagar att spara ihop"+f�rm�genhet+"kr");





	}




}
