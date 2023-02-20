package anidadas;

public class Externa {
	private int a;
	public void m() {
		Interna in=new Interna(); //se crea un objeto de la clase interna. Se pueden crear desde fuera, desde cualquier otra clase del mismo proyecto.
		in.print();		
	}	
	public static class Interna{
		private int b;
		public void print() {
			System.out.println("interna");
		}
	}

}
