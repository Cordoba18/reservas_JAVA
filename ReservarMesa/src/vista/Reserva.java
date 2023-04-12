package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import controlador.ReservaController;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Reserva extends JFrame {

	private JPanel contentPane;
	public JTextField txtNomDiscoteca;
	public JTextField txtNombre;
	public  JLabel lblCedula;
	public  JTextField txtCEDULA;
	public  JLabel lblPersonas;
	public  JTextField txtPersonas;
	public JRadioButton rdbtnCumpleaños;
	public JButton btnEnviar ;
	public JButton btnBorrar;
	public JTextField textError;
	public JButton btnVolver;
	public JLabel lblErrorNombre;
	public JLabel lblErrorCedula;
	public JLabel lblErrorPersonas;
	public JTextField textCorreo;
	public JLabel lblErrorCorreo;
	public JButton btnBebidas;

	public Reserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 807);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE COMPLETO:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(114, 235, 206, 20);
		contentPane.add(lblNewLabel);
		
		txtNomDiscoteca = new JTextField();
		txtNomDiscoteca.setBackground(new Color(64, 0, 128));
		txtNomDiscoteca.setEditable(false);
		txtNomDiscoteca.setForeground(new Color(255, 255, 255));
		txtNomDiscoteca.setHorizontalAlignment(SwingConstants.CENTER);
		txtNomDiscoteca.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		txtNomDiscoteca.setBounds(111, 30, 772, 160);
		contentPane.add(txtNomDiscoteca);
		txtNomDiscoteca.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		txtNombre.setForeground(new Color(0, 0, 0));
		txtNombre.setBackground(new Color(255, 255, 255));
		txtNombre.setBounds(370, 228, 513, 37);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblCedula = new JLabel("CEDULA:");
		lblCedula.setForeground(new Color(0, 0, 0));
		lblCedula.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCedula.setBounds(111, 303, 89, 28);
		contentPane.add(lblCedula);
		
		txtCEDULA = new JTextField();
		txtCEDULA.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		txtCEDULA.setForeground(new Color(0, 0, 0));
		txtCEDULA.setBackground(new Color(255, 255, 255));
		txtCEDULA.setColumns(10);
		txtCEDULA.setBounds(370, 300, 513, 37);
		contentPane.add(txtCEDULA);
		
		lblPersonas = new JLabel("NUMERO DE PERSONAS:");
		lblPersonas.setForeground(new Color(0, 0, 0));
		lblPersonas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblPersonas.setBounds(114, 379, 259, 28);
		contentPane.add(lblPersonas);
		
		txtPersonas = new JTextField();
		txtPersonas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		txtPersonas.setForeground(new Color(0, 0, 0));
		txtPersonas.setBackground(new Color(255, 255, 255));
		txtPersonas.setColumns(10);
		txtPersonas.setBounds(370, 376, 513, 37);
		contentPane.add(txtPersonas);
		
		rdbtnCumpleaños = new JRadioButton("Cumpleaños");
		rdbtnCumpleaños.setForeground(new Color(0, 0, 0));
		rdbtnCumpleaños.setBackground(new Color(255, 255, 255));
		rdbtnCumpleaños.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		rdbtnCumpleaños.setBounds(375, 513, 183, 23);
		contentPane.add(rdbtnCumpleaños);
		
		JLabel lblMotivo = new JLabel("MOTIVO DE VISITA:");
		lblMotivo.setForeground(new Color(0, 0, 0));
		lblMotivo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblMotivo.setBounds(114, 503, 209, 43);
		contentPane.add(lblMotivo);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 37));
		btnEnviar.setBackground(new Color(255, 255, 255));
		btnEnviar.setForeground(new Color(0, 0, 0));
		btnEnviar.setBounds(677, 580, 206, 89);
		contentPane.add(btnEnviar);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnBorrar.setForeground(new Color(255, 255, 255));
		btnBorrar.setBackground(new Color(64, 0, 128));
		btnBorrar.setBounds(114, 580, 147, 43);
		contentPane.add(btnBorrar);
		
		textError = new JTextField();
		textError.setHorizontalAlignment(SwingConstants.CENTER);
		textError.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textError.setForeground(new Color(255, 0, 0));
		textError.setBackground(new Color(255, 255, 255));
		textError.setEditable(false);
		textError.setBounds(114, 680, 769, 43);
		contentPane.add(textError);
		textError.setColumns(10);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnVolver.setBackground(new Color(64, 0, 128));
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBounds(114, 626, 147, 43);
		contentPane.add(btnVolver);
		
		lblErrorNombre = new JLabel("ERROR");
		lblErrorNombre.setForeground(new Color(255, 0, 0));
		lblErrorNombre.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblErrorNombre.setBounds(820, 269, 63, 20);
		contentPane.add(lblErrorNombre);
		
		lblErrorCedula = new JLabel("ERROR");
		lblErrorCedula.setForeground(Color.RED);
		lblErrorCedula.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblErrorCedula.setBounds(820, 345, 63, 20);
		contentPane.add(lblErrorCedula);
		
		lblErrorPersonas = new JLabel("ERROR");
		lblErrorPersonas.setForeground(Color.RED);
		lblErrorPersonas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblErrorPersonas.setBounds(820, 417, 63, 20);
		contentPane.add(lblErrorPersonas);
		
		textCorreo = new JTextField();
		textCorreo.setForeground(Color.BLACK);
		textCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textCorreo.setColumns(10);
		textCorreo.setBackground(Color.WHITE);
		textCorreo.setBounds(370, 444, 513, 37);
		contentPane.add(textCorreo);
		
		JLabel lblCorreo = new JLabel("CORREO:");
		lblCorreo.setForeground(Color.BLACK);
		lblCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCorreo.setBounds(114, 444, 218, 28);
		contentPane.add(lblCorreo);
		
		lblErrorCorreo = new JLabel("ERROR");
		lblErrorCorreo.setForeground(new Color(255, 0, 0));
		lblErrorCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblErrorCorreo.setBounds(820, 480, 72, 28);
		contentPane.add(lblErrorCorreo);
		
		btnBebidas = new JButton("BEBIDAS");
		btnBebidas.setForeground(Color.WHITE);
		btnBebidas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		btnBebidas.setBackground(new Color(64, 0, 128));
		btnBebidas.setBounds(271, 577, 147, 89);
		contentPane.add(btnBebidas);
		
		lblErrorNombre.setVisible(false);
		lblErrorCedula.setVisible(false);
		lblErrorPersonas.setVisible(false);
		lblErrorCorreo.setVisible(false);
		
	}
}
