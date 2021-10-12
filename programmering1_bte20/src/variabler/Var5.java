package variabler;

public class Var5 {

	public static void main(String[] args) {


		char c='\u0031'; // lagrar tecknet från positionen 0031 i unicode tabellen, i varabeln C

		int i = c;  // omvandlar teckenet till en int ex 49

		i=i+5;   //    resulterar i att i blir 49+5 alltså 54 kommer lagras i i

		c =(char) i; //i skall bli ett tecken som lagras i c med hjälp av explcit typomvandling



		System.out.println(c);




	}
}
