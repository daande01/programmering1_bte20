package objektorientering;

public class Hiss {

	private int v�ning;
	private int riktning;


	public Hiss(){

		v�ning =0;
		riktning=0;
		System.out.println("hissen �r installerad p� v�ning "+v�ning);
	}
	public Hiss(int v , int r) {

		v�ning = v;
		riktning= r;
		System.out.println("hissen �r installerad p� v�ning "+v�ning);
	}

	public void move(int v) {

		if (v<v�ning) {
			for(int i =v�ning;i>v;i--) {

				v�ning--;
				riktning= -1;
				System.out.println("v�ning:"+v�ning+"riktning"+riktning);

			}

		}else {
			for(int i =v�ning;i<v;i++) {

				v�ning++;
				riktning= 1;
				System.out.println("v�ning:"+v�ning+"riktning"+riktning);

			}


		}

		/*
		if (v<=10) {

			v�ning=v;

		}else {

			System.out.println("fel v�ning");
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
