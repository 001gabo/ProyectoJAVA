/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author hugo
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Cconexion {
    Connection con;
    
    public Cconexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_authors","root","");
            con = conexion;
        }
        catch (Exception e) {
            
        }    
    }
    public Connection getconector()
    {
        return con;
    }
    public List<String[]> bucscarpornom(String nombre)
    {
        List<String[]> lista = new ArrayList<String[]>();
        String [] datos = new String[14];
        try {
            String query = "SELECT * from libros WHERE lib_name LIKE '%" + nombre + "%'";
            //datos[0] = query;
            //lista.add(datos);
            System.out.println(query);
            int temporal;
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                temporal = resp.getInt(1);
                datos[0] = Integer.toString(temporal);
                datos[1] = resp.getString(2);
                datos[2] = resp.getString(3);
                datos[3] = resp.getString(4);
             
                //datos[4] = resp.getInt(5)
                lista.add(datos);
                //con.close();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return lista;
    }
}
