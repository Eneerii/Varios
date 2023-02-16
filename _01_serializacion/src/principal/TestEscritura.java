package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Curso;

public class TestEscritura {

	public static void main(String[] args) {
		//tenemos que envíar el objeto de la clase curso a un fichero o BBDD
		String url="c:\\Irene Manana\\fichero\\curso.bin";
		Curso curso=new Curso("Java EE", 80, 200);
		try(FileOutputStream fos=new FileOutputStream(url); ObjectOutputStream out=new ObjectOutputStream(fos);){
			out.writeObject(curso);
			System.out.println("Curso guardado!");
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
