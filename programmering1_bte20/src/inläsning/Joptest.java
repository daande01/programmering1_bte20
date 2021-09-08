package inläsning;

import javax.swing.JOptionPane;

public class Joptest {

	public static void main(String[] args) {

		String tal = JOptionPane.showInputDialog("ange ett heltal");

		double tald = Double.parseDouble(tal);

		JOptionPane.showMessageDialog(null, tald * tald);

	}

}
