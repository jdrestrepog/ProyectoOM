/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Servlet;

import LoginMVC.modelo.Carrito;
import LoginMVC.modelo.Consultas;
import LoginMVC.modelo.cliente;
import LoginMVC.modelo.inventario;
import LoginMVC.modelo.producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
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
    String tipocliente = "";
    String user;
    String pass;
    cliente c = new cliente();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, MessagingException {
        String accion = request.getParameter("accion");

        p = con.listarproducto();
        poferta = con.listarproductooferta();
        String idproducto;
        producto prod = new producto();
        Carrito car = new Carrito();
        Consultas con = new Consultas();
        switch (accion) {
            case "Registrarse":
                request.getRequestDispatcher("Registrocliente.jsp").forward(request, response);
            case "Entrar":
                user = request.getParameter("user");
                pass = request.getParameter("pass");

                String Administrador = "1";
                String Cliente = "2";

                try {
                    if (Administrador.equals(con.Autenticacion2(user, pass))) {
                        request.getRequestDispatcher("menu.jsp").forward(request, response);
                    } else if (Cliente.equals(con.Autenticacion2(user, pass))) {
                        request.getRequestDispatcher("shop.jsp").forward(request, response);
                        request.setAttribute("usuario", user);
                    } else {
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
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
                //Consultar ID Cliente
                c = con.listuser(user);
                //Consultar la Fecha del día
                Calendar c1 = Calendar.getInstance();
                String dia,
                mes,
                anio;
                
                int mes1 = c1.get(Calendar.MONTH) + 1;
                
                dia = Integer.toString(c1.get(Calendar.DATE));
                mes = Integer.toString(mes1);
                anio = Integer.toString(c1.get(Calendar.YEAR));
                String fecha = anio + "-" + mes + "-" + dia;
                inventario inv = new inventario();

                for (int i = 0; i < listacarrito.size(); i++) {
                    // Obtenemos la cantidad en inventario por id producto
                    inv = con.listinv(listacarrito.get(i).getIdproducto());

                    // Modifico el auxiliar cantidad a la cantidad de la BD
                    int cantidad = inv.getCantidad();
                    
                    //Si la cantidad en inventario del producto es <= 2 genero alarma de stock
                    if (cantidad <= 2) {
                        enviarmail_cantidad(listacarrito.get(i).getIdproducto(), cantidad);
                    }
   
                    //Hago cantida = cantidad menos la cantidad que hay en carrito
                    cantidad = cantidad - listacarrito.get(i).getCantidad();

                    //Actualizo la BD con la nueva cantidad
                    //inv.setCantidad(cantidad);
                    inv.setCantidad(cantidad);

                    con.editinv(inv);
                    //Insertar en tabla compra
                    con.agregarcompra(c.getIdcliente(), fecha);
                    //Obtener autoincremental
                    String idcompra = con.last_insert();
                    int idcomp = Integer.parseInt(idcompra);
                    
                    //Insertar en tabla compraprod   
                    con.agregarcompraprod(listacarrito.get(i).getIdproducto(), c.getIdcliente(), idcomp,Integer.toString(listacarrito.get(i).getCantidad()));
                    //enviarmail(Integer.toString(listacarrito.get(i).getCantidad()), inv, c.getIdcliente(), c.getDireccion(), c.getPrimernombre(), c.getPrimerapellido(), c.getCorreo(), c.getTelefono());
                }
                
                //Primero eliminamos todos los elementos de la lista
                listacarrito.clear();
                //Recorremos la lista para obtener el ID producto y la cantidad

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

    public void enviarmail(String cantidad, inventario inv, String idcliente, String direccion, String nombre, String apellido, String correo, String telefono) throws MessagingException {

        try {

            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente   = "academico20191111@gmail.com";
            String passwordRemitente = "Noviembre#321";
            String correoReceptor    = "jdrestrepog@gmail.com";
            //String asunto = "Mi primero correo en Java";
            String asunto = "Ventas por pagina Web";
            String mensaje = "Se han vendido: " + cantidad + " Unidad/es del producto: " + 
                    inv.getIdproducto() + " Al cliente: " + idcliente + " Nombre: " 
                    + nombre + " " + apellido +  " Direccion: " + direccion
                    + " Correo: " + correo
                    + " Telefono: " + telefono;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");

            Transport t = session.getTransport("smtp");

            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

        } catch (AddressException ex) {
            //Logger.getLogger(envio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            //Logger.getLogger(envio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void enviarmail_cantidad(String idproducto, int cantidad) throws MessagingException {

        try {

            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente   = "academico20191111@gmail.com";
            String passwordRemitente = "Noviembre#321";
            String correoReceptor    = "jdrestrepog@gmail.com";
            //String asunto = "Mi primero correo en Java";
            String asunto = "Alerta Inventario Producto: " + idproducto;
            String mensaje = "Quedan: "+cantidad+ " Unidad/es  del producto: " + idproducto;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");

            Transport t = session.getTransport("smtp");

            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

        } catch (AddressException ex) {
            //Logger.getLogger(envio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            //Logger.getLogger(envio.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        } catch (MessagingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
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
