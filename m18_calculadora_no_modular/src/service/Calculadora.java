package service;

import utilidades.Operaciones;

public class Calculadora {
	Operaciones op=new Operaciones();
	public int sumar(int x, int y) {
		return x+y;
	}
	public int restar(int x, int y) {
		return op.mayor(x, y)-op.menor(x, y);
	}
	public int dividir (int x, int y) {
		return op.mayor(x, y)/ op.menor(x, y);
	}

}
