package herramientas;

import vista.Bebidas;
import vista.ConsultarReservas;
import vista.FacturaReserva;
import vista.Index;
import vista.Login;
import vista.Reserva;
import vista.Usuarios;

import javax.swing.JOptionPane;

import herramientas.Validaciones;
import modelo.Usuario;
public class AplicarValidación {
	
	static int total;
	public static boolean NomReserva(String texto, Reserva reserva) {
		if(Validaciones.vacio(texto) || Validaciones.SoloLetras(texto)) {
			reserva.textError.setText("ERROR EN EL CAMPO NOMBRE (NO NUMEROS) O CAMPO VACIO");
			reserva.lblErrorNombre.setVisible(true);
			return true;
		}else {
			reserva.lblErrorNombre.setVisible(false);
			reserva.textError.setText("");
		return false;}
	}
	public static boolean CamposVaciosReserva(String texto, String texto2, String texto3, Reserva reserva) {
		if(Validaciones.vacio(texto) || Validaciones.vacio(texto2) || Validaciones.vacio(texto3)) {
			reserva.textError.setText("ERROR CAMPOS VACIOS");
			return true;
		}else {
			reserva.textError.setText("");
		return false;}
	}
	
	public static boolean CedulaReserva(String texto, Reserva reserva) {
		if(Validaciones.vacio(texto) || Validaciones.SoloNum(texto) || Validaciones.CantidadCedula(texto)) {
			reserva.textError.setText("ERROR: CAMPO VACIO NO LETRAS O CEDULA MAYOR A 10 Caracteres O MENOR A 8");
			reserva.lblErrorCedula.setVisible(true);
			return true;
		}else {
			reserva.lblErrorCedula.setVisible(false);
			reserva.textError.setText("");
		return false;}
	}
	public static boolean PersonasReserva(String texto, Reserva reserva) {
		if(Validaciones.vacio(texto) || Validaciones.SoloNum(texto) || Validaciones.CantidadPersonas(texto)) {
			reserva.textError.setText(" ERROR:CAMPO VACIO, NO LETRAS O PERSONAS MAYOR A 10");
			reserva.lblErrorPersonas.setVisible(true);
			return true;
		}else {
			reserva.lblErrorPersonas.setVisible(false);
			reserva.textError.setText("");
		return false;}
	}
	
	public static boolean CorreoReserva(String texto, Reserva reserva) {
		if(Validaciones.vacio(texto) || Validaciones.validarCorreo(texto) || (Validaciones.CantidadCorreo(texto))) {
			reserva.textError.setText("ERROR EN EL CAMPO CORREO");
			reserva.lblErrorCorreo.setVisible(true);
			return true;
		}else {
			reserva.lblErrorCorreo.setVisible(false);
			reserva.textError.setText("");
		return false;}
	}
	//---------------------------------------------------------------------------------------------------------------------
	
	public static boolean LoginCorreo (String texto, Login login) {
		if((Validaciones.vacio(texto)) || (Validaciones.validarCorreo(texto)) || (Validaciones.CantidadCorreo(texto))) {
			login.textError.setText("ERROR DEL CORREO");
			login.lblErrorCorreo.setVisible(true);
			return true;
		}else {
			login.textError.setText("");
			login.lblErrorCorreo.setVisible(false);
		return false;}
	}
	
	public static boolean LoginContraseña (String texto, Login login) {
		if(Validaciones.vacio(texto) || Validaciones.cantidadcontraseña(texto) || Validaciones.validarContraseña(texto)) {
			login.textError.setText("ERROR EN CONTRASEÑA");
			login.lblErrorContraseña.setVisible(true);;
			return true;
		}else {
			login.textError.setText("");
			login.lblErrorContraseña.setVisible(false);;
		return false;}
	}
	
	public static boolean CamposVaciosLogin(String texto, String texto2, Login login) {
		if(Validaciones.vacio(texto) || Validaciones.vacio(texto2) ) {
			login.textError.setText("ERROR CAMPOS VACIOS");
			login.lblErrorCorreo.setVisible(true);
			login.lblErrorContraseña.setVisible(true);
			return true;
		}else {
			login.lblErrorCorreo.setVisible(false);
			login.lblErrorContraseña.setVisible(false);
			login.textError.setText("");
		return false;}
	}
	//-----------------------------------------------------------------------------------------------------------------------
	
	public static boolean AdminNombre (String texto, Usuarios u) {
		if(Validaciones.vacio(texto) || Validaciones.SoloLetras(texto) ) {
			u.lblErrorNombre.setVisible(true);
			return true;
		}else {
			u.lblErrorNombre.setVisible(false);
		return false;}
	}
	
