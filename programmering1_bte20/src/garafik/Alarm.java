package garafik;

import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Alarm {

	private Timer timer = new Timer();

	public Alarm() {

		System.out.println(LocalDateTime.now().getHour());
		timer.scheduleAtFixedRate(new TimerTask() {
			  @Override
			  public void run() {
			   if (tid==alarmtid) {

				   Toolkit.getDefaultToolkit().beep();
			   }

			  }
			},1000 ,1000);

	}


	public String getLarmTid() {

		String alarm=JOptionPane.showInputDialog("alarm tid hh:mm");

		return alarm;
	}



	public static void main(String[] args) {

		Alarm a1=new Alarm();
		String atid=a1.getLarmTid();
		a1.setLarm(atid);


		//Toolkit.getDefaultToolkit().beep();

	}
}
