<%-- 
    Document   : listaventas
    Created on : 17/11/2019, 01:26:00 PM
    Author     : juan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="LoginMVC.modelo.compra"%>
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
            <a class="navbar-brand" href="#">Tienda lociones</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="controladorcliente?accion=listar">Administrar Cliente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="controladorcliente?accion=listarp">Administrar Proveedores</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="controladorcliente?accion=listarprod">Administrar Productos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="controladorcliente?accion=listarinv">Generar Inventario</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="controladorcliente?accion=listarcompras">Reporte de compras</a>
                    </li>   
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
        </nav>
        <div class="container">
            <h1>Reporte Ventas</h1>
            <br>
            <br>
            <table class="table table-light">
                <thead class="thead-light">
                    <tr class="text-center d-flex">
                        <th class="col-sm-1">ID Compra</th>
                        <th class="col-sm-2">ID Cliente</th>
                        <th class="col-sm-2">Fecha</th>
                        <th class="col-sm-2">ID Producto</th>
                        <th class="col-sm-2">Cantidad</th>
                    </tr>
                </thead>
                <%
                    Consultas c = new Consultas();
                    String fecha = request.getParameter("fechaini");
                    List<compra> list = c.listarcompras(fecha);
                    Iterator<compra> iter = list.iterator();
                    compra comp = null;
                    while (iter.hasNext()) {
                        comp = iter.next();
                %>
                <tbody>
                    <tr class="text-center d-flex">
                        <td class="col-sm-1"><%= comp.getIdcompra() %></td>
                        <td class="col-sm-2"><%= comp.getIdcliente() %></td>
                        <td class="col-sm-2"><%= comp.getFecha() %></td>
                        <td class="col-sm-2"><%= comp.getIdproducto() %></td>
                        <td class="col-sm-2"><%= comp.getCantidad() %></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
