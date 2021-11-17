package loopar;

import java.util.Scanner;

public class Bankomat {
public static void main(String[] args) {

	// uttag, saldo, kvitto, insättning
	Scanner sc = new Scanner(System.in);
	int val;



	do {
	System.out.println("1:uttag \n2:saldo \n3:kvitto \n4:insättning\nannan siffra:avsulta");

	 val=sc.nextInt();


	switch(val) {

	case 1:
		System.out.println("uttag");
		break;

	case 2:
		System.out.println("saldo");
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
