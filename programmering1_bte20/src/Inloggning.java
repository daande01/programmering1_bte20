import java.util.Scanner;

public class Inloggning {


	public static void main(String[] args) {




		String password = "qwerty" , username = "daniel";


		Scanner sc  = new Scanner(System.in);

		System.out.print("ange username:");
		String us=sc.nextLine();
		System.out.println("ange l�senord:");
		String pass=sc.nextLine();


		if(us.equals(username) && pass.equals(password)) {

			System.out.println("du �r inloggad");

		}else {

			System.out.println("fel l�sen eller username");
		}


	}



}
