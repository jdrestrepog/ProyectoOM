/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.Servlet;

import LoginMVC.modelo.Carrito;
import LoginMVC.modelo.Consultas;
import LoginMVC.modelo.inventario;
import LoginMVC.modelo.producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juan
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Consultas con = new Consultas();
    List<producto> p = new ArrayList<>();
    List<producto> poferta = new ArrayList<>();

    List<Carrito> listacarrito = new ArrayList<>();
    int item;
    float totalpagar = 0;
    int cantidad = 1;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        p = con.listarproducto();
        poferta = con.listarproductooferta();
        String idproducto;
        producto prod = new producto();
        Carrito car = new Carrito();
        switch (accion) {
            case "Comprar":
                totalpagar = 0;
                idproducto = request.getParameter("id");
                prod = con.listprod(idproducto);
                item = item = 1;
                car.setItem(item);
                car.setIdproducto(prod.getIdproducto());
                car.setNombre(prod.getNombre());
                car.setPreciocompra(prod.getPreciocomp());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad * prod.getPreciocomp());
                listacarrito.add(car);
                for (int i = 0; i < listacarrito.size(); i++) {
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                }
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);
                request.setAttribute("contador", listacarrito.size());
                request.getRequestDispatcher("carrito.jsp").forward(request, response);

                break;
            case "AgregarCarrito":
                int pos = 0;
                cantidad = 1;
                idproducto = request.getParameter("id");
                prod = new producto();
                prod = con.listprod(idproducto);

                if (listacarrito.size() > 0) {
                    for (int i = 0; i < listacarrito.size(); i++) {
                        if (idproducto.equalsIgnoreCase(listacarrito.get(i).getIdproducto())) {
                            pos = i;
                        }

                    }
                    if (idproducto.equalsIgnoreCase(listacarrito.get(pos).getIdproducto())) {
                        cantidad = listacarrito.get(pos).getCantidad() + cantidad;
                        totalpagar = listacarrito.get(pos).getPreciocompra() * cantidad;
                        listacarrito.get(pos).setCantidad(cantidad);
                        listacarrito.get(pos).setSubtotal(totalpagar);

                    } else {
                        item = item = 1;
                        car.setItem(item);
                        car.setIdproducto(prod.getIdproducto());
                        car.setNombre(prod.getNombre());
                        car.setPreciocompra(prod.getPreciocomp());
                        car.setCantidad(cantidad);
                        car.setSubtotal(cantidad * prod.getPreciocomp());
                        listacarrito.add(car);
                    }

                } else {
                    item = item = 1;
                    car.setItem(item);
                    car.setIdproducto(prod.getIdproducto());
                    car.setNombre(prod.getNombre());
                    car.setPreciocompra(prod.getPreciocomp());
                    car.setCantidad(cantidad);
                    car.setSubtotal(cantidad * prod.getPreciocomp());
                    listacarrito.add(car);

                }

                request.setAttribute("contador", listacarrito.size());
                request.getRequestDispatcher("Controlador?accion=home").forward(request, response);

                break;
            case "Delete":
                String idp = request.getParameter("idp");
                for (int i = 0; i < listacarrito.size(); i++) {
                    if (idp.equalsIgnoreCase(listacarrito.get(i).getIdproducto())) {
                        listacarrito.remove(i);
                    }
                }
                totalpagar = 0;
                for (int i = 0; i < listacarrito.size(); i++) {
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                }

                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);
                request.setAttribute("contador", listacarrito.size());
                request.setAttribute("carrito", listacarrito);
                request.getRequestDispatcher("carrito.jsp").forward(request, response);
                break;
            case "Carrito":
                totalpagar = 0;
                request.setAttribute("carrito", listacarrito);
                for (int i = 0; i < listacarrito.size(); i++) {
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                }
                request.setAttribute("totalpagar", totalpagar);

                request.getRequestDispatcher("carrito.jsp").forward(request, response);

                break;
            case "pago":
                
                inventario inv = new inventario();
                
                
                for (int i = 0; i < listacarrito.size(); i++) {
                    // Obtenemos la cantidad en inventario por id producto
                    inv = con.listinv(listacarrito.get(i).getIdproducto());
                    
                    
                    // Modifico el auxiliar cantidad a la cantidad de la BD
                    int cantidad = inv.getCantidad();
                    
                    //Hago cantida = cantidad menos la cantidad que hay en carrito
                    cantidad = cantidad - listacarrito.get(i).getCantidad();
                    
                    //Actualizo la BD con la nueva cantidad
                    inv.setCantidad(cantidad);
                    
                    con.editinv(inv);
                    
                } 
                //Primero eliminamos todos los elementos de la lista
                listacarrito.clear();
                //Recorremos la lista para obtener el ID producto y la cantidad
                for (int i = 0; i < listacarrito.size(); i++) {
                    
                }

                request.getRequestDispatcher("pagos.jsp").forward(request, response);
                break;
            case "compra":
                //Primero eliminamos todos los elementos de la lista
                listacarrito.clear();
                request.getRequestDispatcher("pagos.jsp").forward(request, response);
                break;
            case "ofertas":
                request.setAttribute("productos", poferta);
                request.getRequestDispatcher("ofertas.jsp").forward(request, response);
                break;
            default:
                request.setAttribute("productos", p);
                request.getRequestDispatcher("shop.jsp").forward(request, response);

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
        processRequest(request, response);
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
