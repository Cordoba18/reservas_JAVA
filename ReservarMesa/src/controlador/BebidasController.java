package controlador;
import sql.*;

import vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import herramientas.AplicarValidación;
import modelo.Usuario;
public class BebidasController implements ActionListener, KeyListener, MouseListener{

	Bebidas bebidas;
	String discoteca;
	Reserva Reservar;
	String nombrec;
	String nombreg;
	String nombref;
	String cervezas = "cervezas";
	String guaro = "guaro";
	String fino= "fino";
	int cervezaprecio;
	 int guaroprecio;
	int finoprecio;
	String cantidad1;
	String cantidad2;
	String cantidad3;
	ConsultarTarea Tarea;
	Usuario variables = new Usuario();
	Consultas consulta = new Consultas();
	int id1 = 1;
	int id2 = 1;
	int id3 = 1;
	public BebidasController(Bebidas bebidas, String discoteca, Reserva Reservar, ConsultarTarea Tarea) {
		
		this.bebidas = bebidas;
		this.discoteca = discoteca;
		this.Reservar = Reservar;
		this.Tarea = Tarea;
		this.bebidas.btnIzquierda1.addActionListener(this);
		this.bebidas.btnDerecha1.addActionListener(this);
		this.bebidas.btnIzquierda2.addActionListener(this);
		this.bebidas.btnDerecha2.addActionListener(this);
		this.bebidas.btnIzquierda3.addActionListener(this);
		this.bebidas.btnDerecha3.addActionListener(this);
		this.bebidas.textCantidad1.addKeyListener(this);
		this.bebidas.textCantidad2.addKeyListener(this);
		this.bebidas.textCantidad3.addKeyListener(this);
		this.bebidas.textCedula.addKeyListener(this);
		this.bebidas.textCedula.addMouseListener(this);
		this.bebidas.btnEnviar.addActionListener(this);
		this.bebidas.btnVolver.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(bebidas.btnVolver)) {
			Reservar.setVisible(true);
			bebidas.setVisible(false);
		}
		
		if(e.getSource().equals(bebidas.btnIzquierda1)) {
			
			id1 = id1 - 1;
			variables.setId(Integer.toString(id1));
			if(!consulta.ConsultarBebidas(variables, cervezas)) {
				bebidas.btnIzquierda1.setVisible(false);
				id1 = id1 + 1;
			}
			else {
				cervezaprecio = 0;
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
				bebidas.textCantidad1.setText("");
				bebidas.btnIzquierda1.setVisible(true);
				bebidas.btnDerecha1.setVisible(true);
			bebidas.lblNombre1.setText(variables.getNombre());
			bebidas.lblPrecio1.setText(Integer.toString(variables.getPrecio()));
			bebidas.img1.setIcon(new ImageIcon("..\\Imagenes\\"+ variables.getImg() +""));
			}
		}
		
		if(e.getSource().equals(bebidas.btnDerecha1)) {
			
			id1 = id1 + 1;
			variables.setId(Integer.toString(id1));
			if(!consulta.ConsultarBebidas(variables, cervezas)) {
				bebidas.btnDerecha1.setVisible(false);
				id1 = id1 - 1;
			}
			else {
				cervezaprecio = 0;
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
				bebidas.textCantidad1.setText("");
				bebidas.btnDerecha1.setVisible(true);
				bebidas.btnIzquierda1.setVisible(true);
			bebidas.lblNombre1.setText(variables.getNombre());
			bebidas.lblPrecio1.setText(Integer.toString(variables.getPrecio()));
			bebidas.img1.setIcon(new ImageIcon("..\\Imagenes\\"+ variables.getImg() +""));
			
			}
		}
		
		if(e.getSource().equals(bebidas.btnIzquierda2)) {
			
			id2 = id2 - 1;
			variables.setId(Integer.toString(id2));
			if(!consulta.ConsultarBebidas(variables, guaro)) {
				bebidas.btnIzquierda2.setVisible(false);
				id2 = id2 + 1;
			}
			else {
				guaroprecio = 0;
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
				bebidas.textCantidad2.setText("");
				bebidas.btnIzquierda2.setVisible(true);
				bebidas.btnDerecha2.setVisible(true);
			bebidas.lblNombre2.setText(variables.getNombre());
			bebidas.lblPrecio2.setText(Integer.toString(variables.getPrecio()));
			bebidas.img2.setIcon(new ImageIcon("..\\Imagenes\\"+ variables.getImg() +""));}
			
		}
		
