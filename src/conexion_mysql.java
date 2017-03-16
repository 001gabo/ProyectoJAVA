
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto
 */
public class conexion_mysql {
    
    private static Connection con;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="nVC3XJt2nmyF5Lxx";
    private static final String url="jdbc:mysql://localhost:3306/biblioteca";
     
    public static Connection getConnection(){
    con=null;
    try{
    Class.forName(driver);
    con=DriverManager.getConnection(url, user, pass);
    if(con!=null){
    System.out.print("conexion..");
    }
    }
    catch(Exception ex){
   System.out.print("Error"+ex);
    }
    return con;
    }
    
    
//    public Connection conectar(){
//    return con;
//    }
//    public void desconectar(){
//    con= null;
//    System.out.print("desconectado");
//    }
   
}
