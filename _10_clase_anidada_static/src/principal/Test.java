package principal;

import anidadas.Externa;

public class Test {

	public static void main(String[] args) {
		Externa.Interna in=new Externa.Interna(); //para crear un objeto cuando la clase andidada es static, no es necesario crear un objeto de la clase principal
		in.print();
	}

}
