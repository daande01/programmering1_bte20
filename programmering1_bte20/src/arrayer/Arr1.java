package arrayer;

import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {

		int [] arr=new int[3];

		arr[2]=10;
		arr[0]=20;
		arr[1]=30;

		for(int i=0;  i<3;  i++) {   // startvärde;villkor;

			System.out.println(arr[i]);
		}


		System.out.println( Arrays.toString(arr) );


	}

}
