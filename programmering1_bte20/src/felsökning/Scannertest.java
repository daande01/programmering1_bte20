package felsökning;

import java.util.Scanner;

public class Scannertest {
	public static void main(String[] args) {

		   Scanner s1 =new Scanner(System.in);

		   System.out.println("ange tal");

		    double tal  = 	s1.nextDouble();

		    double produkt=tal*tal;

		    System.out.println(produkt);

	}

}
