package metoder;

public class CallByValue {


	public static void test(int a , int b) {

		a=a+1;
		b=b+2;
		System.out.println(a +" "+b);

	}

	public static void main(String[] args) {
		int i=5;
		int k=5;

		CallByValue.test(i, k);
		System.out.println(i+""+k);

	}
}
