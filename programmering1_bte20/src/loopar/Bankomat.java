package loopar;

import java.util.Scanner;

public class Bankomat {
public static void main(String[] args) {

	// uttag, saldo, kvitto, ins�ttning
	Scanner sc = new Scanner(System.in);
	int val;
	int saldo=0;



	do {
	System.out.println("\n\n\n\n\n\n1:uttag \n2:saldo \n3:kvitto \n4:ins�ttning\nannan siffra:avsulta");

	 val=sc.nextInt();


	switch(val) {

	case 1:
		System.out.println("hur mycket vill du ta ut ");
		int uttagsBelopp=sc.nextInt();
		saldo=saldo-uttagsBelopp;
		// 720
		  int antalHundraSedlar= ((int)((uttagsBelopp/100.0)+1));
		 System.out.println("antal hundra sedlar"+antalHundraSedlar);
		break;

	case 2:
		System.out.println("saldo �r:"+saldo);
		break;

	case 3:
		System.out.println("kvitto");
		break;
	case 4:
		System.out.println("ins�ttning");
		break;

	default:
		System.out.println("avsluta");
		System.exit(0);
	}
	}while(val !=5);
}
}
