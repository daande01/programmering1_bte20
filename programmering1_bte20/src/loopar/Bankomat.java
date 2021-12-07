package loopar;

import java.util.Scanner;

public class Bankomat {
public static void main(String[] args) {

	// uttag, saldo, kvitto, insättning
	Scanner sc = new Scanner(System.in);
	int val;
	int saldo=0;



	do {
	System.out.println("\n\n\n\n\n\n1:uttag \n2:saldo \n3:kvitto \n4:insättning\nannan siffra:avsulta");

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
		System.out.println("saldo är:"+saldo);
		break;

	case 3:
		System.out.println("kvitto");
		break;
	case 4:
		System.out.println("insättning");
		break;

	default:
		System.out.println("avsluta");
		System.exit(0);
	}
	}while(val !=5);
}
}
