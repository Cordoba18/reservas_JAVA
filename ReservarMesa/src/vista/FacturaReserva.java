package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.SwingConstants;
public class FacturaReserva extends JFrame {

	private JPanel contentPane;
	public JTable table;
	public JButton btnVolver;
	public JLabel lblDatoNom;
	public JLabel lblDatoCedula;
	public JLabel lblDatoPersonas;
	public JLabel lblDatoCumpleaños;
	public JLabel lblDatoCorreo;
	public JLabel lblNombreCompleto;
	public JLabel lblCedula;
	public JLabel lblNumeroDePersonas;
	public JLabel lblcumpleaos;
	public JLabel lblCorreo;
	public JLabel lblMensaje;



	public FacturaReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 790);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		lblMensaje = new JLabel("La reserva es valida hasta el día de hoy a las 10:30pm");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblMensaje.setBounds(151, 574, 653, 34);
		lblMensaje.setForeground(new Color(255, 0, 0));
		contentPane.add(lblMensaje);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(0, 0, 932, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FACTURA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(365, 37, 219, 50);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setBackground(new Color(64, 0, 128));
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 35));
		btnVolver.setBounds(377, 633, 205, 89);
		contentPane.add(btnVolver);
		
		lblNombreCompleto = new JLabel("NOMBRE COMPLETO:");
		lblNombreCompleto.setForeground(new Color(0, 0, 0));
		lblNombreCompleto.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNombreCompleto.setBounds(193, 165, 219, 50);
		contentPane.add(lblNombreCompleto);
		
		lblCedula = new JLabel("CEDULA:\r\n");
		lblCedula.setForeground(Color.BLACK);
		lblCedula.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCedula.setBounds(193, 241, 219, 50);
		contentPane.add(lblCedula);
		
		lblNumeroDePersonas = new JLabel("NUMERO DE PERSONAS:");
		lblNumeroDePersonas.setForeground(Color.BLACK);
		lblNumeroDePersonas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNumeroDePersonas.setBounds(193, 323, 258, 50);
		contentPane.add(lblNumeroDePersonas);
		
		lblDatoNom = new JLabel("DATO");
		lblDatoNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatoNom.setForeground(Color.BLACK);
		lblDatoNom.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblDatoNom.setBounds(486, 165, 258, 50);
		contentPane.add(lblDatoNom);
		
		lblDatoCedula = new JLabel("DATO");
		lblDatoCedula.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatoCedula.setForeground(Color.BLACK);
		lblDatoCedula.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblDatoCedula.setBounds(486, 241, 258, 50);
		contentPane.add(lblDatoCedula);
		
		lblDatoPersonas = new JLabel("DATO");
		lblDatoPersonas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatoPersonas.setForeground(Color.BLACK);
		lblDatoPersonas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblDatoPersonas.setBounds(486, 323, 258, 50);
		contentPane.add(lblDatoPersonas);
		
		lblcumpleaos = new JLabel("¿CUMPLEAÑOS?");
		lblcumpleaos.setForeground(Color.BLACK);
		lblcumpleaos.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblcumpleaos.setBounds(193, 411, 258, 50);
		contentPane.add(lblcumpleaos);
		
		lblDatoCumpleaños = new JLabel("DATO");
		lblDatoCumpleaños.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatoCumpleaños.setForeground(Color.BLACK);
		lblDatoCumpleaños.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblDatoCumpleaños.setBounds(486, 411, 258, 50);
		contentPane.add(lblDatoCumpleaños);
		
		lblCorreo = new JLabel("CORREO:");
		lblCorreo.setForeground(Color.BLACK);
		lblCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCorreo.setBounds(193, 500, 258, 50);
		contentPane.add(lblCorreo);
		
		lblDatoCorreo = new JLabel("DATO");
		lblDatoCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatoCorreo.setForeground(Color.BLACK);
		lblDatoCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblDatoCorreo.setBounds(486, 500, 258, 50);
		contentPane.add(lblDatoCorreo);
		
		
	}
}
