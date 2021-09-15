package variabler;

public class Var4 {

	public static void main(String[] args) {

		String s1="daniel";
		String s2="är";
		String s3="bäst";
		int ålder=39;

		String mening=s1+" "+s2+" "+s3+" "+ålder;
		System.out.println(mening);

		char c =s1.charAt(3);

		System.out.println(c);

		String delAvOrd=s1.substring(0,3);

		System.out.println(delAvOrd);

		String text="daniel hej hej är snäll";

		int pos = text.lastIndexOf(' ');

		System.out.println(pos);

		String snäll= text.substring(pos+1);
		System.out.println(snäll);


	}
}
