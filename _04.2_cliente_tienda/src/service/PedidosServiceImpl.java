package service;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.Pedido;

public class PedidosServiceImpl implements PedidosService {

	@Override
	public void enviarPedido(Pedido pedido) {
		try(Socket socket=new Socket("A13E100",8000);
				ObjectOutputStream out =new ObjectOutputStream(socket.getOutputStream());){
			out.writeObject(pedido);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
