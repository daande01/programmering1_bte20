package metoder;

public class Palindrom {

	public static boolean palindromTest(String s) {

	String OrdBakl�nges="";

	for (int i = s.length()-1; i>=0 ; i--) {

		OrdBakl�nges+= s.charAt(i);
		//System.out.println(s.charAt(i));
	}
		//System.out.println(OrdBakl�nges);



		return s.equals(OrdBakl�nges);
	}


	public static void main(String[] args) {


		boolean svar =Palindrom.palindromTest("daniel");

		System.out.println(svar);
	}


}
