package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.TareaController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

public class ConsultarTarea extends JFrame {

	private JPanel contentPane;
	public JButton btnReservar;
	public JButton btnConsultar;
	
	



	public ConsultarTarea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 733);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnReservar = new JButton("RESERVAR");
		btnReservar.setForeground(new Color(255, 255, 255));
		btnReservar.setBackground(new Color(64, 0, 128));
		btnReservar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
		btnReservar.setBounds(265, 250, 389, 145);
		contentPane.add(btnReservar);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBackground(new Color(64, 0, 128));
		btnConsultar.setForeground(new Color(255, 255, 255));
		btnConsultar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
		btnConsultar.setBounds(265, 472, 389, 145);
		contentPane.add(btnConsultar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(0, 0, 909, 164);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿QUÉ DESEA HACER?");
		lblNewLabel.setBounds(174, 53, 569, 69);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 70));
	}
}
