package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	public JTextField textCorreo;
	public JPasswordField textContraseña;
	public JButton btnEnviar;
	public JButton btnVolver;
	public JLabel lblErrorCorreo;
	public JLabel lblErrorContraseña;
	public JTextField textError;

	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(0, 0, 565, 146);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIniciarSesión = new JLabel("INICIAR SESIÓN");
		lblIniciarSesión.setForeground(new Color(255, 255, 255));
		lblIniciarSesión.setBackground(new Color(255, 255, 255));
		lblIniciarSesión.setBounds(156, 46, 288, 42);
		panel.add(lblIniciarSesión);
		lblIniciarSesión.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 45));
		
		JLabel lblCorreo = new JLabel("CORREO:");
		lblCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblCorreo.setForeground(new Color(0, 0, 0));
		lblCorreo.setBounds(122, 186, 75, 23);
		contentPane.add(lblCorreo);
		
		JLabel lblContraseña = new JLabel("CONTRASEÑA:");
		lblContraseña.setForeground(new Color(0, 0, 0));
		lblContraseña.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblContraseña.setBounds(122, 235, 134, 23);
		contentPane.add(lblContraseña);
		
		textCorreo = new JTextField();
		textCorreo.setForeground(new Color(0, 0, 0));
		textCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		textCorreo.setBackground(new Color(255, 255, 255));
		textCorreo.setBounds(272, 189, 185, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setForeground(new Color(255, 255, 255));
		btnEnviar.setBackground(new Color(64, 0, 128));
		btnEnviar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		btnEnviar.setBounds(313, 291, 144, 43);
		contentPane.add(btnEnviar);
		
	
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(64, 0, 128));
		btnVolver.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		btnVolver.setBounds(122, 291, 144, 43);
		contentPane.add(btnVolver);
		
		lblErrorCorreo = new JLabel("ERROR");
		lblErrorCorreo.setForeground(new Color(255, 0, 0));
		lblErrorCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 11));
		lblErrorCorreo.setBounds(411, 213, 46, 14);
		contentPane.add(lblErrorCorreo);
		lblErrorCorreo.setVisible(false);
		
		lblErrorContraseña = new JLabel("ERROR");
		lblErrorContraseña.setForeground(Color.RED);
		lblErrorContraseña.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 11));
		lblErrorContraseña.setBounds(411, 266, 46, 14);
		contentPane.add(lblErrorContraseña);
		lblErrorContraseña.setVisible(false);
		
		textContraseña = new JPasswordField();
		textContraseña.setBackground(new Color(255, 255, 255));
		textContraseña.setForeground(new Color(0, 0, 0));
		textContraseña.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		textContraseña.setBounds(272, 238, 185, 20);
		contentPane.add(textContraseña);
		
		textError = new JTextField();
		textError.setHorizontalAlignment(SwingConstants.CENTER);
		textError.setBackground(new Color(255, 255, 255));
		textError.setEditable(false);
		textError.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textError.setForeground(new Color(255, 0, 0));
		textError.setBounds(111, 345, 346, 20);
		contentPane.add(textError);
		textError.setColumns(10);
	}
}