		if(e.getSource().equals(bebidas.btnDerecha2)) {
			
			id2 = id2 + 1;
			variables.setId(Integer.toString(id2));
			if(!consulta.ConsultarBebidas(variables, guaro)) {
				bebidas.btnDerecha2.setVisible(false);
				id2 = id2 - 1;
			}
			else {
				guaroprecio = 0;
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas,variables);
				bebidas.textCantidad2.setText("");
				bebidas.btnDerecha2.setVisible(true);
				bebidas.btnIzquierda2.setVisible(true);
			bebidas.lblNombre2.setText(variables.getNombre());
			bebidas.lblPrecio2.setText(Integer.toString(variables.getPrecio()));
			bebidas.img2.setIcon(new ImageIcon("..\\Imagenes\\"+ variables.getImg()));
			}
		}
		if(e.getSource().equals(bebidas.btnIzquierda3)) {
			
			id3 = id3 - 1;
			variables.setId(Integer.toString(id3));
			if(!consulta.ConsultarBebidas(variables, fino)) {
				bebidas.btnIzquierda3.setVisible(false);
				id3 = id3 + 1;
			}
			else {
				finoprecio = 0;
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas,variables);
				bebidas.textCantidad3.setText("");
				bebidas.btnIzquierda3.setVisible(true);
				bebidas.btnDerecha3.setVisible(true);
			bebidas.lblNombre3.setText(variables.getNombre());
			bebidas.lblPrecio3.setText(Integer.toString(variables.getPrecio()));
			bebidas.img3.setIcon(new ImageIcon("..\\Imagenes\\"+ variables.getImg()));
		}
		}
		
		if(e.getSource().equals(bebidas.btnDerecha3)) {
			
			id3 = id3 + 1;
			variables.setId(Integer.toString(id3));
			if(!consulta.ConsultarBebidas(variables, fino)) {
				bebidas.btnDerecha3.setVisible(false);
				id3 = id3 - 1;
			}
			else {
				finoprecio = 0;
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas,variables);
				bebidas.textCantidad3.setText("");
				bebidas.btnDerecha3.setVisible(true);
				bebidas.btnIzquierda3.setVisible(true);
			bebidas.lblNombre3.setText(variables.getNombre());
			bebidas.lblPrecio3.setText(Integer.toString(variables.getPrecio()));
			bebidas.img3.setIcon(new ImageIcon("..\\Imagenes\\"+ variables.getImg()));
		}
			
		}
		if(e.getSource().equals(bebidas.btnEnviar)) {
			
			nombrec = bebidas.lblNombre1.getText();
			nombreg = bebidas.lblNombre2.getText();
			nombref = bebidas.lblNombre3.getText();
			if(bebidas.textCantidad1.getText().isEmpty()) {
				cervezaprecio = 0;
				nombrec = "no";
				cantidad1 = "0";
			}
			if(bebidas.textCantidad2.getText().isEmpty()) {
				guaroprecio = 0;
				nombreg = "no";
				cantidad2 = "0";
			}
			
			if(bebidas.textCantidad3.getText().isEmpty()) {
				finoprecio = 0;
				nombref = "no";
				cantidad3 = "0";
				
			} 
			if(AplicarValidación.vaciosbebidas(cervezaprecio, 
					guaroprecio, finoprecio)) {
				JOptionPane.showMessageDialog(null, "DEBES RESERVAR ALGO");
			}else {
			variables.setNombrec(nombrec);
			variables.setNombreg(nombreg);
			variables.setNombref(nombref);
			variables.setId(bebidas.textCedula.getText());
			variables.setCantidadc(cantidad1);
			variables.setCantidadg(cantidad2);
			variables.setCantidadf(cantidad3);
			
			if(AplicarValidación.CedulaBebidas(bebidas.textCedula.getText(), bebidas) ||AplicarValidación.vaciosbebidas(cervezaprecio, 
					guaroprecio, finoprecio)) {
			}else
				if(!consulta.mirarcedula(bebidas.textCedula.getText(), discoteca)) {
					JOptionPane.showMessageDialog(Reservar, "USTED NO TIENE UNA RESERVA");
				}
				else
					
			{
				consulta.insertarbebida(variables, discoteca);
				JOptionPane.showMessageDialog(bebidas,"BEBIDAS INGRESADAS CON EXITA");
				FacturaReserva factura = new FacturaReserva();
				bebidas.setVisible(false);
				factura.setVisible(true);
				factura.lblNombreCompleto.setText("CEDULA:");
				factura.lblDatoNom.setText(bebidas.textCedula.getText());
				factura.lblCedula.setText("CERVEZAS:");
				factura.lblDatoCedula.setText("$"+Integer.toString(cervezaprecio));
				factura.lblNumeroDePersonas.setText("GUARO :");
				factura.lblDatoPersonas.setText("$"+Integer.toString(guaroprecio));
				factura.lblcumpleaos.setText("TRAGO FINO :");
				factura.lblDatoCumpleaños.setText("$"+Integer.toString(finoprecio));
				factura.lblCorreo.setText("TOTAL :");
				factura.lblDatoCorreo.setText(bebidas.textTotal.getText());
				factura.lblMensaje.setText("---------------------------------------------------------------");
				new FacturaController(factura, Tarea);
			
			}
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
		if(bebidas.textCantidad1.getText().isEmpty()) {
			cervezaprecio = 0;
			AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
		}
		
		if(bebidas.textCantidad2.getText().isEmpty()) {
			guaroprecio = 0;
			AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
		}
		
		if(bebidas.textCantidad3.getText().isEmpty()) {
			finoprecio = 0;
			AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
			
		}
		AplicarValidación.Total(cervezaprecio ,guaroprecio , finoprecio, bebidas, variables);
		
		if(e.getSource().equals(bebidas.textCedula)) {
			String cedula = bebidas.textCedula.getText();
			if(cedula.isEmpty()) {
				bebidas.textCedula.setText("INGRESE SU CEDULA AQUÍ"); 
				
			}
		}
		if(e.getSource().equals(bebidas.textCedula))
		{
			String cedula = bebidas.textCedula.getText();
			AplicarValidación.CedulaBebidas(cedula, bebidas);}
				
			
			
		if(e.getSource().equals(bebidas.textCantidad1)) {
			
			cantidad1 = bebidas.textCantidad1.getText();
			if(AplicarValidación.Cantidad1(cantidad1, bebidas)|| cantidad1.isEmpty()){
				cervezaprecio = 0;
			}else
			{
				cervezaprecio = Integer.parseInt(cantidad1) * Integer.parseInt(bebidas.lblPrecio1.getText());
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
			}
		}
		
		if(e.getSource().equals(bebidas.textCantidad2)) {
			
			cantidad2 = bebidas.textCantidad2.getText();
			if(AplicarValidación.Cantidad2(cantidad2, bebidas) || cantidad2.isEmpty()) {
				guaroprecio = 0;
				}
			else {
				guaroprecio = Integer.parseInt(cantidad2) * Integer.parseInt(bebidas.lblPrecio2.getText());
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
			}
		}
		
		if(e.getSource().equals(bebidas.textCantidad3)) {
			finoprecio = 0;
			cantidad3 = bebidas.textCantidad3.getText();
			if(AplicarValidación.Cantidad3(cantidad3, bebidas) || cantidad3.isEmpty()) {
				}else {
				finoprecio = Integer.parseInt(cantidad3) *Integer.parseInt(bebidas.lblPrecio3.getText());
				AplicarValidación.Total(cervezaprecio,  guaroprecio , finoprecio, bebidas, variables);
		}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource().equals(bebidas.textCedula)) {
			
			bebidas.textCedula.setText("");
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
