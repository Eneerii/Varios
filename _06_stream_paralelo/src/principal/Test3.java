package principal;

import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> lista=List.of(3,6,2,11,6,3,8,90,16,34,2,11);
		System.out.println(lista.parallelStream() 
				          .distinct()
				          .max((a,b)->a-b)
				          .get()
				          );//mostrará lo requerido porque aunque se haga en diferentes hilos, cada uno tendrá su orden y, finalmente se
                           // vuelcan todos en el stream paralelo final
		                   

	}

}
