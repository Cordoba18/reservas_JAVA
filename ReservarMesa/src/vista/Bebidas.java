package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ImageIcon;

public class Bebidas extends JFrame {

	private JPanel contentPane;
	public JTextField textCantidad1;
	public JTextField textCantidad2;
	public JTextField textCantidad3;
	public JTextField textTotal;
	public JTextField textCedula;
	public JLabel img1;
	public JLabel lblPrecio1;
	public JLabel lblNombre1;
	public JLabel lblimg1;
	public JLabel lblCantidad1;
	public JButton btnIzquierda1;
	public JButton btnDerecha1;
	public 	JLabel img2 ;
	public JLabel lblPrecio2;
	public JLabel lblNombre2;
	public JLabel lblimg2;
	public JLabel lblCantidad2;
	public JButton btnIzquierda2;
	public JButton btnDerecha2;
	public JLabel img3;
	public JLabel lblimg3;
	public JLabel lblPrecio3;
	public JLabel lblNombre3;
	public JButton btnIzquierda3;
	public JButton btnDerecha3;
	public JButton btnVolver;
	public JButton btnEnviar;
	public JLabel lblError3;
	public JLabel lblError1;
	public JLabel lblError2;
	public JLabel lblErrorCedula;
	public Bebidas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1191, 772);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(0, 0, 1175, 118);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBb = new JLabel("ELIJA SUS BEBIDAS");
		lblBb.setForeground(new Color(255, 255, 255));
		lblBb.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		lblBb.setBounds(391, 24, 422, 61);
		panel.add(lblBb);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 0, 128));
		panel_1.setBounds(27, 159, 758, 173);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		img1 = new JLabel("");
		img1.setForeground(new Color(255, 255, 255));
		img1.setBounds(58, 11, 172, 126);
		panel_1.add(img1);
		img1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblPrecio1 = new JLabel("PRECIO");
		lblPrecio1.setForeground(new Color(255, 255, 255));
		lblPrecio1.setBounds(324, 98, 273, 39);
		panel_1.add(lblPrecio1);
		lblPrecio1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		
		lblNombre1 = new JLabel("TITULO");
		lblNombre1.setForeground(new Color(255, 255, 255));
		lblNombre1.setBounds(314, 52, 283, 35);
		panel_1.add(lblNombre1);
		lblNombre1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		
		lblimg1 = new JLabel("CERVEZAS");
		lblimg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblimg1.setForeground(Color.WHITE);
		lblimg1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblimg1.setBounds(93, 148, 104, 14);
		panel_1.add(lblimg1);
		
		lblCantidad1 = new JLabel("CANTIDAD:");
		lblCantidad1.setForeground(Color.WHITE);
		lblCantidad1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCantidad1.setBounds(607, 61, 111, 26);
		panel_1.add(lblCantidad1);
		
		textCantidad1 = new JTextField();
		textCantidad1.setHorizontalAlignment(SwingConstants.CENTER);
		textCantidad1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		textCantidad1.setBounds(621, 99, 71, 20);
		panel_1.add(textCantidad1);
		textCantidad1.setColumns(10);
		
		btnIzquierda1 = new JButton("<");
		btnIzquierda1.setBackground(new Color(255, 255, 255));
		btnIzquierda1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnIzquierda1.setBounds(10, 63, 44, 23);
		panel_1.add(btnIzquierda1);
		
		btnDerecha1 = new JButton(">");
		btnDerecha1.setBackground(new Color(255, 255, 255));
		btnDerecha1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnDerecha1.setBounds(240, 62, 44, 23);
		panel_1.add(btnDerecha1);
		
		lblError1 = new JLabel("ERROR");
		lblError1.setForeground(new Color(255, 0, 0));
		lblError1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblError1.setBounds(631, 123, 49, 14);
		panel_1.add(lblError1);
		
		JLabel lblSigno = new JLabel("$");
		lblSigno.setForeground(Color.WHITE);
		lblSigno.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblSigno.setBounds(310, 98, 14, 39);
		panel_1.add(lblSigno);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(64, 0, 128));
		panel_2.setBounds(27, 348, 758, 173);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		 img2 = new JLabel("");
		img2.setForeground(new Color(255, 255, 255));
		img2.setBounds(58, 11, 172, 123);
		panel_2.add(img2);
		img2.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblPrecio2 = new JLabel("PRECIO");
		lblPrecio2.setForeground(new Color(255, 255, 255));
		lblPrecio2.setBounds(317, 97, 273, 37);
		panel_2.add(lblPrecio2);
		lblPrecio2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		
		lblNombre2 = new JLabel("TITULO");
		lblNombre2.setForeground(new Color(255, 255, 255));
		lblNombre2.setBounds(307, 50, 283, 34);
		panel_2.add(lblNombre2);
		lblNombre2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		
		lblimg2 = new JLabel("GUARO");
		lblimg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblimg2.setForeground(Color.WHITE);
		lblimg2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblimg2.setBounds(94, 145, 104, 14);
		panel_2.add(lblimg2);
		
		lblCantidad2 = new JLabel("CANTIDAD:");
		lblCantidad2.setForeground(Color.WHITE);
		lblCantidad2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCantidad2.setBounds(600, 50, 104, 34);
		panel_2.add(lblCantidad2);
		
		textCantidad2 = new JTextField();
		textCantidad2.setHorizontalAlignment(SwingConstants.CENTER);
		textCantidad2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		textCantidad2.setColumns(10);
		textCantidad2.setBounds(617, 96, 71, 20);
		panel_2.add(textCantidad2);
		
		btnIzquierda2 = new JButton("<");
		btnIzquierda2.setBackground(new Color(255, 255, 255));
		btnIzquierda2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnIzquierda2.setBounds(10, 61, 44, 23);
		panel_2.add(btnIzquierda2);
		
		btnDerecha2 = new JButton(">");
		btnDerecha2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnDerecha2.setBackground(Color.WHITE);
		btnDerecha2.setBounds(240, 60, 44, 23);
		panel_2.add(btnDerecha2);
		
		lblError2 = new JLabel("ERROR");
		lblError2.setForeground(Color.RED);
		lblError2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblError2.setBounds(627, 120, 44, 14);
		panel_2.add(lblError2);
		
		JLabel lblSigno_1 = new JLabel("$");
		lblSigno_1.setForeground(Color.WHITE);
		lblSigno_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblSigno_1.setBounds(303, 97, 14, 39);
		panel_2.add(lblSigno_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(64, 0, 128));
		panel_3.setForeground(new Color(255, 255, 255));
		panel_3.setBounds(27, 532, 758, 173);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		img3 = new JLabel("");
		img3.setForeground(new Color(255, 255, 255));
		img3.setBounds(58, 11, 172, 123);
		panel_3.add(img3);
		img3.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblimg3 = new JLabel("LICOR FINO");
		lblimg3.setHorizontalAlignment(SwingConstants.CENTER);
		lblimg3.setForeground(Color.WHITE);
		lblimg3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblimg3.setBounds(95, 148, 104, 14);
		panel_3.add(lblimg3);
		
		lblPrecio3 = new JLabel("PRECIO");
		lblPrecio3.setBounds(317, 93, 274, 41);
		panel_3.add(lblPrecio3);
		lblPrecio3.setForeground(new Color(255, 255, 255));
		lblPrecio3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		
		lblNombre3 = new JLabel("TITULO");
		lblNombre3.setBounds(307, 49, 284, 33);
		panel_3.add(lblNombre3);
		lblNombre3.setForeground(new Color(255, 255, 255));
		lblNombre3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		
		JLabel lblCantidad3 = new JLabel("CANTIDAD:");
		lblCantidad3.setForeground(Color.WHITE);
		lblCantidad3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCantidad3.setBounds(601, 49, 104, 33);
		panel_3.add(lblCantidad3);
		
		textCantidad3 = new JTextField();
		textCantidad3.setHorizontalAlignment(SwingConstants.CENTER);
		textCantidad3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		textCantidad3.setColumns(10);
		textCantidad3.setBounds(620, 93, 71, 20);
		panel_3.add(textCantidad3);
		
		btnIzquierda3 = new JButton("<");
		btnIzquierda3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnIzquierda3.setBackground(Color.WHITE);
		btnIzquierda3.setBounds(10, 61, 44, 23);
		panel_3.add(btnIzquierda3);
		
		btnDerecha3 = new JButton(">");
		btnDerecha3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnDerecha3.setBackground(Color.WHITE);
		btnDerecha3.setBounds(240, 61, 44, 23);
		panel_3.add(btnDerecha3);
		
		lblError3 = new JLabel("ERROR");
		lblError3.setForeground(Color.RED);
		lblError3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblError3.setBounds(630, 120, 49, 14);
		panel_3.add(lblError3);
		
		JLabel lblSigno_2 = new JLabel("$");
		lblSigno_2.setForeground(Color.WHITE);
		lblSigno_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblSigno_2.setBounds(303, 93, 14, 39);
		panel_3.add(lblSigno_2);
		
		JLabel lblNewLabel = new JLabel("TOTAL:");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(829, 190, 315, 84);
		contentPane.add(lblNewLabel);
		
		textTotal = new JTextField();
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setBackground(new Color(255, 255, 255));
		textTotal.setEditable(false);
		textTotal.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		textTotal.setBounds(829, 293, 315, 84);
		contentPane.add(textTotal);
		textTotal.setColumns(10);
		
		textCedula = new JTextField();
		textCedula.setHorizontalAlignment(SwingConstants.CENTER);
		textCedula.setText("INGRESE SU CEDULA AQUÍ");
		textCedula.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textCedula.setColumns(10);
		textCedula.setBackground(Color.WHITE);
		textCedula.setBounds(839, 494, 305, 43);
		contentPane.add(textCedula);
		
		JLabel lblI = new JLabel("¿TIENES UNA RESERVA?");
		lblI.setHorizontalAlignment(SwingConstants.CENTER);
		lblI.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblI.setBounds(839, 399, 305, 84);
		contentPane.add(lblI);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(64, 0, 128));
		btnVolver.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		btnVolver.setBounds(839, 585, 145, 66);
		contentPane.add(btnVolver);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setForeground(new Color(0, 0, 0));
		btnEnviar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		btnEnviar.setBackground(new Color(255, 255, 255));
		btnEnviar.setBounds(999, 585, 145, 66);
		contentPane.add(btnEnviar);
		
		lblErrorCedula = new JLabel("ERROR");
		lblErrorCedula.setForeground(new Color(255, 0, 0));
		lblErrorCedula.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorCedula.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblErrorCedula.setBounds(928, 538, 166, 23);
		contentPane.add(lblErrorCedula);
		lblError1.setVisible(false);
		lblError2.setVisible(false);
		lblError3.setVisible(false);
		lblErrorCedula.setVisible(false);
	}
}
