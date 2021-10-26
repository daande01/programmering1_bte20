import java.util.Calendar;
import java.util.Scanner;

public class Inloggning {


	public static void main(String[] args) {



		System.out.println(Calendar.getInstance().getTime().toString());



		String password = "qwerty" , username = "daniel";


		Scanner sc  = new Scanner(System.in);

		System.out.print("ange username:");
		String us=sc.nextLine();

		String pass=sc.nextLine();


		if(us.equals(username) && pass.equals(password)) {

			System.out.println("du är inloggad");

		}else {

			System.out.println("fel lösen eller username");
		}


	}



}
