package ejecutador;
import controlador.TareaController;
import vista.*;
public class Main {

	public static void main(String[] args) {
	
		ConsultarTarea I = new ConsultarTarea();
		TareaController tarea = new TareaController(I);
		I.setVisible(true);
		I.setTitle("BIENVENIDO");
		
	}

}
