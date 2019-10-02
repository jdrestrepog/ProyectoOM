/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.Servlet;

import LoginMVC.modelo.cliente;
import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
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

    String listar = "listar.jsp";
    String add = "add.jsp";
    String edit = "edit.jsp";
    cliente c = new cliente();
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
            String primerapellido = request.getParameter("txtprimerapellido");
            String correo = request.getParameter("txtcorreo");
            String telefono = request.getParameter("txttelefono");
            String nomempresa = request.getParameter("txtnomempresa");
            String direccion = request.getParameter("txtdireccion");
            String codpostal = request.getParameter("txtcodpostal");
            String ciudad = request.getParameter("txtciudad");
            String departamento = request.getParameter("txdepartamento");
            String pais = request.getParameter("txtpais");
            String pass = request.getParameter("txtpass");

            c.setIdcliente(idcliente);
            c.setTipodoc(tipodoc);
            c.setNumerodoc(numerodoc);
            c.setPrimernombre(primernombre);
            c.setPrimerapellido(primerapellido);
            c.setCorreo(correo);
            c.setTelefono(telefono);
            c.setNomempresa(nomempresa);
            c.setDireccion(direccion);
            c.setCodpostal(codpostal);
            c.setCiudad(ciudad);
            c.setDepartamento(departamento);
            c.setPais(pais);
            c.setPass(pass);

            dao.add(c);

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
            String nomempresa = request.getParameter("txtnomempresa");
            String direccion = request.getParameter("txtdireccion");
            String codpostal = request.getParameter("txtcodpostal");
            String ciudad = request.getParameter("txtciudad");
            String departamento = request.getParameter("txdepartamento");
            String pais = request.getParameter("txtpais");
            String pass = request.getParameter("txtpass");

            c.setIdcliente(idcliente);
            c.setTipodoc(tipodoc);
            c.setNumerodoc(numerodoc);
            c.setPrimernombre(primernombre);
            c.setPrimernombre(segundonombre);
            c.setPrimerapellido(primerapellido);
            c.setCorreo(correo);
            c.setTelefono(telefono);
            c.setNomempresa(nomempresa);
            c.setDireccion(direccion);
            c.setCodpostal(codpostal);
            c.setCiudad(ciudad);
            c.setDepartamento(departamento);
            c.setPais(pais);
            c.setPass(pass);
            
            dao.edit(c);
            
            acceso = listar;
        }else if (action.equalsIgnoreCase("Eliminar")) {
            String id = request.getParameter("id");
            c.setIdcliente(id);
            dao.eliminar(id);
            acceso = listar;
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
