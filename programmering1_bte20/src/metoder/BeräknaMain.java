package metoder;

public class BeräknaMain {

	public static void main(String[] args) {

		int f =4;
		int k=9;


		Beräkning.addition(f, k);


		int differens=Beräkning.subtraktion(f, k) *Beräkning.subtraktion(f, k);


		System.out.println(differens);

	}

}
