<%-- 
    Document   : listarprod
    Created on : 6/10/2019, 11:18:18 PM
    Author     : juan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="LoginMVC.modelo.producto"%>
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
            <h1>Productos</h1>
            <a class="btn btn-success btn-dark bg-dark" href="controladorcliente?accion=addprod">Agregar Producto</a>
            <br>
            <br>
            <table class="table table-light">
                <thead class="thead-light">
                    <tr class="text-center d-flex">
                        <th class="col-sm-1">ID Producto</th>
                        <th class="col-sm-2">Marca</th>
                        <th class="col-sm-2">Nombre</th>
                        <th class="col-sm-2">Descripción</th>
                        <th class="col-sm-2">Precio Venta</th>
                        <th class="col-sm-2">Precio Con Descuento</th>
                        <th class="col-sm-1">Oferta</th>
                        <th class="col-sm-3">Acciones   </th>
                    </tr>
                </thead>
                <%
                    Consultas c = new Consultas();
                    List<producto> list = c.listarproducto();
                    Iterator<producto> iter = list.iterator();
                    producto p = null;
                    while (iter.hasNext()) {
                        p = iter.next();
                %>
                <tbody>
                    <tr class="text-center d-flex">
                        <td class="col-sm-1"><%= p.getIdproducto()%></td>
                        <td class="col-sm-2"><%= p.getMarca()%></td>
                        <td class="col-sm-2"><%= p.getNombre()%></td>
                        <td class="col-sm-2"><%= p.getDescripcion()%></td>
                        <td class="col-sm-2"><%= p.getPrecioventa()%></td>
                        <td class="col-sm-2"><%= p.getPreciodesc()%></td>
                        <td class="col-sm-1"><%= p.getOferta()%></td>
                        <td class="col-sm-3">
                            <a class="btn btn-warning btn-dark bg-dark" href="controladorcliente?accion=Editarprod&idprod=<%=  p.getIdproducto()%>">Editar</a>
                            <a class="btn btn-danger"  href="controladorcliente?accion=Eliminarprod&idprod=<%= p.getIdproducto()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

