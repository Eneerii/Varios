package principal;

import anidadas.Externa;

public class Test {

	public static void main(String[] args) {
		Externa es= new Externa();
		Externa.Interna in= es.new Interna();
		in.print();
	}

}
