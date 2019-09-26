/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan
 */
public class Consultas extends Conexion {

    public boolean Autenticacion(String user, String pass) throws SQLException{


        Statement st=conn.createStatement();
        ResultSet rs = null;
        String consulta = "Select * from Usuarios";
        rs = st.executeQuery(consulta);

        
            while (rs.next()) {
                if (user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contrasena"))) {
                    return true;
                }
            }

        return false;
    }
   
}
