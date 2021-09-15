package övningar;

import javax.swing.JOptionPane;

public class Ovn24 {
public static void main(String[] args) {

	String tal1=JOptionPane.showInputDialog("ange ett tal");

	int t1=Integer.parseInt(tal1);

	String tal2=JOptionPane.showInputDialog("ange ett tal");

	int t2=Integer.parseInt(tal2);

	String tal3=JOptionPane.showInputDialog("ange ett tal");

	int t3=Integer.parseInt(tal3);

	int summa=t1+t2+t3;

	double medel= summa/3.0;

	System.out.println(medel);



}
}
