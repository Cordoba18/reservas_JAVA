package controlador;
import java.awt.event.ActionEvent;
import sql.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import herramientas.AplicarValidación;
import modelo.Usuario;
import vista.*;
public class LoginController implements ActionListener, KeyListener {

	
	Login login;
	ConsultarTarea Tarea;
	Consultas consulta = new Consultas();
	
	public LoginController(Login login, ConsultarTarea Tarea) {
		
		this.login = login;
		this.Tarea = Tarea;
		
		this.login.btnEnviar.addActionListener(this);
		this.login.btnVolver.addActionListener(this);
		this.login.textCorreo.addActionListener(this);
		this.login.textContraseña.addActionListener(this);
		this.login.textCorreo.addKeyListener(this);
		this.login.textContraseña.addKeyListener(this);
	}

	Usuario loguear = new Usuario();
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(login.btnVolver)) {
			
			login.setVisible(false);
			Tarea.setVisible(true);
				
			}
		
		if(e.getSource().equals(login.btnEnviar)) {
			
			
			String correo = login.textCorreo.getText();
			char[] contraseña = login.textContraseña.getPassword();
			String Contraseña = String.valueOf(contraseña);
			
			loguear.setCorreo(correo);
			loguear.setContraseña(Contraseña);
			
			if(AplicarValidación.LoginCorreo(correo, login) || AplicarValidación.LoginContraseña(Contraseña, login)) {
			}else 
				if(consulta.ingreso(loguear)) {
					System.out.println("usuario ingresado correctamente");
				login.setVisible(false);
				ConsultarIndex Cindex = new ConsultarIndex();
				ConsultarReservas Reservas = new ConsultarReservas();
				Cindex.setVisible(true);
				new ConsultarIndexController(Cindex, Tarea, Reservas, loguear.getNombre());
			}
				else {
					login.textError.setText("USUARIO NO ENCONTRADO");
				}
				
			
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
	if(e.getSource().equals(login.textCorreo)) {
		
		AplicarValidación.LoginCorreo(login.textCorreo.getText(), login);
	}
	
	if(e.getSource().equals(login.textContraseña)) {
		
		AplicarValidación.LoginContraseña(String.valueOf( login.textContraseña.getPassword()), login);
	}
	}
	}

