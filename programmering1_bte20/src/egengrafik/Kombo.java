package egengrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo extends JComponent {

	private int x=200;



	public Kombo() {

		this.setPreferredSize(new Dimension(600,600));
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.fillRect(x, 200, 50, 50);
	}





	public static void main(String[] args) {


		JFrame f= new JFrame("sdsdsds");
		Kombo k =new Kombo();
		f.setVisible(true);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		JButton b= new JButton("\u261E");
		p.add(b);
		b.addActionListener(e->{


			k.x+=20;
			k.repaint();

		});


		p.add(k);
		f.add(p);
		f.pack();



	}



}
