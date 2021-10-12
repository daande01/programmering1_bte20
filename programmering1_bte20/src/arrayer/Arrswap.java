package arrayer;

import java.util.Arrays;

public class Arrswap {

	public static void main(String[] args) {

		String [] s=new String[3];
		String temp;

		s[0]="hej";
		s[1]="då";
		s[2]="daniel";

		temp=s[0];
		s[0]=s[2];
		s[2]=temp;



		System.out.println(Arrays.toString(s));


	}


}
