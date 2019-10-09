/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.Servlet;

import LoginMVC.modelo.Consultas;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juan
 */
public class Validacion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        /*response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");

        if (accion.equalsIgnoreCase("Registrarse")) {
            response.sendRedirect("Registrocliente.jsp");
        } else {
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            Consultas con = new Consultas();

            if (con.Autenticacion(user, pass)) {
                response.sendRedirect("menu.jsp");
            } else {
                response.sendRedirect("index.jsp");
            }
        }
*/
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
          
        
        String accion = request.getParameter("accion");
        String acceso = null;
        
        if (accion.equalsIgnoreCase("Registrarse")) {
            //response.sendRedirect("Registrocliente.jsp");
            acceso = "Registrocliente.jsp";
        } else {
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            Consultas con = new Consultas();
            String Administrador = "1";
            String Cliente= "2";

            try {
                if(Administrador.equals(con.Autenticacion2(user, pass))){
                    acceso = "menu.jsp";
                }
                else if(Cliente.equals(con.Autenticacion2(user, pass))){
                    acceso = "shop.jsp";
                }
                else{
                    acceso = "index.jsp";
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }
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
