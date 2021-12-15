package metoder;

public class Palindrom {

	public static boolean palindromTest(String s) {

	String OrdBaklänges="";

	for (int i = s.length()-1; i>=0 ; i--) {

		OrdBaklänges+= s.charAt(i);
		//System.out.println(s.charAt(i));
	}
		//System.out.println(OrdBaklänges);



		return s.equals(OrdBaklänges);
	}


	public static void main(String[] args) {


		boolean svar =Palindrom.palindromTest("daniel");

		System.out.println(svar);
	}


}
