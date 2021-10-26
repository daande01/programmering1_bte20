package loopar;

public class Forloop {
public static void main(String[] args) {


	int [] ii = {10,20,30,40};

	for (int i : ii) {

	System.out.println(i);
	}


	for(int i = 0; i<5; i++) {


		System.out.println("*");

	}

	int k=0;
	while(k<5) {
		k++;
		System.out.println("*");

	}

	int j=0;
	do {
		j++;
	}while(j<10);

}
}
