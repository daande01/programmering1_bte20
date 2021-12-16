package metoder;

import java.util.Arrays;

public class Ovn1A {

	public static void kryptera(String okrypteradString,int h []) {

		for (int i = 0; i < okrypteradString.length(); i++) {

			h[i] = okrypteradString.charAt(i)+12;

		}

		//System.out.println(Arrays.toString(k));

	}

	public static void main(String[] args) {
		int k[] = new int[6];
		Ovn1A.kryptera("daniel",k);
		System.out.println(Arrays.toString(k));


	}

}
