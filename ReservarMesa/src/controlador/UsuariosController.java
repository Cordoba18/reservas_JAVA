package controlador;
import vista.*;
import sql.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import controlador.*;
import herramientas.AplicarValidación;
import herramientas.Validaciones;
import modelo.*;

public class UsuariosController implements ActionListener, KeyListener, MouseListener{
	String color = "";
	Usuarios u;
	ConsultarReservas Reservas;
	Usuario user = new Usuario();
	Consultas consulta = new Consultas();
	String boton = "crear";
	public UsuariosController(Usuarios u, ConsultarReservas Reservas) {
		
		this.u = u;
		this.Reservas = Reservas;
		this.u.btnVolver.addActionListener(this);
		this.u.btnCrear.addActionListener(this);
		this.u.textNombre.addKeyListener(this);
		this.u.TablaUsuarios.addMouseListener(this);
		this.u.btnCancelar.addActionListener(this);
		this.u.textCorreo.addKeyListener(this);
		this.u.textContraseña.addKeyListener(this);
		this.u.lblCContraseña.addMouseListener(this);
		this.u.btnEliminar.addActionListener(this);
		this.u.textCambioContraseña.addKeyListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(u.btnVolver)) {
		Reservas.setVisible(true);
		u.setVisible(false);
		
	}
	
	if(e.getSource().equals(u.btnEliminar)) {
		
		String nombre = u.textNombre.getText();
		String correo = u.textCorreo.getText();
		char[] contrasena = u.textContraseña.getPassword();
		String Contrasena = String.valueOf(contrasena);
		
		user.setNombre(nombre);
		user.setCorreo(correo);
		user.setContraseña(Contrasena);
		
		if( AplicarValidación.CamposVaciosAdmin(nombre, correo, Contrasena, u) || AplicarValidación.AdminNombre(nombre, u) || AplicarValidación.AdminCorreo(correo, u) || AplicarValidación.AdminContraseña(Contrasena, u)) {
	}else if(!consulta.ConsultarContraseña(user)) {
		
		JOptionPane.showMessageDialog(u, "LA CONTRASEÑA NO COINCIDE");}
else {
	consulta.EliminarUsuario(user);
	JOptionPane.showMessageDialog(Reservas, "USUARIO ELIMINADO CON EXITO");
	u.textNombre.setText("");
	u.textCorreo.setText("");
	u.textContraseña.setText("");
	u.btnCancelar.setVisible(false);
	u.lblTITULO.setText("CREAR ADMINISTRADOR");
	u.btnCrear.setText("CREAR");
	u.lblContrasena.setText("CONTRASEÑA:");
	boton = "crear";
	consulta.tablausuario(u.TablaUsuarios);
	u.btnEliminar.setVisible(false);
	u.lblCContraseña.setVisible(false);
	}
	}
	if(e.getSource().equals(u.btnCrear)) {
		

		
		if(boton.equals("crear")) {
			String nombre = u.textNombre.getText();
			String correo = u.textCorreo.getText();
			char[] contrasena = u.textContraseña.getPassword();
			String Contrasena = String.valueOf(contrasena);
			
			user.setNombre(nombre);
			user.setCorreo(correo);
			user.setContraseña(Contrasena);
			
			if( AplicarValidación.CamposVaciosAdmin(nombre, correo, Contrasena, u) || AplicarValidación.AdminNombre(nombre, u) || AplicarValidación.AdminCorreo(correo, u) || AplicarValidación.AdminContraseña(Contrasena, u)) {
		}else 
			if(consulta.Permitir(user)) {
				
				JOptionPane.showMessageDialog(u, " ERROR USUARIO EXISTENTE");
			}
			else {
				consulta.InsertarAdmin(user);
				JOptionPane.showMessageDialog(u, "USUARIO CREADO CON EXITO");
				consulta.tablausuario(u.TablaUsuarios);
				 u.textNombre.setText("");
				u.textCorreo.setText("");
				u.textContraseña.setText("");
			}
		}
			if(boton.equals("editar")){
				String nombre1 = u.textNombre.getText();
				String correo1 = u.textCorreo.getText();
				char[] contrasena1 = u.textContraseña.getPassword();
				String Contrasena1 = String.valueOf(contrasena1);
				u.lblCContraseña.setVisible(false);
				user.setNombre(nombre1);
				user.setCorreo(correo1);
				user.setContraseña(Contrasena1);
				
				if(AplicarValidación.AdminNombre(nombre1, u) || AplicarValidación.AdminCorreo(correo1, u) || AplicarValidación.AdminContraseña(Contrasena1, u)) {
					
				}else 
					if(!consulta.ConsultarContraseña(user)) {
						u.lblCContraseña.setVisible(true);
						JOptionPane.showMessageDialog(u, "LA CONTRASEÑA NO COINCIDE");}
				else {
				consulta.editarUsuario(user);
				JOptionPane.showMessageDialog(Reservas, "USUARIO EDITADO CON EXITO");
				u.textNombre.setText("");
				u.textCorreo.setText("");
				u.textContraseña.setText("");
				u.btnCancelar.setVisible(false);
				u.lblTITULO.setText("CREAR ADMINISTRADOR");
				u.btnCrear.setText("CREAR");
				u.lblContrasena.setText("CONTRASEÑA:");
				boton = "crear";
				consulta.tablausuario(u.TablaUsuarios);
				u.btnEliminar.setVisible(false);}
			}
			
			if(boton.equals("contraseña")) {
				
				String nuevacon = String.valueOf(u.textCambioContraseña.getPassword());
				char[] contrasena = u.textContraseña.getPassword();
				String Contrasena = String.valueOf(contrasena);
				user.setCorreo(nuevacon);
				user.setContraseña(Contrasena);
				
				if(AplicarValidación.AdminContraseñaNueva(nuevacon, u) || AplicarValidación.AdminContraseña(Contrasena, u)) {
					
				}else 
					if(!consulta.ConsultarContraseña(user)) {
						
						JOptionPane.showMessageDialog(u, "LA CONTRASEÑA NO COINCIDE");}
				else {
				consulta.editarContraseña(user);
				JOptionPane.showMessageDialog(Reservas, "CONTRASEÑA EDITADA");
				u.textNombre.setText("");
				u.textCorreo.setText("");
				u.textContraseña.setText("");
				u.btnCancelar.setVisible(false);
				u.lblTITULO.setText("CREAR ADMINISTRADOR");
				u.btnCrear.setText("CREAR");
				u.lblContrasena.setText("CONTRASEÑA:");
				boton = "crear";
				consulta.tablausuario(u.TablaUsuarios);
				u.textNombre.setVisible(true);
				u.lblNombre.setVisible(true);
				u.lblCorreo.setText("CORREO:");
				u.lblTITULO.setText("CREAR ADMINISTRADOR");
				u.btnCrear.setText("CREAR");
				u.textCambioContraseña.setVisible(false);
				u.textCorreo.setVisible(true);
				}
			}
				
		}
	if(e.getSource().equals(u.btnCancelar)) {
		u.textCambioContraseña.setText("");
		u.textCambioContraseña.setVisible(false);
		u.textCorreo.setVisible(true);
		u.textNombre.setVisible(true);
		u.lblNombre.setVisible(true);
		u.btnEliminar.setVisible(false);
		u.lblCorreo.setText("CORREO:");
		u.lblCContraseña.setVisible(false);
		u.btnCancelar.setVisible(false);
		u.textNombre.setText("");
		u.textCorreo.setText("");
		u.textContraseña.setText("");
		u.lblTITULO.setText("CREAR ADMINISTRADOR");
		u.btnCrear.setText("CREAR");
		u.lblContrasena.setText("CONTRASEÑA:");
		boton = "crear";
		
		
	}
	
		
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
		
