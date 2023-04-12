package controlador;
import herramientas.AplicarValidación;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
public class IndexController implements ActionListener {


	Index Principal;
	Reserva Reservar;
	ConsultarTarea Tarea;
	
	public IndexController (Index  Principal, Reserva Reservar, ConsultarTarea Tarea) {
	
		this.Principal = Principal;
		this.Reservar = Reservar;
		this.Tarea = Tarea;
		
		this.Principal.btnLolas.addActionListener(this);
		this.Principal.btnMerecu.addActionListener(this);
		this.Principal.btnQuickly.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
	
		Principal.setVisible(false);
		Reservar.setVisible(true);
		
	
		
		if (e.getSource().equals(Principal.btnLolas)) {
			
			Reservar.setTitle("RESERVAR MESA EN LOLAS");
			String discoteca = "lolas";
			AplicarValidación.NombreReserva("Lolas", Reservar);
			new ReservaController(Reservar, Tarea, discoteca);
		}
		if (e.getSource().equals(Principal.btnQuickly)) {
			String discoteca = "quickly";
			Reservar.setTitle("RESERVAR MESA EN QUICLKY");
			AplicarValidación.NombreReserva("Quickly", Reservar);
			new ReservaController(Reservar, Tarea, discoteca);
		}		
		if (e.getSource().equals(Principal.btnMerecu)) {
			String discoteca = "merecu";
			Reservar.setTitle("RESERVAR MESA EN MERECÚ");
			AplicarValidación.NombreReserva("Merecu", Reservar);
			new ReservaController(Reservar, Tarea, discoteca);
		}	
	
		
		
	}
}
