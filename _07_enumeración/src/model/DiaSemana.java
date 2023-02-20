package model;

public enum DiaSemana {
	Lunes(1),Martes(2),Miercoles(3),Jueves(4),Viernes(5),Sabado(6),Domingo(7);
	
	//Asignamos un valor (tipo primitivo) interno a cada elemento de la enumeración por medio del constructor y, con el método, podemos obtener el valor.
	int valor;
	DiaSemana(int d){
		this.valor=d;
	}
	
	public int getD() {
		return valor; 
	}
}
