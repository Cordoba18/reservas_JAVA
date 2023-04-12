package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;
public class TareaController implements ActionListener {
	

	ConsultarTarea Tarea;
	Login login;
	Reserva Reservar;
	
	public TareaController(ConsultarTarea Tarea) {
		
		this.Tarea = Tarea;
		eventos();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	private void eventos() {
		
		this.Tarea.btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Login login = new Login();
				login.setVisible(true);
				Tarea.setVisible(false);
				new LoginController(login, Tarea);
			}
		});
		this.Tarea.btnReservar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Index index = new Index();
				Reserva Reservar = new Reserva();
				index.setVisible(true);
				Tarea.setVisible(false);
				new IndexController(index, Reservar, Tarea);
				
				
			}
		});
	}
}


