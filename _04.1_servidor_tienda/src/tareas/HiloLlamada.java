package tareas;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.Pedido;
import service.PedidosService;
import service.locator.ConnectionLocator;

public class HiloLlamada implements Runnable{
	Socket socket;
	PedidosService pedido= new PedidosService();
	public HiloLlamada(Socket socket) {
		this.socket=socket;
	}
	ConnectionLocator con= new ConnectionLocator();
	@Override
	public void run() {
		
		try(ObjectInputStream fos=new ObjectInputStream(pedido.);{
			fos.read(pedido);
			System.out.println("Curso guardado!");
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}

		
		
	}
	
}
