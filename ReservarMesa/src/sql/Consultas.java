package sql;
import modelo.Usuario;
import vista.Login;
import vista.Reserva;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;

import java.text.SimpleDateFormat;
import java.util.Date;

import herramientas.Session;
public class Consultas {

	PreparedStatement PS;
	public boolean ingreso(Usuario Loguear) {
		String pass = (Loguear.getContraseña());
        Conexion conectar = new Conexion();
        String sql = "SELECT * FROM user WHERE correo = '" + Loguear.getCorreo()+ "' AND contraseña = '"+pass+"'";
        ResultSet rs;
        boolean numero = false;
        try {
        	
            rs = conectar.consultar(sql);
            if(rs.next()){
                     numero = true;
             
                     Loguear.setNombre(rs.getString("nombre"));
                     new Session(Loguear);
                 }
            else {
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	public boolean ConsultarBebidas(Usuario Loguear, String bebida) {
        Conexion conectar = new Conexion();
        String sql = "SELECT * FROM "+ bebida +" WHERE id = " + Loguear.getId() + "";
        ResultSet rs;
        boolean numero = false;
        try {
        	
            rs = conectar.consultar(sql);
            if(rs.next()){
                     numero = true;
                     Loguear.setNombre(rs.getString("nombre"));
                     Loguear.setImg(rs.getString("img"));
                     Loguear.setPrecio(rs.getInt("precio"));
                     
                 }
            else {
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	public boolean ConsultarContraseña(Usuario Loguear) {
        Conexion conectar = new Conexion();

        String sql = "SELECT * FROM user WHERE contraseña = '" + Loguear.getContraseña()+ "' AND id = "+Loguear.getId()+"";
        ResultSet rs;
        boolean numero = false;
        try {
        	
            rs = conectar.consultar(sql);
            if(rs.next()){
                     numero = true;
             
                     new Session(Loguear);
                 }
            else {
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	public boolean Permitir(Usuario Loguear) {

        Conexion conectar = new Conexion();
        String sql = "SELECT * FROM user WHERE correo = '" + Loguear.getCorreo()+ "'";
        ResultSet rs;
        boolean numero = false;
        try {
        	
            rs = conectar.consultar(sql);
            if(rs.next()){
                     numero = true;
             
                     Loguear.setNombre(rs.getString("nombre"));
                     new Session(Loguear);
                 }
            else {
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	
	public boolean insertarbebida(Usuario variables, String discoteca) {
		
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yyyy";
		SimpleDateFormat sdf =new SimpleDateFormat(DATE_FORMAT);
        Conexion conectar = new Conexion();
        String sql = "INSERT INTO  reservabebida(cedula, cerveza, cantidadc , guaro,cantidadg , fino , cantidadf, total, discoteca, fecha) VALUES ("
        		+ "'"+variables.getId() +"',"
        		+ "'"+ variables.getNombrec() +"',"
        		+ ""+ Integer.parseInt(variables.getCantidadc()) +","
        		+"'" + variables.getNombreg() + "',"
        		+""+ Integer.parseInt(variables.getCantidadg()) +","
        		+"'" + variables.getNombref() + "',"
                +"" + Integer.parseInt(variables.getCantidadf()) + ","
        		+ ""+ variables.getTotal() + "," 
        		+ "'"+discoteca +  "',"
        		+ "'"+ sdf.format(date)+"')";
        boolean numero = false;
        try {
            
            if(conectar.ejecutar(sql)){
                numero = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar(controlador reservabebida): " + e);
            numero = true;
        }
        conectar.cerrar();
        return numero;
		
	}
	
	
public boolean insertarreserva(Usuario Reserva, String discoteca) {
		
	
	Date date = new Date();
	String DATE_FORMAT = "MM/dd/yyyy";
	SimpleDateFormat sdf =new SimpleDateFormat(DATE_FORMAT);
        Conexion conectar = new Conexion();
        BigInteger id = new BigInteger(Reserva.getId());
        String sql = "INSERT INTO reservas (nombre, cedula, personas, cumpleanos, correo, discoteca, fecha) VALUES ("
        		+ "'"+ Reserva.getNombre()+"',"
        		+ ""+ id +","
        		+ ""+ Integer.parseInt(Reserva.getPersonas())+","
        		+"'" + Reserva.getCumpleaños() + "',"
        		+ "'"+ Reserva.getCorreo() +"'," 
        		+ "'" + discoteca + "'," 
        		+ "'" + sdf.format(date) + "')";
        boolean numero = false;
        try {
            
            if(conectar.ejecutar(sql)){
                numero = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar(controlador +" + discoteca + "): " + e);
            numero = true;
        }
        conectar.cerrar();
        return numero;
		
	}
	
	public boolean ingresoreserva(JTable tabla, String discoteca) {
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yyyy";
		SimpleDateFormat sdf =new SimpleDateFormat(DATE_FORMAT);
        Conexion conectar = new Conexion();
    	String sql = "SELECT * FROM reservas WHERE discoteca = '"+ discoteca+ "' AND fecha = '"+sdf.format(date)+"'" ;
    	 ResultSet rs;
		DefaultTableModel model = new DefaultTableModel();
	
		model.addColumn("ID");
		model.addColumn("NOMBRE");
		model.addColumn("CEDULA");
		model.addColumn("PERSONAS");
		model.addColumn("¿CUMPLEAÑOS?");
		model.addColumn("CORREO");
		model.addColumn("DISCOTECA");
		model.addColumn("FECHA");
		
		tabla.setModel(model);
		
		String[] dato = new String[8];
		
       
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            while (rs.next()){
               
            	dato[0] = rs.getString(1);
            	dato[1] = rs.getString(2);
            	dato[2] = rs.getString(3);
            	dato[3] = rs.getString(4);
            	dato[4] = rs.getString(5);
            	dato[5] = rs.getString(6);
            	dato[6] = rs.getString(7);
            	dato[7] = rs.getString(8);
            	model.addRow(dato);
                numero = true;
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador " + discoteca + "): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	public boolean ReservaPorfecha(JTable tabla, String discoteca, String dia, String mes, String año) {
        Conexion conectar = new Conexion();
    	String sql = "SELECT * FROM reservas WHERE discoteca = '"+ discoteca+ "' AND fecha = '"+mes+"/"+dia+"/"+año+"'" ;
    	 ResultSet rs;
		DefaultTableModel model = new DefaultTableModel();
	
		model.addColumn("ID");
		model.addColumn("NOMBRE");
		model.addColumn("CEDULA");
		model.addColumn("PERSONAS");
		model.addColumn("¿CUMPLEAÑOS?");
		model.addColumn("CORREO");
		model.addColumn("DISCOTECA");
		model.addColumn("FECHA");
		
		tabla.setModel(model);
		
		String[] dato = new String[8];
		
       
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            while (rs.next()){
               
            	dato[0] = rs.getString(1);
            	dato[1] = rs.getString(2);
            	dato[2] = rs.getString(3);
            	dato[3] = rs.getString(4);
            	dato[4] = rs.getString(5);
            	dato[5] = rs.getString(6);
            	dato[6] = rs.getString(7);
            	dato[7] = rs.getString(8);
            	model.addRow(dato);
                numero = true;
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador " + discoteca + "): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	public boolean tablabebidas(JTable tabla, String discoteca) {
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yyyy";
		SimpleDateFormat sdf =new SimpleDateFormat(DATE_FORMAT);
        Conexion conectar = new Conexion();
    	String sql = "SELECT * FROM reservabebida WHERE discoteca = '"+ discoteca +"' AND fecha= '" + sdf.format(date)+ "'";
    	 ResultSet rs;
		DefaultTableModel model = new DefaultTableModel();
	
		model.addColumn("ID");
		model.addColumn("CEDULA");
		model.addColumn("CERVEZA");
		model.addColumn("CANTIDADC");
		model.addColumn("GUARO");
		model.addColumn("CANTIDADG");
		model.addColumn("FINO");
		model.addColumn("CANTIDADF");
		model.addColumn("TOTAL");
		model.addColumn("DISCOTECA");
		model.addColumn("FECHA");
		
		
		tabla.setModel(model);
		
		String[] dato = new String[11];
		
       
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            while (rs.next()){
               
            	dato[0] = rs.getString(1);
            	dato[1] = rs.getString(2);
            	dato[2] = rs.getString(3);
            	dato[3] = rs.getString(4);
            	dato[4] = rs.getString(5);
            	dato[5] = rs.getString(6);
            	dato[6] = rs.getString(7);
            	dato[7] = rs.getString(8);
            	dato[8] = rs.getString(9);
            	dato[9] = rs.getString(10);
            	dato[10] = rs.getString(11);
            	model.addRow(dato);
                numero = true;
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador " + discoteca + "): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	public boolean BebidasPorFecha(JTable tabla, String discoteca, String dia, String mes, String año) {
        Conexion conectar = new Conexion();
    	String sql = "SELECT * FROM reservabebida WHERE discoteca = '"+ discoteca +"' AND fecha= '" +mes+"/"+dia+"/"+año+ "'";
    	 ResultSet rs;
		DefaultTableModel model = new DefaultTableModel();
	
		model.addColumn("ID");
		model.addColumn("CEDULA");
		model.addColumn("CERVEZA");
		model.addColumn("CANTIDADC");
		model.addColumn("GUARO");
		model.addColumn("CANTIDADG");
		model.addColumn("FINO");
		model.addColumn("CANTIDADF");
		model.addColumn("TOTAL");
		model.addColumn("DISCOTECA");
		model.addColumn("FECHA");
		
		
		tabla.setModel(model);
		
		String[] dato = new String[11];
		
       
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            while (rs.next()){
               
            	dato[0] = rs.getString(1);
            	dato[1] = rs.getString(2);
            	dato[2] = rs.getString(3);
            	dato[3] = rs.getString(4);
            	dato[4] = rs.getString(5);
            	dato[5] = rs.getString(6);
            	dato[6] = rs.getString(7);
            	dato[7] = rs.getString(8);
            	dato[8] = rs.getString(9);
            	dato[9] = rs.getString(10);
            	dato[10] = rs.getString(11);
            	model.addRow(dato);
                numero = true;
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador " + discoteca + "): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	public boolean tablausuario(JTable tabla) {
        Conexion conectar = new Conexion();
    	String sql = "SELECT * FROM user";
    	 ResultSet rs;
		DefaultTableModel model = new DefaultTableModel();
	
		model.addColumn("NOMBRE");
		model.addColumn("CORREO");
		model.addColumn("ID");
		
		tabla.setModel(model);
		
		String[] dato = new String[4];
		
       
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            while (rs.next()){
               
            	dato[0] = rs.getString(1);
            	dato[1] = rs.getString(2);
            	dato[2] = rs.getString(4);
            	model.addRow(dato);
                numero = true;
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	public boolean limitereservas(Usuario Reserva, String discoteca) {
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yyyy";
		SimpleDateFormat sdf =new SimpleDateFormat(DATE_FORMAT);
        Conexion conectar = new Conexion();
        String sql = "SELECT * FROM reservas WHERE discoteca = '"+ discoteca +"' AND fecha= '"+sdf.format(date)+"'";
        ResultSet rs;
        int reservas = 0;
        boolean numero = false;
        try {
        	numero = true;
            rs = conectar.consultar(sql);
            while(rs.next()){
            	reservas = reservas + 1;
            	System.out.println(reservas);
            	numero = true;
            	if(reservas > 19) {
            		numero = false;
            	}
            
        }
        }catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	public boolean mirarcedula(String cedula, String discoteca) {
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yyyy";
		SimpleDateFormat sdf =new SimpleDateFormat(DATE_FORMAT);
        Conexion conectar = new Conexion();
        String sql = "SELECT * FROM reservas WHERE cedula =" + cedula + " AND discoteca = '"+ discoteca +"'" + " AND fecha = '"+ sdf.format(date) +"'";
        ResultSet rs;
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            if(rs.next()){
                numero = true;
            }
            else {
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	public boolean InsertarAdmin(Usuario admin) {
		
		
        Conexion conectar = new Conexion();
        String sql = "INSERT INTO user (nombre, correo, contraseña) VALUES ("
        		+ "'"+ admin.getNombre() +"',"
        		+ "'"+ admin.getCorreo() +"',"
        		+ "'"+ admin.getContraseña() +"')";
        boolean numero = false;
        try {
            
            if(conectar.ejecutar(sql)){
                numero = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar(controlador + user ): " + e);
            numero = true;
        }
        conectar.cerrar();
        return numero;
		
	}
	
	public boolean ingresoAdmmin(Usuario Loguear) {
		String pass = (Loguear.getContraseña());
        Conexion conectar = new Conexion();
        String sql = "SELECT * FROM user WHERE correo = '" + Loguear.getCorreo()+ "' AND contraseña = '"+pass+"'";
        ResultSet rs;
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            if(rs.next()){
                numero = true;
                new Session(Loguear);
            }
            else {
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
	
	
	public boolean reserva(Usuario Loguear, String discoteca) {
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yyyy";
		SimpleDateFormat sdf =new SimpleDateFormat(DATE_FORMAT);
        Conexion conectar = new Conexion();
        String sql = "SELECT * FROM reservas WHERE cedula =" + Loguear.getId() +" AND fecha='"+ sdf.format(date)+"' AND discoteca= '"+ discoteca+"'" ;
        ResultSet rs;
        boolean numero = false;
        try {
            rs = conectar.consultar(sql);
            if(rs.next()){
                numero = true;
                new Session(Loguear);
            }
            else {
            }
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador reservas): " + e);
        }
        conectar.cerrar();
        return numero;
    }
	
public int EliminarUsuario(Usuario Loguear) {
		
        Conexion conectar = new Conexion();
        String sql = "DELETE FROM user WHERE `user`.`id` ="+ Loguear.getId() +"";
        int rs = 0;
        try {
            PS = conectar.getConnection().prepareStatement(sql);
            rs = PS.executeUpdate();
            
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }finally {
        	PS = null;
        	conectar.cerrar();
		}
        
        return rs;
    }
public int editarUsuario(Usuario Loguear) {
		
        Conexion conectar = new Conexion();
        String sql = "UPDATE `user` SET `nombre` = '"+ Loguear.getNombre()+"', `correo` = '"+ Loguear.getCorreo() +"', `contraseña` = '"+ Loguear.getContraseña()+
        		"' WHERE `user`.`id` ="+ Loguear.getId()+"";
        int rs = 0;
        try {
            PS = conectar.getConnection().prepareStatement(sql);
            rs = PS.executeUpdate();
            
        } catch (Exception e) {
       System.out.println("Error en comparar clave(controlador user): " + e);
        }finally {
        	PS = null;
        	conectar.cerrar();
		}
        
        return rs;
    }

public int editarContraseña(Usuario Loguear) {
	
    Conexion conectar = new Conexion();
    String sql = "UPDATE `user` SET `contraseña` = '"+ Loguear.getCorreo() +"' WHERE `user`.`id` ="+ Loguear.getId()+"";
    int rs = 0;
    try {
        PS = conectar.getConnection().prepareStatement(sql);
        rs = PS.executeUpdate();
        
    } catch (Exception e) {
   System.out.println("Error en comparar clave(controlador user): " + e);
    }finally {
    	PS = null;
    	conectar.cerrar();
	}
    
    return rs;
}


	
	
}
	

