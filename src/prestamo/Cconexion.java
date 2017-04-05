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
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Cconexion {
    Connection con;
    
    public Cconexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
            con = conexion;
        }
        catch (Exception e) {
        }    
    }
    public Connection getconector()
    {
        return con;
    }
    public void set_prestamo(String id_user, int id_lib, String observacion, int dias_pres)
    {
        
        try {
            Date dt = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String prest_date = sdf.format(dt);
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(prest_date));
            c.add(Calendar.DATE, dias_pres);
            String prest_fechadev = sdf.format(c.getTime());
            String query = "INSERT INTO prestamo (prest_user, prest_date, prest_libro, prest_observaciones, prest_fechadev, estado) VALUES ('" + id_user + "', + '" + prest_date + "','" +id_lib + "','" + observacion + "','" + prest_fechadev + "', '4')";
            Statement sentencia = con.createStatement();
            System.out.println(query);
            sentencia.executeUpdate(query);
            sentencia.close();
            //modificando datos libro
            String query2 = "UPDATE libros SET lib_estado = 2 WHERE id_lib = " + id_lib;
            Statement sentencia2 = con.createStatement();
            System.out.println(query2);
            sentencia2.executeUpdate(query2);
            sentencia2.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public List<String> get_libro_info(int id_lib){
        List<String> datos = new ArrayList<String>();
        String query = "SELECT libros.*, categoria.cat_categorias, autor.aut_name, editoriales.ed_name from libros, categoria, autor, editoriales WHERE libros.id_lib = '" + id_lib + "' AND libros.lib_categoria = categoria.id_categoria AND libros.lib_autor = autor.id_autor AND libros.lib_editorial = editoriales.id_editorial";
        try {
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                datos.add(String.valueOf(resp.getInt("id_lib")));
                datos.add(resp.getString("lib_name"));
                datos.add(resp.getString("lib_descrip"));
                datos.add(resp.getString("aut_name"));
                datos.add(resp.getString("cat_categorias"));
                datos.add(resp.getString("lib_edicion"));
                datos.add(resp.getString("ed_name"));
                datos.add(String.valueOf(resp.getInt("lib_year")));
                datos.add(resp.getString("lib_codigo"));
                datos.add(resp.getString("lib_observacion"));
                datos.add(String.valueOf(resp.getInt("lib_estado")));
                datos.add(String.valueOf(resp.getInt("lib_diaspres")));
            }
        } catch (Exception e) {
        }
        return datos;
    }
    public int num_coin_buscar(String parametro, int opcion)
    {
        int numero = 0;
        String query = "";
        try{
            switch(opcion)
            {
                case 1:
                    query = "CALL count_coincidencias_busq_libros_nombre ('" + parametro + "')";
                    break;
                case 2:
                    query = "CALL count_coincidencias_busq_libros_autor ('" + parametro + "')";
                    break;
                case 3:
                    query = "CALL count_coincidencias_busq_libros_editorial ('" + parametro + "')";
                    break;
            }
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                numero = resp.getInt(1);
            }
            return numero;
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        return numero;
    }
    public List<List<String>> bucscarlibro(String parametro, int indice, int opcion)
    {
        List<List<String>> lista = new ArrayList<List<String>>();
        List<String> datos = new ArrayList<String>();
        try {
            String query = "";
            switch(opcion)
            {
                case 1:
                    query = "CALL buscar_libros_nombre ('" + parametro + "', '" + indice + "')";
                    break;
                case 2:
                    query = "CALL buscar_libros_autor ('" + parametro + "', '" + indice + "')";
                    break;
                case 3:
                    query = "CALL buscar_libros_editorial ('" + parametro + "', '" + indice + "')";
                    break;
            }
            int temporal;
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                temporal = resp.getInt("id_lib");
                datos = new ArrayList<String>();
                datos.add(Integer.toString(temporal));
                datos.add(resp.getString("lib_name"));
                datos.add(resp.getString("aut_name"));
                datos.add(resp.getString("ed_name"));
                //datos[4] = resp.getInt(5)
                lista.add(datos);
                //con.close();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return lista;
    }
    public String verificar_usuario(String carnet)
    {
        String resultado = "";
        String query = "CALL verificar_usuario ('" + carnet+ "')";
        try {
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                resultado = resp.getString("id_user");
                System.out.println("debuelto" + resultado);
                return resultado;
            }
        } catch (Exception e) {
        }
        return resultado;
    }
    public int get_numero_libros_iguales(String nombre)
    {
        int numero = 0;
        String query = "";
        try{
            query = "CALL count_num_libros ('" + nombre + "')";
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                numero = resp.getInt(1);
            }
            return numero;
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        return numero;
    }
}
