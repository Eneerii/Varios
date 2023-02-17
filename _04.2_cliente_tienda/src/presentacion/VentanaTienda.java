package presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Pedido;
import service.PedidosService;
import service.PedidosServiceFactory;

public class VentanaTienda extends JFrame {

	private JPanel contentPane;
	private JTextField tfProducto;
	private JTextField tfUnidades;
	private JTextField tfTienda;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTienda frame = new VentanaTienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanaTienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Producto = new JLabel("Producto");
		Producto.setBounds(54, 45, 76, 21);
		contentPane.add(Producto);
		
		tfProducto = new JTextField();
		tfProducto.setBounds(141, 45, 86, 20);
		contentPane.add(tfProducto);
		tfProducto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Unidades");
		lblNewLabel.setBounds(54, 96, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfUnidades = new JTextField();
		tfUnidades.setBounds(141, 93, 86, 20);
		contentPane.add(tfUnidades);
		tfUnidades.setColumns(10);
		
		JButton btEnviar = new JButton("Enviar");
		btEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//recogemos los datos de los campos de texto
				//creamos el objeto Pedido y lo mandamos
				Pedido pedido= new Pedido(0,tfProducto.getText(),
						Integer.parseInt(tfUnidades.getText()),
								LocalDate.now(),
								tfTienda.getText());
				PedidosService service=PedidosServiceFactory.getPedidosTiendasService();
				service.enviarPedido(pedido);
			}
		});
		btEnviar.setBounds(138, 203, 89, 23);
		contentPane.add(btEnviar);
		
		JLabel lblNewLabel_2 = new JLabel("Tienda");
		lblNewLabel_2.setBounds(54, 142, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tfTienda = new JTextField();
		tfTienda.setBounds(141, 139, 86, 20);
		contentPane.add(tfTienda);
		tfTienda.setColumns(10);
	}
}