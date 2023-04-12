package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Usuarios extends JFrame {

	public JPanel contentPane;
	public JButton btnVolver;
	public JTable TablaUsuarios;
	public JTextField textNombre;
	public JTextField textCorreo;
	public JPasswordField textContraseña;
	public JButton btnCrear ;
	public JPanel Modificador;
	public JLabel lblErrorNombre;
	public JLabel lblErrorCorreo;
	public JLabel lblErrorContraseña;
	public JLabel lblTITULO;
	public JButton btnCancelar;
	public JLabel lblContrasena;
	public JLabel lblCContraseña;
	public JLabel lblNombre;
	public JLabel lblCorreo;
	public JButton btnEliminar;
	public JPasswordField textCambioContraseña;

	public Usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 677);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 245, 638);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBackground(new Color(255, 255, 255));
		btnVolver.setBounds(46, 366, 141, 66);
		panel.add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRADORES");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 29));
		lblNewLabel.setBounds(10, 31, 235, 47);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(255, 22, 545, 337);
		contentPane.add(scrollPane);
		
		TablaUsuarios = new JTable();
		TablaUsuarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOMBRE", "CORREO", "ID"
			}
		));
		TablaUsuarios.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 10));
		scrollPane.setViewportView(TablaUsuarios);
		
		Modificador = new JPanel();
		Modificador.setBackground(new Color(255, 255, 255));
		Modificador.setBounds(255, 355, 545, 257);
		contentPane.add(Modificador);
		Modificador.setLayout(null);
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNombre.setBounds(30, 78, 143, 28);
		Modificador.add(lblNombre);
		
		lblCorreo = new JLabel("CORREO:");
		lblCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCorreo.setBounds(30, 117, 149, 28);
		Modificador.add(lblCorreo);
		
		lblContrasena = new JLabel("CONTRASEÑA:");
		lblContrasena.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblContrasena.setBounds(30, 156, 149, 28);
		Modificador.add(lblContrasena);
		
		lblTITULO = new JLabel("CREAR  ADMINISTRADOR");
		lblTITULO.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblTITULO.setBounds(159, 11, 286, 44);
		Modificador.add(lblTITULO);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		textNombre.setBounds(183, 78, 303, 28);
		Modificador.add(textNombre);
		textNombre.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		textCorreo.setColumns(10);
		textCorreo.setBounds(183, 117, 303, 28);
		Modificador.add(textCorreo);
		
		textContraseña = new JPasswordField();
		textContraseña.setBounds(183, 156, 303, 28);
		Modificador.add(textContraseña);
		
		btnCrear = new JButton("CREAR");
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnCrear.setBackground(new Color(64, 0, 128));
		btnCrear.setBounds(339, 214, 147, 32);
		Modificador.add(btnCrear);
		
		lblErrorNombre = new JLabel("ERROR");
		lblErrorNombre.setForeground(new Color(255, 0, 0));
		lblErrorNombre.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		lblErrorNombre.setBounds(489, 89, 46, 14);
		Modificador.add(lblErrorNombre);
		
		lblErrorCorreo = new JLabel("ERROR");
		lblErrorCorreo.setForeground(Color.RED);
		lblErrorCorreo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		lblErrorCorreo.setBounds(489, 128, 46, 14);
		Modificador.add(lblErrorCorreo);
		
		lblErrorContraseña = new JLabel("ERROR");
		lblErrorContraseña.setForeground(Color.RED);
		lblErrorContraseña.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		lblErrorContraseña.setBounds(489, 167, 46, 14);
		Modificador.add(lblErrorContraseña);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnCancelar.setBackground(new Color(64, 0, 128));
		btnCancelar.setBounds(182, 214, 147, 32);
		Modificador.add(btnCancelar);
		
		lblCContraseña = new JLabel("¿Desea Cambiar la contraseña?");
		lblCContraseña.setForeground(new Color(0, 0, 255));
		lblCContraseña.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 11));
		lblCContraseña.setBounds(347, 185, 143, 18);
		Modificador.add(lblCContraseña);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		btnEliminar.setBounds(30, 214, 143, 32);
		Modificador.add(btnEliminar);
		
		textCambioContraseña = new JPasswordField();
		textCambioContraseña.setBounds(182, 117, 304, 28);
		Modificador.add(textCambioContraseña);
		lblCContraseña.setVisible(false);
		btnCancelar.setVisible(false);
		lblErrorNombre.setVisible(false);
		lblErrorCorreo.setVisible(false);
		lblErrorContraseña.setVisible(false);
		btnEliminar.setVisible(false);

	}
}
