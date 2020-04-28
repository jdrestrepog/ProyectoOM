/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Servlet;

import LoginMVC.modelo.Consultas;
import LoginMVC.modelo.cliente;
import LoginMVC.modelo.inventario;
import LoginMVC.modelo.producto;
import LoginMVC.modelo.proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.clienteDAO;

/**
 *
 * @author juan
 */
public class controladorcliente extends HttpServlet {

    String listar    = "listar.jsp";
    String listarinv = "listarinv.jsp";
    String add       = "add.jsp";
    String edit      = "edit.jsp";
    String editinv   = "editinv.jsp";

    String listarp = "listarp.jsp";
    String addp    = "addp.jsp";
    String editp   = "editp.jsp";

    String listarprod = "listarprod.jsp";
    String addprod    = "addprod.jsp";
    String addproΩd    = "addprod.jsp";
    String editprod   = "editprod.jsp";
    String menu       = "menu.jsp";
   
    String addinv          = "addinv.jsp";
    String reportecompras  = "reportecompras.jsp";
    String listaventas     = "listaventas.jsp";

    cliente      c = new cliente();
    clienteDAO dao = new clienteDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            
            String idcliente = request.getParameter("txtidcliente");
            String tipodoc = request.getParameter("txttipodoc");
            String numerodoc = request.getParameter("txtnumerodoc");
            String primernombre = request.getParameter("txtprimernombre");
            String segundonombre = request.getParameter("txtsegundonombre");
            String primerapellido = request.getParameter("txtprimerapellido");
            String segundoapellido = request.getParameter("txtsegundoapellido");
            String correo = request.getParameter("txtcorreo");
            String telefono = request.getParameter("txttelefono");
            String direccion = request.getParameter("txtdireccion");
            String ciudad = request.getParameter("txtciudad");
            String departamento = request.getParameter("txdepartamento");
            String pais = request.getParameter("txtpais");
            String pass = request.getParameter("txtpass");
            String tipocliente = request.getParameter("txttipocliente");

            c.setIdcliente(idcliente);
            c.setTipodoc(tipodoc);
            c.setNumerodoc(numerodoc);
            c.setPrimernombre(primernombre);
            c.setSegundonombre(segundonombre);
            c.setPrimerapellido(primerapellido);
            c.setSegundoapellido(segundoapellido);
            c.setCorreo(correo);
            c.setTelefono(telefono);
            c.setDireccion(direccion);
            c.setCiudad(ciudad);
            c.setDepartamento(departamento);
            c.setPais(pais);
            c.setTipocliente(tipocliente);
            c.setPass(pass);
            
            Consultas con = new Consultas();
            con.agregarCliente(c);
            

