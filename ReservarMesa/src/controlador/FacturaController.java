package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class FacturaController implements ActionListener {

	FacturaReserva Factura;
	ConsultarTarea Tarea;
	public FacturaController(FacturaReserva Factura, ConsultarTarea Tarea) {
		
		this.Factura = Factura;
		this.Tarea = Tarea;
		
		this.Factura.btnVolver.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource().equals(Factura.btnVolver)) {
			
			Tarea.setVisible(true);
			Factura.setVisible(false);
		}
		
	}
}
