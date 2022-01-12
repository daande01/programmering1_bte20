package objektorientering;

public class Hiss {

	private int våning;
	private int riktning;


	public Hiss(){

		våning =0;
		riktning=0;
		System.out.println("hissen är installerad på våning "+våning);
	}
	public Hiss(int v , int r) {

		våning = v;
		riktning= r;
		System.out.println("hissen är installerad på våning "+våning);
	}

	public void move(int v) {

		if (v<våning) {
			for(int i =våning;i>v;i--) {

				våning--;
				riktning= -1;
				System.out.println("våning:"+våning+"riktning"+riktning);

			}

		}else {
			for(int i =våning;i<v;i++) {

				våning++;
				riktning= 1;
				System.out.println("våning:"+våning+"riktning"+riktning);

			}


		}

		/*
		if (v<=10) {

			våning=v;

		}else {

			System.out.println("fel våning");
		}
		*/
	}


	public static void main(String[] args) {

		Hiss h1=new Hiss();
		Hiss h2=new Hiss(9,0);

		h2.move(3);
		h1.move(9);


	}

}
