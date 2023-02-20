package principal;

import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<Integer> lista=List.of(3,6,2,11,6,3,8,90,16,34,2,11); //no se sabe lo que dará porque a cada uno le sale una cosa
		lista.parallelStream()  //lo hace por hilos, cogen algunos números y otros no y, al hacer el filtro de su propio hilo, no se sabe cuáles son los que se van a imprimir
		.peek(System.out::println) 
		.sequential() //siempre que se añada sequential antes de la operación final, se ejecuta solo en un hilo y, dicha operación, se realiza sobre un stream simple
		.anyMatch(n-> n<10);
	}

}
