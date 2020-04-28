/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Servlet;

import LoginMVC.modelo.Consultas;
import LoginMVC.modelo.cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juan
 */
public class controladorusuario extends HttpServlet {


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controladorusuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controladorusuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";
        String action = request.getParameter("accion");
        String creacionexitosa = "CreacionExitosa.jsp";
        String index = "index.jsp";
        cliente c = new cliente();
        
        if (action.equalsIgnoreCase("registrarse")) {
            String idcliente       = request.getParameter("txtidcliente");
            String tipodoc         = request.getParameter("txttipodoc");
            String numerodoc       = request.getParameter("txtnumerodoc");
            String primernombre    = request.getParameter("txtprimernombre");
            String segundonombre   = request.getParameter("txtsegundonombre");
            String primerapellido  = request.getParameter("txtprimerapellido");
            String segundoapellido = request.getParameter("txtsegundopellido");
            String correo          = request.getParameter("txtcorreo");
            String telefono        = request.getParameter("txttelefono");
            String direccion       = request.getParameter("txtdireccion");
            String ciudad          = request.getParameter("txtciudad");
            String departamento    = request.getParameter("txdepartamento");
            String pais            = request.getParameter("txtpais");
            String pass            = request.getParameter("txtpass");

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
            c.setPass(pass);
            c.setTipocliente("2");
            
            Consultas con = new Consultas();
            con.agregarCliente(c);
            
            acceso = creacionexitosa;
        }
        else if(action.equalsIgnoreCase("Volver")){
            acceso = index;
        }
        
         RequestDispatcher vista = request.getRequestDispatcher(acceso);
         vista.forward(request, response);
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
