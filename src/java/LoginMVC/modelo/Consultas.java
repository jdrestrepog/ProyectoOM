 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletResponse;

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
                cliente.setDireccion(rs.getString("direccion"));
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
            String consulta = "INSERT INTO ventas.cliente (idcliente, tipodoc, numerodoc, "
                    + "primernombre, segundonombre, primerapellido,segundoapellido, correo, telefono, direccion, "
                    + "ciudad, departamento, pais, pass, tipocliente) VALUES ('"
                    + c.getIdcliente() + "','" + c.getTipodoc() + "','" + c.getNumerodoc() + "','" + c.getPrimernombre() + "','"
                    + c.getSegundonombre() + "','" + c.getPrimerapellido() + "','" + c.getSegundoapellido() + "','" + c.getCorreo() + "','" + c.getTelefono() + "','"
                    + c.getDireccion() + "','" + c.getCiudad() + "','" + c.getDepartamento() + "','"
                    + c.getPais() + "','" + c.getPass() + "','" + c.getTipocliente() + "');";

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
            String consulta = "SELECT * FROM ventas.cliente where idcliente ='" + idcliente + "'";
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

    public cliente listuser(String user) {
        cliente c = new cliente();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT * FROM ventas.cliente where correo ='" + user + "';";
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
                c.setDireccion(rs.getString("direccion"));

            }
        } catch (Exception e) {
        }
        return c;
    }

    public boolean edit(cliente c) {
        PreparedStatement ps;

        //String sql="update persona set DNI='"+per.getDni()+"',Nombres='"+per.getNom()+"'where Id="+per.getId();
        String consulta = "UPDATE `ventas`.`cliente` SET `idcliente` = ' "
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
        String consulta = "DELETE FROM `ventas`.`cliente` where idcliente=" + idcliente;

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
            String consulta = "SELECT * FROM ventas.proveedor where idproveedor ='" + idproveedor + "'";
            rs = st.executeQuery(consulta);
            while (rs.next()) {

                p.setIdproveedor(rs.getString("idproveedor"));
                p.setNombre(rs.getString("nombre"));
                p.setDireccion(rs.getString("direccion"));
                p.setCiudad(rs.getString("ciudad"));
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

        String consulta = "UPDATE `ventas`.`proveedor` SET `idproveedor` = ' "
                + p.getIdproveedor() + "', `nombre` = '" + p.getNombre() + "', `direccion` = '"
                + p.getDireccion() + "', `ciudad` = '" + p.getCiudad() + "', `provincia` = '" + p.getProvincia() + "', `pais` = '"
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
            String consulta = "INSERT INTO ventas.proveedor (idproveedor, nombre, direccion, "
                    + "ciudad, provincia, pais, numtel, numfax, correo ) VALUES ('"
                    + p.getIdproveedor() + "','" + p.getNombre() + "','" + p.getDireccion() + "','" + p.getCiudad() + "','"
                    + p.getProvincia() + "','" + p.getPais() + "','" + p.getNumtel() + "','" + p.getNumfax() + "','"
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

    public boolean agregarproducto(producto p) {
        PreparedStatement ps;
        try {
            String consulta = "INSERT INTO ventas.producto (idproducto, marca, nombre, "
                    + "referencia, descripcion, preciocomp, precioventa, "
                    + "oferta ) VALUES ('"
                    + p.getIdproducto() + "','" + p.getMarca() + "','" + p.getNombre() + "','" + p.getReferencia() + "','"
                    + p.getDescripcion() + "','" 
                    + p.getPreciocomp() + "','" + p.getPrecioventa() + "','" + p.getOferta() + "');";

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
        String consulta = "DELETE FROM `ventas`.`proveedor` where idproveedor=" + idproveedor;

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public List listarproducto() {

        ArrayList<producto> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "Select * from producto";
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                producto prod = new producto();

                prod.setIdproducto(rs.getString("idproducto"));
                prod.setMarca(rs.getString("marca"));
                prod.setNombre(rs.getString("nombre"));
                prod.setReferencia(rs.getString("referencia"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPreciocomp(rs.getFloat("preciocomp"));
                prod.setPrecioventa(rs.getFloat("precioventa"));
                prod.setOferta(rs.getString("oferta"));

                list.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List listarproductooferta() {

        ArrayList<producto> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT * FROM ventas.producto where oferta = 'si';";
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                producto prod = new producto();

                prod.setIdproducto(rs.getString("idproducto"));
                prod.setMarca(rs.getString("marca"));
                prod.setNombre(rs.getString("nombre"));
                prod.setReferencia(rs.getString("referencia"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPreciocomp(rs.getFloat("preciocomp"));
                prod.setPrecioventa(rs.getFloat("precioventa"));
                prod.setOferta(rs.getString("oferta"));

                list.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean eliminarprod(String idproducto) {
        PreparedStatement ps;
        String consulta = "DELETE FROM `ventas`.`producto` where idproducto=" + idproducto;

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public producto listprod(String idproducto) {
        producto p = new producto();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT * FROM ventas.producto where idproducto ='" + idproducto + "'";
            rs = st.executeQuery(consulta);
            while (rs.next()) {

                p.setIdproducto(rs.getString("idproducto"));
                p.setMarca(rs.getString("marca"));
                p.setNombre(rs.getString("nombre"));
                p.setReferencia(rs.getString("referencia"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPreciocomp(rs.getFloat("preciocomp"));
                p.setPrecioventa(rs.getFloat("precioventa"));
                p.setOferta(rs.getString("oferta"));

            }
        } catch (Exception e) {
        }
        return p;
    }

    public boolean editprod(producto p) {
        PreparedStatement ps;

        String consulta = "UPDATE `ventas`.`producto` SET `idproducto` = '"
                + p.getIdproducto() + "', `marca` = '" + p.getMarca() + "', `nombre` = '"
                + p.getNombre() + "', `referencia` = '" + p.getReferencia() + "', `descripcion` = '"
                + p.getDescripcion() + "', `preciocomp` = '" + p.getPreciocomp() + "', `precioventa` = '"
                + p.getPrecioventa() + "', `oferta` = '" + p.getOferta() + "' WHERE (`idproducto` = '"
                + p.getIdproducto() + "');";

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public List listarinventario() {

        ArrayList<inventario> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "Select * from productoprov";
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                inventario p = new inventario();

                p.setIdproducto(rs.getString("idproducto"));
                p.setIdproveedor(rs.getString("idproveedor"));
                int cantidad = Integer.parseInt(rs.getString("cantidad"));
                p.setCantidad(cantidad);
                //p.setCantidad(Integer.parseInt(rs.getString("cantidad")));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void listarimg(String idproducto, HttpServletResponse response) {

        producto p = new producto();
        InputStream inputStream = null;
        OutputStream outputStream = null;

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            outputStream = response.getOutputStream();

            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT * FROM ventas.producto where idproducto ='" + idproducto + "'";
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                inputStream = rs.getBinaryStream("foto1");
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;

            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }

        } catch (Exception e) {
        }
    }

    public boolean agregarinv(inventario inv) {
        PreparedStatement ps;
        try {
            String consulta = "INSERT INTO ventas.productoprov (idproducto, idproveedor, cantidad"
                    + " ) VALUES ('"
                    + inv.getIdproducto() + "','" + inv.getIdproveedor() + "','" + inv.getCantidad() + "');";

            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            ex.toString();
            return false;
        }
        return true;
    }

    public boolean agregarcompra(String idcliente, String fecha) {
        PreparedStatement ps;
        try {
            String consulta = "INSERT INTO `ventas`.`compra` (`idcliente`, `fecha`)"
                    + " VALUES ('"+ idcliente + "','" + fecha + "');";

            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            ex.toString();
            return false;
        }
        return true;
    }
    public boolean agregarcompraprod(String idproducto, String idcliente, int idcompra, String candidad) {
        PreparedStatement ps;
        try {
            String consulta = "INSERT INTO `ventas`.`compraprod` (`idproducto`, `idcliente`, `idcompra`, `cantidad`)"
                    + " VALUES ('"+ idproducto + "','" + idcliente + "','"+ idcompra + "','"+ candidad + "');";

            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            ex.toString();
            return false;
        }
        return true;
    }
    public inventario listinv(String idproducto) {
        inventario inv = new inventario();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT * FROM ventas.productoprov where idproducto ='" + idproducto + "'";
            rs = st.executeQuery(consulta);
            while (rs.next()) {

                inv.setIdproducto(rs.getString("idproducto"));
                inv.setIdproveedor(rs.getString("idproveedor"));
                inv.setCantidad(Integer.parseInt(rs.getString("cantidad")));

            }
        } catch (Exception e) {
        }
        return inv;
    }

    public String last_insert() {
        inventario inv = new inventario();
        String lastid="";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta = "SELECT LAST_INSERT_ID() as last_id;";
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                lastid = rs.getString("last_id");

            }
        } catch (Exception e) {
        }
        return lastid;
    }
    public List listarcompras(String fecha) {
        ArrayList<compra> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String consulta
                    = "SELECT \n"
                    + "a.idcompra, \n"
                    + "a.idcliente, \n"
                    + "a.fecha, \n"
                    + "b.idproducto,\n"
                    + "b.cantidad\n"
                    + "FROM\n"
                    + "compra a\n"
                    + "INNER JOIN compraprod b \n"
                    + "ON a.idcompra = b.idcompra\n"
                    + "WHERE CAST(fecha AS DATE) >='" + fecha + "';";

            rs = st.executeQuery(consulta);

            while (rs.next()) {
                compra c = new compra();
                c.setIdcompra(rs.getString("idcompra"));
                c.setIdcliente(rs.getString("idcliente"));
                c.setFecha(rs.getString("fecha"));
                c.setIdproducto(rs.getString("idproducto"));
                c.setCantidad(rs.getString("cantidad"));

                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean editinv(inventario inv) {
        PreparedStatement ps;

        String cantidad = Integer.toString(inv.getCantidad());

        String consulta = "UPDATE `ventas`.`productoprov` SET `cantidad` = '"
                + cantidad + "' WHERE (`idproducto` = '"
                + inv.getIdproducto() + "') and (`idproveedor` = '" + inv.getIdproveedor() + "');";

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return false;
    }

    public boolean eliminarinv(String idproducto, String idproveedor) {
        PreparedStatement ps;
        String consulta = "DELETE FROM `ventas`.`productoprov` WHERE (`idproducto` = '" + idproducto + "') and (`idproveedor` = '" + idproveedor + "');";

        try {
            ps = conn.prepareStatement(consulta);
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return false;
    }
}
