/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.PreparedStatement;
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

    public boolean Autenticacion(String user, String pass) throws SQLException {

        Statement st = conn.createStatement();
        ResultSet rs = null;
        String consulta = "Select * from cliente";
        rs = st.executeQuery(consulta);

        while (rs.next()) {
            if (user.equals(rs.getString("correo")) && pass.equals(rs.getString("pass"))) {
                return true;
            }
        }

        return false;
    }

    public String Autenticacion2(String user, String pass) throws SQLException {

        Statement st = conn.createStatement();
        ResultSet rs = null;
        String consulta = "Select * from cliente";
        rs = st.executeQuery(consulta);
        String administrador = "1";
        String cliente = "2";

        String c = "0";

        while (rs.next()) {
            if (user.equals(rs.getString("correo")) && pass.equals(rs.getString("pass"))) {
                if (administrador.equals(rs.getString("tipocliente"))) {
                    c = "1";
                } else if (cliente.equals(rs.getString("tipocliente"))) {
                    c = "2";
                }
            }
        }

        return c;
    }

    public List listarcliente() {

        ArrayList<cliente> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
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

    public boolean agregarCliente(cliente c) {
        PreparedStatement ps;
        try {
            String consulta = "INSERT INTO VentaLociones.cliente (idcliente, tipodoc, numerodoc, "
                    + "primernombre, segundonombre, primerapellido,segundoapellido, correo, telefono, nomempresa, direccion, codpostal, "
                    + "ciudad, departamento, pais, pass, tipocliente) VALUES ('"
                    + c.getIdcliente() + "','" + c.getTipodoc() + "','" + c.getNumerodoc() + "','" + c.getPrimernombre() + "','"
                    + c.getSegundonombre() + "','" + c.getPrimerapellido() + "','" + c.getSegundoapellido() + "','" + c.getCorreo() + "','" + c.getTelefono() + "','" + c.getNomempresa() + "','"
                    + c.getDireccion() + "','" + c.getCodpostal() + "','" + c.getCiudad() + "','" + c.getDepartamento() + "','"
                    + c.getPais() + "','" + c.getPass() + "','" + c.getTipocliente() + "')";

            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            ex.toString();
            return false;
        }
        return true;
    }

    public cliente list(String idcliente) {
        cliente c = new cliente();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT * FROM VentaLociones.cliente where idcliente ='" + idcliente + "'";
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                c.setIdcliente(rs.getString("idcliente"));
                c.setTipodoc(rs.getString("tipodoc"));
                c.setNumerodoc(rs.getString("numerodoc"));
                c.setPrimernombre(rs.getString("primernombre"));
                c.setSegundonombre(rs.getString("segundonombre"));
                c.setPrimerapellido(rs.getString("primerapellido"));
                c.setCorreo(rs.getString("correo"));
                c.setTelefono(rs.getString("telefono"));

            }
        } catch (Exception e) {
        }
        return c;
    }

    public boolean edit(cliente c) {
        PreparedStatement ps;

        //String sql="update persona set DNI='"+per.getDni()+"',Nombres='"+per.getNom()+"'where Id="+per.getId();
        String consulta = "UPDATE `VentaLociones`.`cliente` SET `idcliente` = ' "
                + c.getIdcliente() + "', `tipodoc` = '" + c.getTipodoc() + "', `numerodoc` = '"
                + c.getNumerodoc() + "', `primernombre` = '" + c.getPrimernombre() + "', `segundonombre` = '"
                + c.getSegundonombre() + "', `primerapellido` = '" + c.getPrimerapellido() + "', `correo` = '"
                + c.getCorreo() + "', `telefono` = '" + c.getTelefono() + "'WHERE (`idcliente` = '"
                + c.getIdcliente() + "')";

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public boolean eliminar(String idcliente) {
        PreparedStatement ps;
        String consulta = "DELETE FROM `VentaLociones`.`cliente` where idcliente=" + idcliente;

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public List listarproveedor() {

        ArrayList<proveedor> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "Select * from proveedor";
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                proveedor p = new proveedor();

                p.setIdproveedor(rs.getString("idproveedor"));
                p.setNombre(rs.getString("nombre"));
                p.setDireccion(rs.getString("direccion"));
                p.setCiudad(rs.getString("ciudad"));
                p.setCodpostal(rs.getString("codpostal"));
                p.setProvincia(rs.getString("provincia"));
                p.setPais(rs.getString("pais"));
                p.setNumtel(rs.getString("numtel"));
                p.setNumfax(rs.getString("numfax"));
                p.setCorreo(rs.getString("correo"));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public proveedor listp(String idproveedor) {
        proveedor p = new proveedor();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT * FROM VentaLociones.proveedor where idproveedor ='" + idproveedor + "'";
            rs = st.executeQuery(consulta);
            while (rs.next()) {

                p.setIdproveedor(rs.getString("idproveedor"));
                p.setNombre(rs.getString("nombre"));
                p.setDireccion(rs.getString("direccion"));
                p.setCiudad(rs.getString("ciudad"));
                p.setCodpostal(rs.getString("codpostal"));
                p.setProvincia(rs.getString("provincia"));
                p.setPais(rs.getString("pais"));
                p.setNumtel(rs.getString("numtel"));
                p.setNumfax(rs.getString("numfax"));
                p.setCorreo(rs.getString("correo"));

            }
        } catch (Exception e) {
        }
        return p;
    }

    public boolean editp(proveedor p) {
        PreparedStatement ps;

        String consulta = "UPDATE `VentaLociones`.`proveedor` SET `idproveedor` = ' "
                + p.getIdproveedor() + "', `nombre` = '" + p.getNombre() + "', `direccion` = '"
                + p.getDireccion() + "', `ciudad` = '" + p.getCiudad() + "', `codpostal` = '"
                + p.getCodpostal() + "', `provincia` = '" + p.getProvincia() + "', `pais` = '"
                + p.getPais() + "', `numtel` = '" + p.getNumtel() + "', `numfax` = '"
                + p.getNumfax() + "', `correo` = '" + p.getCorreo() + "'WHERE (`idproveedor` = '"
                + p.getIdproveedor() + "')";

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public boolean agregarproveedor(proveedor p) {
        PreparedStatement ps;
        try {
            String consulta = "INSERT INTO VentaLociones.proveedor (idproveedor, nombre, direccion, "
                    + "ciudad, codpostal, provincia, pais, numtel, numfax, correo ) VALUES ('"
                    + p.getIdproveedor() + "','" + p.getNombre() + "','" + p.getDireccion() + "','" + p.getCiudad() + "','"
                    + p.getCodpostal() + "','" + p.getProvincia() + "','" + p.getPais() + "','" + p.getNumtel() + "','" + p.getNumfax() + "','" 
                    + p.getCorreo() + "')";

            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            ex.toString();
            return false;
        }
        return true;
    }

    public boolean eliminarp(String idproveedor) {
        PreparedStatement ps;
        String consulta = "DELETE FROM `VentaLociones`.`proveedor` where idproveedor=" + idproveedor;

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
