/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        //String consulta = "Select * from Usuarios";
        String consulta = "Select * from cliente";
        rs = st.executeQuery(consulta);

        
            while (rs.next()) {
                if (user.equals(rs.getString("correo")) && pass.equals(rs.getString("pass"))) {
                    return true;
                }
            }

        return false;
    }
    public List listarcliente(){
        
        ArrayList<cliente>list = new ArrayList<>();
        try {
            Statement st=conn.createStatement();
            ResultSet rs = null;
            String consulta = "Select * from cliente";
            rs = st.executeQuery(consulta);
            
            
            while (rs.next()) {
               cliente cliente = new cliente();
               cliente.setIdcliente(rs.getString("idcliente"));
               cliente.setTipodoc(rs.getString("tipodoc"));
               cliente.setNumerodoc(rs.getString("numerodoc"));
               cliente.setPrimernombre(rs.getString("primernombre"));
               cliente.setSegundonombre(rs.getString("segundonombre"));
               cliente.setPrimerapellido(rs.getString("primerapellido"));
               cliente.setCorreo(rs.getString("correo"));
               cliente.setTelefono(rs.getString("telefono"));
               cliente.setNomempresa(rs.getString("nomempresa"));
               cliente.setDireccion(rs.getString("direccion"));
               cliente.setCodpostal(rs.getString("codpostal"));
               cliente.setCiudad(rs.getString("ciudad"));
               cliente.setDepartamento(rs.getString("departamento"));
               cliente.setPais(rs.getString("pais"));
             
               
               list.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
