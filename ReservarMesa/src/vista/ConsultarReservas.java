package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ConsultarReservas extends JFrame {

	private JPanel contentPane;
	public JPanel JTablaPanel ;
	public JLabel lblUsuario;
	public JButton btnMostrarR;
	public JButton btnCdiscoteca;
	public JButton btnCerrarSesión;
	public JLabel lblDiscoteca;
	public JButton btnCrearAdmin;
	public JScrollPane scrollPane;
	public JTable TablaReservas;
	public JLabel lblTabla;
	private JLabel lblNewLabel_1;
	public JTextField textDia;
	public JButton btnVer;
	public JTextField textMes;
	public JTextField textAño;
	public JLabel lblErrorDia;
	public JLabel lblErrorMes;
	public JLabel lblErrorAño;
	

	public ConsultarReservas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1309, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(0, 0, 228, 749);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 35));
		lblNewLabel.setBounds(10, 29, 208, 45);
		panel.add(lblNewLabel);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 30));
		lblUsuario.setBounds(10, 85, 218, 45);
		panel.add(lblUsuario);
		
		btnMostrarR = new JButton("BEBIDAS");
		btnMostrarR.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btnMostrarR.setBackground(new Color(255, 255, 255));
		btnMostrarR.setForeground(new Color(0, 0, 0));
		btnMostrarR.setBounds(41, 206, 147, 66);
		panel.add(btnMostrarR);
		
		btnCdiscoteca = new JButton("VER OTRA");
		btnCdiscoteca.setBackground(new Color(255, 255, 255));
		btnCdiscoteca.setForeground(new Color(0, 0, 0));
		btnCdiscoteca.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btnCdiscoteca.setBounds(41, 310, 147, 66);
		panel.add(btnCdiscoteca);
		
		lblDiscoteca = new JLabel("Discoteca");
		lblDiscoteca.setForeground(new Color(255, 255, 255));
		lblDiscoteca.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		lblDiscoteca.setBounds(10, 131, 83, 45);
		panel.add(lblDiscoteca);
		
		btnCrearAdmin = new JButton("ADMINS");
		btnCrearAdmin.setForeground(new Color(0, 0, 0));
		btnCrearAdmin.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btnCrearAdmin.setBackground(new Color(255, 255, 255));
		btnCrearAdmin.setBounds(41, 405, 147, 66);
		panel.add(btnCrearAdmin);
		
		btnCerrarSesión = new JButton("CERRAR SESIÓN");
		btnCerrarSesión.setBounds(41, 501, 147, 66);
		panel.add(btnCerrarSesión);
		btnCerrarSesión.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btnCerrarSesión.setBackground(new Color(255, 255, 255));
		btnCerrarSesión.setForeground(new Color(0, 0, 0));
		
		JTablaPanel = new JPanel();
		JTablaPanel.setBackground(new Color(255, 255, 255));
		JTablaPanel.setForeground(new Color(0, 0, 0));
		JTablaPanel.setBounds(228, 181, 1065, 460);
		contentPane.add(JTablaPanel);
		JTablaPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 11, 1032, 345);
		JTablaPanel.add(scrollPane);
		
		TablaReservas = new JTable();
		TablaReservas.setFont(new Font("Segoe UI Historic", Font.PLAIN, 15));
		TablaReservas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NOMBRE", "CEDULA", "PERSONAS", "¿CUMPLEAÑOS?", "CORREO"
			}
		));
		scrollPane.setViewportView(TablaReservas);
		
		lblNewLabel_1 = new JLabel("¿DESEA VER UNA FECHA EN ESPECIAL?:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(53, 370, 433, 57);
		JTablaPanel.add(lblNewLabel_1);
		
		textDia = new JTextField();
		textDia.setHorizontalAlignment(SwingConstants.CENTER);
		textDia.setText("DIA");
		textDia.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textDia.setBounds(631, 381, 63, 41);
		JTablaPanel.add(textDia);
		textDia.setColumns(10);
		
		btnVer = new JButton("VER");
		btnVer.setForeground(new Color(255, 255, 255));
		btnVer.setBackground(new Color(64, 0, 128));
		btnVer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnVer.setBounds(910, 378, 145, 41);
		JTablaPanel.add(btnVer);
		
		textMes = new JTextField();
		textMes.setText("MES");
		textMes.setHorizontalAlignment(SwingConstants.CENTER);
		textMes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textMes.setColumns(10);
		textMes.setBounds(704, 381, 63, 41);
		JTablaPanel.add(textMes);
		
		textAño = new JTextField();
		textAño.setText("AÑO");
		textAño.setHorizontalAlignment(SwingConstants.CENTER);
		textAño.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textAño.setColumns(10);
		textAño.setBounds(777, 381, 97, 41);
		JTablaPanel.add(textAño);
		
		lblErrorDia = new JLabel("ERROR");
		lblErrorDia.setForeground(new Color(255, 0, 0));
		lblErrorDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorDia.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblErrorDia.setBounds(641, 422, 46, 14);
		JTablaPanel.add(lblErrorDia);
		
		lblErrorMes = new JLabel("ERROR");
		lblErrorMes.setForeground(new Color(255, 0, 0));
		lblErrorMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorMes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblErrorMes.setBounds(714, 422, 46, 14);
		JTablaPanel.add(lblErrorMes);
		
		lblErrorAño = new JLabel("ERROR");
		lblErrorAño.setForeground(new Color(255, 0, 0));
		lblErrorAño.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorAño.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblErrorAño.setBounds(804, 422, 46, 14);
		JTablaPanel.add(lblErrorAño);
		
		lblTabla = new JLabel("LABEL");
		lblTabla.setForeground(new Color(0, 0, 0));
		lblTabla.setHorizontalAlignment(SwingConstants.CENTER);
		lblTabla.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 99));
		lblTabla.setBounds(262, 23, 991, 112);
		contentPane.add(lblTabla);
		
		lblErrorDia.setVisible(false);
		lblErrorMes.setVisible(false);
		lblErrorAño.setVisible(false);
		
	}
}