		if(boton.equals("crear") || boton.equals("editar")) {
		if(e.getSource().equals(u.textNombre)) {
			
			AplicarValidación.AdminNombre(u.textNombre.getText(), u);
		}
		
		if(e.getSource().equals(u.textCorreo)) {
	
	AplicarValidación.AdminCorreo(u.textCorreo.getText(), u);
}
		
		if(e.getSource().equals(u.textContraseña)) {
	
	AplicarValidación.AdminContraseña(String.valueOf(u.textContraseña.getPassword()), u);
}
		}else{
			if(boton.equals("contraseña")) {
				
				if(e.getSource().equals(u.textCambioContraseña)) {
			
			AplicarValidación.AdminContraseñaNueva(String.valueOf( u.textCambioContraseña.getPassword()), u);
		}
				
				if(e.getSource().equals(u.textContraseña)) {
			
			AplicarValidación.AdminContraseña(String.valueOf(u.textContraseña.getPassword()), u);
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
	
		if(e.getSource().equals(u.TablaUsuarios)) {
		u.lblCContraseña.setVisible(true);
		int row = u.TablaUsuarios.getSelectedRow();
		String nombre = (String)  u.TablaUsuarios.getValueAt(row, 0).toString();
		String correo = (String)  u.TablaUsuarios.getValueAt(row, 1).toString();
		String id = (String)  u.TablaUsuarios.getValueAt(row, 2).toString();
		user.setId(id);
		u.btnEliminar.setVisible(true);
		u.textCambioContraseña.setText("");
		u.btnCancelar.setVisible(true);
		u.textNombre.setText(nombre);
		u.textCorreo.setText(correo);
		u.textContraseña.setText("");
		u.lblTITULO.setText("EDITAR ADMINISTRADOR");
		u.btnCrear.setText("EDITAR");
		boton = "editar";
		u.textNombre.setVisible(true);
		u.lblNombre.setVisible(true);
		u.lblCorreo.setText("CORREO:");
		u.textCambioContraseña.setVisible(false);
		u.textCorreo.setVisible(true);
		
		}
		
		if(e.getSource().equals(u.lblCContraseña)) {
			u.textCambioContraseña.setVisible(true);
			u.textCorreo.setVisible(false);
			u.textContraseña.setText("");
			u.btnEliminar.setVisible(false);
			boton = "contraseña";
			u.lblCContraseña.setVisible(false);
			u.textNombre.setVisible(false);
			u.lblNombre.setVisible(false);
			u.lblCorreo.setText("NUEVA C:");
			u.lblTITULO.setText("CAMBIAR CONTRASEÑA");
			u.textCorreo.setText("");
			u.btnCrear.setText("CAMBIAR");
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
}

