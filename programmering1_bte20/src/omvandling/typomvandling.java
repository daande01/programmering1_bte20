package omvandling;


public class typomvandling {

	public static void main(String[] args) {

		String s="6.5";
		double d = 5.9;

		int i = (int) d;  // kapar decimalerna double till int

		System.out.println("i="+i);

		int avrundad=(int)(d+0.5); // avrundar till närmsta heltal double till int

		System.out.println("avrundad="+avrundad);


		String sträcka=Double.toString(d); // omvandlar double till String
		String sträcka2=""+d;     // omvandlar double till string

		String s2="5";

		int j=Integer.parseInt(s2); // omvandlar String till int



		double e=Double.parseDouble(s);// omvandlar String till double







	}



}
