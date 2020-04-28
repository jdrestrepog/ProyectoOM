/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackro
 */
public class Conexion {

    public static final String USERNAME = "root";
    public static final String PASSWORD = "password12345678";
    //public static final String HOST = "127.0.0.1";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "ventas?autoReconnect=true&useSSL=false";
    //public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
    
    
    //public java.sql.Connection conn;
    public Connection conn;

    public Conexion(){
    
        try {
            try {
                Class.forName(CLASSNAME);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("====Error=====");
            System.out.println(""+e.toString());
        }
    }
}
