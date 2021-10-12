
public class Tid {

	public static void main(String[] args) {


		int årISekunder=37846574;

	int år = årISekunder/31556926;

	int rest= årISekunder%31556926;

	int dygn = rest/(60*60*24);

	int restDygn= rest%(60*60*24);


	int timmar = restDygn/3600;


	int restTimmar = restDygn%3600;

	int minuter = restTimmar/60;

	int sekunder = restTimmar - (minuter*60);


	System.out.println(minuter);







	}


}
