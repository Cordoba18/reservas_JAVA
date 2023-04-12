package controlador;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sql.Consultas;

public class ConsultarIndexController implements ActionListener{
	
	ConsultarIndex Cindex;
	ConsultarTarea Tarea;
	ConsultarReservas Reservas;
	String correo;
	String discoteca;
	Consultas consulta = new Consultas();
	
	
	public ConsultarIndexController(ConsultarIndex Cindex, ConsultarTarea Tarea, ConsultarReservas Reservas, String correo) {
	
		this.Cindex = Cindex;
		this.Tarea = Tarea;
		this.Reservas = Reservas;
		this.correo = correo;
		
		this.Cindex.btnLolas.addActionListener(this);
		this.Cindex.btnMerecu.addActionListener(this);
		this.Cindex.btnQuickly.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Reservas.setVisible(true);
		Cindex.setVisible(false);
		Reservas.lblUsuario.setText(correo);
		
		if(e.getSource().equals(Cindex.btnLolas)) {
			
			Reservas.lblDiscoteca.setText("Lolas");
			discoteca = "lolas";
			Reservas.lblTabla.setText("Reservas de "+ discoteca);
			consulta.ingresoreserva(Reservas.TablaReservas, discoteca);
			new ReservasController(Reservas, Tarea, Cindex, discoteca);
		}
		
		if(e.getSource().equals(Cindex.btnMerecu)) {
			
			Reservas.lblDiscoteca.setText("Merecú");
			discoteca = "merecu";
			Reservas.lblTabla.setText("Reservas de "+ discoteca);
			consulta.ingresoreserva(Reservas.TablaReservas, discoteca);
			new ReservasController(Reservas, Tarea, Cindex, discoteca);
		}
		if(e.getSource().equals(Cindex.btnQuickly)) {
	
			Reservas.lblDiscoteca.setText("Quickly");
			discoteca = "quickly";
			Reservas.lblTabla.setText("Reservas de "+ discoteca);
			consulta.ingresoreserva(Reservas.TablaReservas, discoteca);
			new ReservasController(Reservas, Tarea, Cindex, discoteca);
		}
		
	}

}
