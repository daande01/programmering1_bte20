package variabler;

public class Var5 {

	public static void main(String[] args) {


		char c=65;

		int i = c;  // tvingar med explesit typomvandling till att bli integer

		i=i+5;

		c =(char) i;



		System.out.println(c);




	}
}
