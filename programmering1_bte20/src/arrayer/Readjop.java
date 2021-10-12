package arrayer;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Readjop {
	public static void main(String[] args) {

		int[] arr = new int[1000];

		for (int i = 0; i < 1000; i++) {
			String s = JOptionPane.showInputDialog("ange ett tal");
			int tal = Integer.parseInt(s);
			arr[i] = tal;
		}

		System.out.println(Arrays.toString(arr));

	}


}
