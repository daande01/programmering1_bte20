import javax.swing.JOptionPane;

public class Forsakring {

	public static void main(String[] args) {





		String årsmodellString=JOptionPane.showInputDialog("ange årsmodell");
		int årsmodell=Integer.parseInt(årsmodellString);
		String datum = java.time.LocalDate.now().toString();
		String årString =datum.substring(0, 4);
		int årnu=Integer.parseInt(årString);
		int ålder = årnu-årsmodell;

		if (ålder <4) {
			System.out.println("välj halvförsäkring");
		}else if (ålder>=4 && ålder<10) {

			System.out.println("välj helförsäkring");
		}else  {
			System.out.println("du har en skrot bil välj trafikförsäkring");

		}

	}


}
