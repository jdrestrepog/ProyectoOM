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
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Tinda lociones</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="Controlador?accion=home">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Ofertas del dia</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="Controlador?accion=Carrito"><i class="fas fa-cart-plus"></i>(<label style="color: darkorange">${contador}</label>)Carrito</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
        </nav>
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
                    List<inventario> list = c.listarinventario();
                    Iterator<inventario> iter = list.iterator();
                    inventario p = null;
                    while (iter.hasNext()) {
                        p = iter.next();
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= p.getIdproducto()%></td>
                        <td class="text-center"><%= p.getIdproveedor()%></td>
                        <td class="text-center"><%= p.getCantidad()%></td>  
                    </tr>
                    <%}%>
                </tbody>
            </table>
            <br>
            <a href="controladorcliente?accion=volverinventario">Volver</a>
        </div>
    </body>
</html>
