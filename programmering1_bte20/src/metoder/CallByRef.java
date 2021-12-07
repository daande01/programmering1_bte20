package metoder;

import java.util.Arrays;

public class CallByRef {

	public static void arrSend(int[] k) {

		for (int i = 0; i < k.length; i++) {

			k[i]= (int) (Math.random()*10);

		}
		System.out.println(Arrays.toString(k));

	}



	public static void main(String[] args) {

		int [] i = {1,2,3};

		CallByRef.arrSend(i);
		System.out.println(Arrays.toString(i));
	}
}
