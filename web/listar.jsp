<%-- 
    Document   : listar
    Created on : 28/09/2019, 11:55:55 PM
    Author     : juan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="LoginMVC.modelo.cliente"%>
<%@page import="modeloDAO.clienteDAO"%>
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
            <a class="navbar-brand" href="#">Tienda OM</a>
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
                    <li class="nav-item ">
                        <a class="nav-link" href="controladorcliente?accion=listarprod">Administrar Productos</a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="controladorcliente?accion=listarinv">Generar Inventario</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="controladorcliente?accion=listarcompras">Reporte de compras</a>
                    </li>   
                </ul>
<!--                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>-->
        </nav>
        <div class="container">
            <h1>Clientes</h1>
            <a class="btn btn-success btn-dark bg-dark" href="controladorcliente?accion=add">Agregar Cliente</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID Cliente</th>
                        <th class="text-center">Tipo Documento</th>
                        <th class="text-center">Número de Documento</th>
                        <th class="text-center">Primer nombre</th>
                        <th class="text-center">Primer Apellido</th>
                        <th class="text-center">Correo</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                </thead>
                <%
                    clienteDAO c = new clienteDAO();
                    List<cliente> list = c.listar();
                    Iterator<cliente> iter = list.iterator();
                    cliente clie = null;
                    while (iter.hasNext()) {
                        clie = iter.next();
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= clie.getIdcliente()%></td>
                        <td class="text-center"><%= clie.getTipodoc()%></td>
                        <td class="text-center"><%= clie.getNumerodoc()%></td>
                        <td class="text-center"><%= clie.getPrimernombre()%></td>
                        <td class="text-center"><%= clie.getPrimerapellido()%></td>
                        <td class="text-center"><%= clie.getCorreo()%></td>
                        <td>
                            <a class="btn btn-warning btn-dark bg-dark" href="controladorcliente?accion=Editar&id=<%=   clie.getIdcliente()%>">Editar</a>
                            <a class="btn btn-danger" href="controladorcliente?accion=Eliminar&id=<%=  clie.getIdcliente()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
