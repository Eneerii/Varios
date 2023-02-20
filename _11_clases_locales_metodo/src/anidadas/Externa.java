package anidadas;

public class Externa {
	private int a;
	public void print() {
		System.out.println("Externa");
	}
	public void interno() {
		int b;
		class Local {
			private int c;
			public void printInterno(){
				System.out.println("Print interno"); // Si queremos acceder a variable,únicamente se podrá a las declaradas dentro de la misma clase o de la clase externa
				//nunca desde el método del que esta clase forma parte, salvo en el caso de que no sea variable si no constante.
			}
		}
		Local l=new Local(); //creamos el objeto de la clase pero únicamente dentro del mismo ya que, si no, no se puede crear.
		l.printInterno();
	}
}
