import javax.swing.JOptionPane;

public class Forsakring {

	public static void main(String[] args) {





		String �rsmodellString=JOptionPane.showInputDialog("ange �rsmodell");
		int �rsmodell=Integer.parseInt(�rsmodellString);
		String datum = java.time.LocalDate.now().toString();
		String �rString =datum.substring(0, 4);
		int �rnu=Integer.parseInt(�rString);
		int �lder = �rnu-�rsmodell;

		if (�lder <4) {
			System.out.println("v�lj halvf�rs�kring");
		}else if (�lder>=4 && �lder<10) {

			System.out.println("v�lj helf�rs�kring");
		}else  {
			System.out.println("du har en skrot bil v�lj trafikf�rs�kring");

		}

	}


}
