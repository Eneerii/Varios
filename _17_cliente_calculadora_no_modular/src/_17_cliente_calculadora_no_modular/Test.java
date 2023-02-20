package _17_cliente_calculadora_no_modular;

import service.Calculadora;
import utilidades.Operaciones;

public class Test {
	public static void main (String[] args) {
		Operaciones op= new Operaciones();
		Calculadora cal=new Calculadora(); //nos permite, sin ningún problema, utilizar las clases del programa utilizado como librería.
	}

}
