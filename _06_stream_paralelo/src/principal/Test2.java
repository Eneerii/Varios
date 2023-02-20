package principal;

import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> lista=List.of(3,6,2,11,6,3,8,90,16,34,2,11);
		//mostrar los números de la lista, sin repetidos
		lista.parallelStream()
		.distinct()
		.sequential()//antes de hacer cualquier cosa y no querer como resultado un stream paralelo, se coloca sequential
		.forEach(System.out::println); //Al hacerlo en paralelo, ambas operaciones son en paralelo, así que al ejecutar, las realiza pero lo coloca cambiando el orden
		//porque las acciones se realizan simultáneamente y vuelva los datos según le vienen, sin ningún orden
	}

}