            acceso = listar;

        } else if (action.equalsIgnoreCase("Editar")) {
            request.setAttribute("id", request.getParameter("id"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("Actualizar")) {

            String idcliente = request.getParameter("txtidcliente");
            String tipodoc = request.getParameter("txttipodoc");
            String numerodoc = request.getParameter("txtnumerodoc");
            String primernombre = request.getParameter("txtprimernombre");
            String segundonombre = request.getParameter("txtsegundonombre");
            String primerapellido = request.getParameter("txtprimerapellido");
            String correo = request.getParameter("txtcorreo");
            String telefono = request.getParameter("txttelefono");
            String direccion = request.getParameter("txtdireccion");
            String ciudad = request.getParameter("txtciudad");
            String departamento = request.getParameter("txdepartamento");
            String pais = request.getParameter("txtpais");
            String pass = request.getParameter("txtpass");

            c.setIdcliente(idcliente);
            c.setTipodoc(tipodoc);
            c.setNumerodoc(numerodoc);
            c.setPrimernombre(primernombre);
            c.setSegundonombre(segundonombre);
            c.setPrimerapellido(primerapellido);
            c.setCorreo(correo);
            c.setTelefono(telefono);
            c.setDireccion(direccion);
            c.setCiudad(ciudad);
            c.setDepartamento(departamento);
            c.setPais(pais);
            c.setPass(pass);

            dao.edit(c);

            acceso = listar;
        } else if (action.equalsIgnoreCase("Eliminar")) {
            String id = request.getParameter("id");
            c.setIdcliente(id);
            dao.eliminar(id);
            acceso = listar;
        } else if (action.equalsIgnoreCase("addp")) {
            acceso = addp;
        } else if (action.equalsIgnoreCase("listarp")) {
            acceso = listarp;
        } else if (action.equalsIgnoreCase("Editarp")) {
            request.setAttribute("idp", request.getParameter("idp"));
            acceso = editp;
        } else if (action.equalsIgnoreCase("Actualizarp")) {
            proveedor p = new proveedor();
            Consultas con = new Consultas();

            String idproveedor = request.getParameter("txtidproveedor");
            String nombreproveedor = request.getParameter("txtnombreproveedor");
            String direccion = request.getParameter("txtdireccion");
            String ciudad = request.getParameter("txtciudad");
            String provincia = request.getParameter("txtprovincia");
            String pais = request.getParameter("txtpais");
            String telefono = request.getParameter("txttelefono");
            String fax = request.getParameter("txtfax");
            String correo = request.getParameter("txtcorreo");

            p.setIdproveedor(idproveedor);
            p.setNombre(nombreproveedor);
            p.setDireccion(direccion);
            p.setCiudad(ciudad);
            p.setProvincia(provincia);
            p.setPais(pais);
            p.setNumtel(telefono);
            p.setNumfax(fax);
            p.setCorreo(correo);

            con.editp(p);

            acceso = listarp;
        } else if (action.equalsIgnoreCase("agregarp")) {
            proveedor p = new proveedor();
            Consultas con = new Consultas();

            String idproveedor = request.getParameter("txtidproveedor");
            String nombreproveedor = request.getParameter("txtnombre");
            String direccion = request.getParameter("txtdireccion");
            String ciudad = request.getParameter("txtciudad");
            String provincia = request.getParameter("txtprovincia");
            String pais = request.getParameter("txtpais");
            String telefono = request.getParameter("txttelefono");
            String fax = request.getParameter("txtnumfax");
            String correo = request.getParameter("txtcorreo");

            p.setIdproveedor(idproveedor);
            p.setNombre(nombreproveedor);
            p.setDireccion(direccion);
            p.setCiudad(ciudad);
            p.setProvincia(provincia);
            p.setPais(pais);
            p.setNumtel(telefono);
            p.setNumfax(fax);
            p.setCorreo(correo);

            con.agregarproveedor(p);

            acceso = listarp;
        } else if (action.equalsIgnoreCase("Eliminarp")) {
            String id = request.getParameter("idp");
            Consultas con = new Consultas();

            proveedor p = new proveedor();
            p.setIdproveedor(id);

            con.eliminarp(id);

            acceso = listarp;
        } else if (action.equalsIgnoreCase("listarprod")) {
            acceso = listarprod;
        } else if (action.equalsIgnoreCase("addprod")) {
            acceso = addprod;
        } else if (action.equalsIgnoreCase("agregarprod")) {

            producto prod = new producto();
            Consultas con = new Consultas();

            String idproducto = request.getParameter("txtidproducto");
            String marca = request.getParameter("txtmarca");
            String nombre = request.getParameter("txtnombre");
            String referencia = request.getParameter("txtreferencia");
            String descripcion = request.getParameter("txtdescripcion");
            String preciocompra = request.getParameter("txtpreciocompra");
            String precioventa = request.getParameter("txtprecioventa");
            String oferta = request.getParameter("txtoferta");

            prod.setIdproducto(idproducto);
            prod.setMarca(marca);
            prod.setNombre(nombre);
            prod.setReferencia(referencia);
            prod.setDescripcion(descripcion);
            prod.setPreciocomp(Float.parseFloat(preciocompra));
            prod.setPrecioventa(Float.parseFloat(precioventa));
            prod.setOferta(oferta);

            con.agregarproducto(prod);

            acceso = listarprod;
        } else if (action.equalsIgnoreCase("Eliminarprod")) {
            String id = request.getParameter("idprod");
            Consultas con = new Consultas();

            producto p = new producto();

            p.setIdproducto(id);

            con.eliminarprod(id);

            acceso = listarprod;
        } else if (action.equalsIgnoreCase("Actualizarprod")) {
            
            producto p = new producto();
            Consultas con = new Consultas();

            String idproducto      = request.getParameter("txtidproducto");
            String marca           = request.getParameter("txtmarca");
            String nombre          = request.getParameter("txtnombre");
            String referencia      = request.getParameter("txtreferencia");
            String descripcion     = request.getParameter("txtdescripcion");
            String preciocompra    = request.getParameter("txtpreciocompra");
            String precioventa     = request.getParameter("txtprecioventa");
            String oferta          = request.getParameter("txtoferta");

            p.setIdproducto(idproducto);
            p.setMarca(marca);
            p.setNombre(nombre);
            p.setReferencia(referencia);
            p.setDescripcion(descripcion);
            p.setPreciocomp(Float.parseFloat(preciocompra));
            p.setPrecioventa(Float.parseFloat(precioventa));
            p.setOferta(oferta);
            
            con.editprod(p);

            acceso = listarprod;
        }else if (action.equalsIgnoreCase("Editarprod")) {
            request.setAttribute("idprod", request.getParameter("idprod"));
            acceso = editprod;
        }
        else if (action.equalsIgnoreCase("listarinv")) {
            acceso = listarinv;
        }
        else if (action.equalsIgnoreCase("volverinventario")) {
            acceso = menu;
        }
        else if (action.equalsIgnoreCase("addinv")) {
            acceso = addinv;
        }else if (action.equalsIgnoreCase("agregarinv")) {

            inventario inv      = new inventario();
            Consultas con       = new Consultas();
            String idproducto   = request.getParameter("txtidproducto");
            String idproveedor  = request.getParameter("txtidproveedor");
            int    cantidad     = Integer.parseInt(request.getParameter("txtcantidad"));
            
            inv.setIdproducto(idproducto);
            inv.setIdproveedor(idproveedor);
            inv.setCantidad(cantidad);
            
            con.agregarinv(inv);

            acceso = listarinv;
        }else if (action.equalsIgnoreCase("Editarinv")) {
            request.setAttribute("idinv", request.getParameter("idinv"));
            acceso = editinv;
        }else if (action.equalsIgnoreCase("Actualizarinv")) {
            inventario inv = new inventario();   
            Consultas  con = new Consultas();

            String idproducto   = request.getParameter("txtidproducto");
            String idproveedor  = request.getParameter("txtnombreproveedor");
            int cantidad        = Integer.parseInt(request.getParameter("txtcantidad"));
            
            inv.setIdproducto(idproducto);
            inv.setIdproveedor(idproveedor);
            inv.setCantidad(cantidad);
       
            con.editinv(inv);

            acceso = listarinv;
        }else if (action.equalsIgnoreCase("Eliminarinv")) {
            String id = request.getParameter("idinv");
    
            Consultas  con = new Consultas();
            inventario inv = new inventario();
            
            inv = con.listinv(id);

            con.eliminarinv(inv.getIdproducto(), inv.getIdproveedor());

            acceso = listarinv;
        } else if(action.equalsIgnoreCase("listarcompras")){
            acceso = reportecompras;
        }
        else if(action.equalsIgnoreCase("generar")){
            request.setAttribute("fechaini", request.getParameter("fechaini"));
            acceso = listaventas;     
        }
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        //response.sendRedirect(listar);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
