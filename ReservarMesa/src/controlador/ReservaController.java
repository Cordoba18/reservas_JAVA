package controlador;
import vista.*;
import controlador.FacturaController;
import modelo.*;
import sql.Consultas;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import herramientas.*;
public class ReservaController implements ActionListener, KeyListener, MouseListener {

	
	Reserva Reservar;
	Index index;
	ConsultarTarea Tarea;
	String discoteca;
	String cumpleaños = "no";
	String cervezas = "cervezas";
	String guaro = "guaro";
	String fino= "fino";
	Consultas consulta = new Consultas();
	Usuario u =  new Usuario();
	public ReservaController(Reserva Reservar, ConsultarTarea Tarea, String discoteca) {
		this.Reservar = Reservar;
		this.Tarea = Tarea;
		this.discoteca = discoteca;
		this.Reservar.btnBorrar.addActionListener(this);
		this.Reservar.btnEnviar.addActionListener(this);
		this.Reservar.btnVolver.addActionListener(this);
		this.Reservar.txtNombre.addKeyListener(this);
		this.Reservar.txtCEDULA.addKeyListener(this);
		this.Reservar.txtPersonas.addKeyListener(this);
		this.Reservar.txtCEDULA.addActionListener(this);
		this.Reservar.txtNombre.addActionListener(this);
		this.Reservar.txtPersonas.addActionListener(this);
		this.Reservar.rdbtnCumpleaños.addMouseListener(this);
		this.Reservar.textCorreo.addKeyListener(this);
		this.Reservar.btnBebidas.addActionListener(this);
		
		
	}

	FacturaReserva Factura = new FacturaReserva();
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		new FacturaController(Factura, Tarea); 
		
		if(e.getSource().equals(Reservar.btnBebidas))
		{
			Bebidas bebidas = new Bebidas();
			u.setId("1");
			consulta.ConsultarBebidas(u, cervezas);
			bebidas.lblNombre1.setText(u.getNombre());
			bebidas.lblPrecio1.setText(Integer.toString(u.getPrecio()));
			bebidas.img1.setIcon(new ImageIcon("..\\Imagenes\\"+ u.getImg() +""));
			consulta.ConsultarBebidas(u, guaro);
			bebidas.lblNombre2.setText(u.getNombre());
			bebidas.lblPrecio2.setText(Integer.toString(u.getPrecio()));
			bebidas.img2.setIcon(new ImageIcon("..\\Imagenes\\"+ u.getImg() +""));
			consulta.ConsultarBebidas(u, fino);
			bebidas.lblNombre3.setText(u.getNombre());
			bebidas.lblPrecio3.setText(Integer.toString(u.getPrecio()));
			bebidas.img3.setIcon(new ImageIcon("..\\Imagenes\\"+ u.getImg() +""));
			bebidas.setTitle("Bebidas para :" +discoteca);
			bebidas.setVisible(true);
			Reservar.setVisible(false);
			new BebidasController(bebidas, discoteca, Reservar, Tarea);
			
		}		
		if(e.getSource().equals(Reservar.btnBorrar)) {
			
			Reservar.txtNombre.setText("");
			Reservar.txtCEDULA.setText("");
			Reservar.txtPersonas.setText("");
		}
		
		if(e.getSource().equals(Reservar.btnEnviar)) {
			
			Usuario  Reserva  = new  Usuario();
			String nombre = Reservar.txtNombre.getText();
			String cedula = Reservar.txtCEDULA.getText();
			String personas = Reservar.txtPersonas.getText();
			String correo = Reservar.textCorreo.getText();
		
			Reserva.setNombre(nombre);
			Reserva.setId(cedula);
			Reserva.setPersonas(personas);
			Reserva.setCorreo(correo);
			Reserva.setCumpleaños(cumpleaños);
			
			
			if(AplicarValidación.NomReserva(nombre, Reservar) || AplicarValidación.CedulaReserva(cedula, Reservar) || AplicarValidación.PersonasReserva(personas, Reservar) || AplicarValidación.CorreoReserva(correo, Reservar)) {
			}else 
				if(consulta.reserva(Reserva, discoteca)) {
					JOptionPane.showMessageDialog(Tarea, "YA EXISTE UNA RESERVA CON CEDULA :" + Reserva.getId());
				}
				else
				if(!consulta.limitereservas(Reserva, discoteca)) {
					JOptionPane.showMessageDialog(Tarea, "NO SE PERMITEN MAS RESERVAS");
				}
				else {
					consulta.insertarreserva(Reserva, discoteca);
				
				JOptionPane.showMessageDialog(Factura, "GRACIAS POR SU RESERVA");
				Reservar.textError.setText("-------------------GRACIAS POR SU RESERVA---------------------");
			Factura.setVisible(true);
			Factura.lblDatoNom.setText(Reserva.getNombre());
			Factura.lblDatoCedula.setText(Reserva.getId());
			Factura.lblDatoPersonas.setText(Reserva.getPersonas());
			Factura.lblDatoCumpleaños.setText(Reserva.getCumpleaños());
			Factura.lblDatoCorreo.setText(Reserva.getCorreo());
			Reservar.txtNombre.setText("");
			Reservar.txtCEDULA.setText("");
			Reservar.txtPersonas.setText("");
			Reservar.setVisible(false);
			}
		
			
		}
		if(e.getSource().equals(Reservar.btnVolver)) {
			Reservar.setVisible(false);
			Tarea.setVisible(true);
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
		if(e.getSource().equals(Reservar.txtNombre)) {
			String nombre = Reservar.txtNombre.getText();
			AplicarValidación.NomReserva(nombre, Reservar);}
		else
			
			if(e.getSource().equals(Reservar.txtCEDULA)) {
				String cedula = Reservar.txtCEDULA.getText();
				AplicarValidación.CedulaReserva(cedula, Reservar);
			}
			else 
				if(e.getSource().equals(Reservar.txtPersonas)) {
					String personas = Reservar.txtPersonas.getText();
					AplicarValidación.PersonasReserva(personas, Reservar);
					}
				else
					if(e.getSource().equals(Reservar.textCorreo)) {
						String correo = Reservar.textCorreo.getText();
						AplicarValidación.CorreoReserva(correo, Reservar);
						}
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource().equals(Reservar.rdbtnCumpleaños)){
			
			if(cumpleaños.equals("no")) {
				
				cumpleaños = "si";
				
			}else
			if(cumpleaños.equals("si")) {
				cumpleaños = "no";
				
				
			}
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

	


