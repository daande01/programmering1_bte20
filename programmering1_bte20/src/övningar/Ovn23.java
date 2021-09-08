package övningar;

import java.util.Scanner;

public class Ovn23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ange din ålder");

		int ålder= sc.nextInt();


		int svar = (ålder/10+1)*10;       //   33/10=3,3  kapar 3  3+1=4   4*10=40

		System.out.println(svar);

		int årKvar= svar-ålder;

		System.out.println("år kvar till nollning "+årKvar);


	}


}
