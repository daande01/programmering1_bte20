package garafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jframeinput extends JFrame {

	//private JButton b1=new JButton();
	private JTextField field1=new JTextField("mata in data",30);
	private JLabel lab= new JLabel("denna text kan du ändra");


	public Jframeinput() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));

		add(field1);
		add(lab);

		field1.addActionListener(e->{

			String input=field1.getText();
			//System.out.println(input);
			lab.setText(input);

		});


	}

	public static void main(String[] args) {

		Jframeinput i =new Jframeinput();
	}



}
