package controlador;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import herramientas.AplicarValidación;
import sql.Consultas;
import vista.*;
public class ReservasController implements ActionListener, MouseListener, KeyListener {

	
	ConsultarReservas Reservas;
	ConsultarTarea Tarea;
	ConsultarIndex Cindex;
	String discoteca;
	String boton = "bebidas";
	Consultas consulta = new Consultas();
	
	public ReservasController(ConsultarReservas Reservas, ConsultarTarea Tarea, ConsultarIndex Cindex, String discoteca) {
		
		this.Reservas = Reservas;
		this.Tarea = Tarea;
		this.Cindex = Cindex;
		this.discoteca = discoteca;
		
		this.Reservas.btnMostrarR.addActionListener(this);
		this.Reservas.btnCerrarSesión.addActionListener(this);
		this.Reservas.btnCdiscoteca.addActionListener(this);
		this.Reservas.btnCrearAdmin.addActionListener(this);
		this.Reservas.btnVer.addActionListener(this);
		this.Reservas.textDia.addMouseListener(this);
		this.Reservas.textDia.addKeyListener(this);
		this.Reservas.textMes.addMouseListener(this);
		this.Reservas.textMes.addKeyListener(this);
		this.Reservas.textAño.addMouseListener(this);
		this.Reservas.textAño.addKeyListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource().equals(Reservas.btnMostrarR)) {
			
			if (discoteca.isEmpty()){
				
			}
			else {
				if(boton.equals("bebidas")) {
					Reservas.textDia.setText("DÍA");
					Reservas.textMes.setText("MES");
					Reservas.textAño.setText("AÑO");
				Reservas.lblTabla.setText("Bebidas de "+ discoteca);
				boton = "reservas";	
				consulta.tablabebidas(Reservas.TablaReservas, discoteca);
				Reservas.btnMostrarR.setText("RESERVAS");
				}else
				if(boton.equals("reservas")){
					Reservas.textDia.setText("DÍA");
					Reservas.textMes.setText("MES");
					Reservas.textAño.setText("AÑO");
					Reservas.lblTabla.setText("Reservas de "+ discoteca);
			boton = "bebidas";
			Reservas.btnMostrarR.setText("BEBIDAS");
			consulta.ingresoreserva(Reservas.TablaReservas, discoteca);
			}
			}
		}
		
		if(e.getSource().equals(Reservas.btnCdiscoteca)) {
	if (discoteca.isEmpty()){
				
			}
			else {
				Reservas.lblTabla.setText("Reservas de "+ discoteca);
				boton = "bebidas";
				Reservas.btnMostrarR.setText("BEBIDAS");
			Reservas.setVisible(false);
			discoteca="";
			Cindex.setVisible(true);}
		}
		
		if(e.getSource().equals(Reservas.btnCerrarSesión)) {
			
	if (discoteca.isEmpty()){
				
			}
			else {
				Reservas.lblTabla.setText("Reservas de "+ discoteca);
				boton = "bebidas";
				Reservas.btnMostrarR.setText("BEBIDAS");
			Reservas.setVisible(false);
			Tarea.setVisible(true);}
			
		}
		if(e.getSource().equals(Reservas.btnCrearAdmin)) {
	
			
	if (discoteca.isEmpty()){
				
			}
			else {
			Usuarios u = new Usuarios();
			new UsuariosController(u, Reservas);
			u.setVisible(true);
			consulta.tablausuario(u.TablaUsuarios);
			Reservas.setVisible(false);
			}
		
		}
		if(e.getSource().equals(Reservas.btnVer)) {
if (discoteca.isEmpty()){
				
			}else {
			if(AplicarValidación.Dia(Reservas.textDia.getText(), Reservas) || AplicarValidación.Mes(Reservas.textMes.getText(), Reservas) ||
					AplicarValidación.Año(Reservas.textAño.getText(), Reservas)) {
				JOptionPane.showMessageDialog(null, "INGRESE UNA FECHA VERIDICA"); 
			 }else {
				 
			if(boton.equals("bebidas")) {
				 
				if(!consulta.ReservaPorfecha(Reservas.TablaReservas, discoteca, Reservas.textDia.getText(),Reservas.textMes.getText(), Reservas.textAño.getText() )){
					JOptionPane.showMessageDialog(null, "!NO HAY RESERVAS PARA ESA FECHA!");
				}else {
					
				}
				
			}else 
				if(boton.equals("reservas")) {
					
					if(!consulta.BebidasPorFecha(Reservas.TablaReservas, discoteca, Reservas.textDia.getText(),Reservas.textMes.getText(), Reservas.textAño.getText())) {
						JOptionPane.showMessageDialog(null, "!NO HAY RESERVAS PARA ESA FECHA!");
					}else {
						
					}
				}
		}
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource().equals(Reservas.textDia)) {
			Reservas.textDia.setText("");
		}		
		if(e.getSource().equals(Reservas.textMes)) {
			Reservas.textMes.setText("");
		}		
		if(e.getSource().equals(Reservas.textAño)) {
			Reservas.textAño.setText("");
		}		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource().equals(Reservas.textDia)) {
			
			AplicarValidación.Dia(Reservas.textDia.getText(), Reservas);
			}
		
	
	if(e.getSource().equals(Reservas.textMes)) {
		
		AplicarValidación.Mes(Reservas.textMes.getText(), Reservas);
		}
	
	if(e.getSource().equals(Reservas.textAño)) {
		
		AplicarValidación.Año(Reservas.textAño.getText(), Reservas);
		}
	


	
}
	
	
}
