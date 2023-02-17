package tareas;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import model.Pedido;
import service.PedidosService;
import service.PedidosServiceFactory;

public class HiloLlamada implements Runnable{
	Socket socket;
	public HiloLlamada(Socket socket) {
		this.socket=socket;
	}
	
	@Override
	public void run() {
		//para leer y escribir por el socket
		try(ObjectInputStream fos=new ObjectInputStream(socket.getInputStream())){ //creamos el objeto para poder leerlo con read()
				PedidosService service= PedidosServiceFactory.getPedidosTiendasService();//creamos el objeto de la interfaz para poder usar el método
				service.agregarPedido((Pedido)fos.readObject());//leemos y especificamos el tipo que queremos que nos devuelva
			//
				
		}catch(IOException | ClassNotFoundException ex) { //multicatch (que no pueden tener relación de herencia)
			ex.printStackTrace();
		}

		
		
	}
	
}
