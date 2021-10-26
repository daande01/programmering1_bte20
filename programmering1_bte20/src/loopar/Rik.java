package loopar;

public class Rik {


	public static void main(String[] args) {

		int förmögenhet=0;
		int dagsLön=1;
		int dagar=0;

		while(förmögenhet<=1000000000) {

			dagar++;
			förmögenhet+=dagsLön;
			System.out.println(förmögenhet);
			dagsLön*=2;

		}


		System.out.println("det tar"+dagar+"dagar att spara ihop"+förmögenhet+"kr");





	}




}