	public static boolean AdminCorreo (String texto, Usuarios u) {
		if(Validaciones.vacio(texto) || Validaciones.validarCorreo(texto) || Validaciones.CantidadCorreo(texto) ) {
			u.lblErrorCorreo.setVisible(true);
			return true;
		}else {
			u.lblErrorCorreo.setVisible(false);
			return false;}
	}
	public static boolean AdminContraseña (String texto, Usuarios u) {
		if(Validaciones.vacio(texto) || Validaciones.validarContraseña(texto)|| Validaciones.cantidadcontraseña(texto) ) {
			u.lblErrorContraseña.setVisible(true);
			return true;
		}else {
			u.lblErrorContraseña.setVisible(false);
		return false;}
	}
	public static boolean AdminContraseñaNueva (String texto, Usuarios u) {
		if(Validaciones.vacio(texto) || Validaciones.validarContraseña(texto)|| Validaciones.cantidadcontraseña(texto) ) {
			u.lblErrorCorreo.setVisible(true);
			return true;
		}else {
			u.lblErrorCorreo.setVisible(false);
		return false;}
	}
	
	public static boolean CamposVaciosAdmin(String texto, String texto2, String texto3, Usuarios u) {
		if(Validaciones.vacio(texto) && Validaciones.vacio(texto2) && Validaciones.vacio(texto3)) {
			u.lblErrorNombre.setVisible(true);
			u.lblErrorCorreo.setVisible(true);
			u.lblErrorContraseña.setVisible(true);
			return true;
		}else {
			u.lblErrorNombre.setVisible(false);
			u.lblErrorCorreo.setVisible(false);
			u.lblErrorContraseña.setVisible(false);
		return false;}
	}
	//-------------------------------------------------------------------------------------------------------------
	
	
public static void NombreReserva (String nom, Reserva Reservar) {
		
		if(nom.equals ("Quickly")) {
			
			Reservar.txtNomDiscoteca.setText("RESERVAR EN QUICKLY");
		}
		
		if(nom.equals("Lolas")) {
			Reservar.txtNomDiscoteca.setText("RESERVAR EN LOLAS");
		}
		if(nom.equals("Merecu")) {
			Reservar.txtNomDiscoteca.setText("RESERVAR EN MERECÚ");
			
		}
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------

public static boolean CedulaBebidas(String texto, Bebidas bebidas) {

	
	if(Validaciones.vacio(texto) || Validaciones.SoloNum(texto) || Validaciones.CantidadCedula(texto)) {
		bebidas.lblErrorCedula.setVisible(true);
		return true;
	}else {
		bebidas.lblErrorCedula.setVisible(false);
	return false;}
}

public static boolean Cantidad1(String texto, Bebidas bebidas) {
	if(texto.isEmpty()) {
		return false;
	}
	else
	if( Validaciones.SoloNum(texto) || Validaciones.Menorquediez(texto)) {
		bebidas.lblError1.setVisible(true);
		return true;
	}else {
		bebidas.lblError1.setVisible(false);
	return false;}
}

public static boolean Cantidad2(String texto, Bebidas bebidas) {
	if(texto.isEmpty()) {
		return false;
	}
	else
	if( Validaciones.SoloNum(texto) || Validaciones.MenorqueCinco(texto)) {
		bebidas.lblError2.setVisible(true);
		return true;
	}else {
		bebidas.lblError2.setVisible(false);
	return false;}
}

public static boolean Cantidad3(String texto, Bebidas bebidas) {
	if(texto.isEmpty()) {
		return false;
	}
	else
	if( Validaciones.SoloNum(texto) || Validaciones.MenorqueCinco(texto)) {
		bebidas.lblError3.setVisible(true);
		return true;
	}else {
		bebidas.lblError3.setVisible(false);
	return false;}
}
public static void Total(int texto, int texto2, int texto3, Bebidas bebidas, Usuario variables) {
	total = texto + texto2 + texto3 + total;
	
	bebidas.textTotal.setText("$" +Integer.toString(total));
	variables.setTotal(total);
	total = 0;
}

public static boolean vaciosbebidas(int texto, int texto2, int texto3) {
	
	if(texto == 0 && texto2 == 0 && texto3 == 0 ) {
		return true;
	}else {
		return false;
	}
}
//-------------------------------------------------------------------------------------------------------------------------------
public static boolean Dia (String texto, ConsultarReservas Reservas) {
	if(Validaciones.vacio(texto) || Validaciones.SoloNum(texto) || Validaciones.CantidadDia(texto)) {
		Reservas.lblErrorDia.setVisible(true);
		return true;
	}else {
		Reservas.lblErrorDia.setVisible(false);
	return false;}
}

public static boolean Mes (String texto, ConsultarReservas Reservas) {
	if(Validaciones.vacio(texto) || Validaciones.SoloNum(texto) || Validaciones.CantidadMes(texto)) {
		Reservas.lblErrorMes.setVisible(true);
		return true;
	}else {
		Reservas.lblErrorMes.setVisible(false);
	return false;}
}
public static boolean Año (String texto, ConsultarReservas Reservas) {
	if(Validaciones.vacio(texto) || Validaciones.SoloNum(texto) || Validaciones.CantidadAño(texto)) {
		Reservas.lblErrorAño.setVisible(true);
		return true;
	}else {
		Reservas.lblErrorAño.setVisible(false);
	return false;}
}

}
