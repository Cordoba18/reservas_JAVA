package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.*;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
public class Index extends JFrame {

	private JPanel contentPane;
	public JButton btnQuickly;
	public JButton btnMerecu;
	public JButton btnLolas;
	public JPanel panel;

	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 799);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		btnQuickly = new JButton("Quickly");
		btnQuickly.setForeground(new Color(255, 255, 255));
		btnQuickly.setBackground(new Color(64, 0, 128));
		btnQuickly.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 69));
		btnQuickly.setBounds(82, 254, 339, 156);
		contentPane.add(btnQuickly);
		
		btnLolas = new JButton("Lolas");
		btnLolas.setForeground(new Color(255, 255, 255));
		btnLolas.setBackground(new Color(64, 0, 128));
		btnLolas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 69));
		btnLolas.setBounds(517, 255, 339, 155);
		contentPane.add(btnLolas);
		
	
		btnMerecu = new JButton("Merecú");
		btnMerecu.setForeground(new Color(255, 255, 255));
		btnMerecu.setBackground(new Color(64, 0, 128));
		btnMerecu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 69));
		btnMerecu.setBounds(307, 457, 355, 155);
		contentPane.add(btnMerecu);
		
		panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(0, 0, 932, 156);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDiscoteca = new JLabel("ELIGE LA DISCOTECA");
		lblDiscoteca.setForeground(new Color(255, 255, 255));
		lblDiscoteca.setBounds(222, 55, 544, 53);
		panel.add(lblDiscoteca);
		lblDiscoteca.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 69));
	}
}
