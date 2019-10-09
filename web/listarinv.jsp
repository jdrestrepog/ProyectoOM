<%-- 
    Document   : listarinv
    Created on : 7/10/2019, 10:14:46 PM
    Author     : juan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="LoginMVC.modelo.inventario"%>
<%@page import="java.util.List"%>
<%@page import="LoginMVC.modelo.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="mycss.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Inventario</h1>
            <br>
            <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">ID Producto</th>
                            <th class="text-center">ID Proveedor</th>
                            <th class="text-center">Cantidad disponible</th>
                        </tr>
                    </thead>
                    <%
                        Consultas c = new Consultas();
                        List<inventario>list = c.listarinventario();
                        Iterator<inventario>iter = list.iterator();
                        inventario p=null;
                        while(iter.hasNext()){
                            p = iter.next();
                    %>
                    <tbody>
                        <tr>
                            <td class="text-center"><%= p.getIdproducto()   %></td>
                            <td class="text-center"><%= p.getIdproveedor()  %></td>
                            <td class="text-center"><%= p.getCantidad()     %></td>  
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                <br>
                <a href="controladorcliente?accion=volverinventario">Volver</a>
        </div>
    </body>
</html>
