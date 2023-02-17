package service;

public class PedidosServiceFactory {
	public static PedidosService getPedidosTiendasService() {
		return new PedidosServiceImpl();
	}

}
