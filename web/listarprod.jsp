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
            <a class="navbar-brand" href="#">Tienda OM</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item ">
                        <a class="nav-link" href="controladorcliente?accion=listar">Administrar Cliente</a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="controladorcliente?accion=listarp">Administrar Proveedores</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="controladorcliente?accion=listarprod">Administrar Productos</a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="controladorcliente?accion=listarinv">Generar Inventario</a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="controladorcliente?accion=listarcompras">Reporte de compras</a>
                    </li>   
                </ul>
<!--                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>-->
        </nav>
        <div class="col-md-12">
            <br/>
            <div class="row" >
                <div class="col-md-6 text-left"> 
                    <h2>Productos</h2>
                </div>
                <div class="col-md-6 text-right" > 
                  <a class="btn btn-success  btn-sm" href="controladorcliente?accion=addprod">Agregar Producto</a>
              </div>
            </div>
            <table class="col-md-12 tbl table table-bordered">
                <thead class="thead-light">
                    <tr class="text-center">
                        <th class="text-center">ID Producto</th>
                        <th class="text-center">Marca</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Descripción</th>
                        <th class="text-center">Precio Venta</th>
                       
                        <th class="text-center">Oferta</th>
                        <th class="text-center">Acciones  </th>
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
                    <tr >
                        <td ><%= p.getIdproducto()%></td>
                        <td ><%= p.getMarca()%></td>
                        <td ><%= p.getNombre()%></td>
                        <td ><%= p.getDescripcion()%></td>
                        <td ><%= p.getPrecioventa()%></td>
                        <td ><%= p.getOferta()%></td>
                        <td >
                            <a class="btn btn-warning btn-dark bg-dark btn-sm" href="controladorcliente?accion=Editarprod&idprod=<%=  p.getIdproducto()%>">Editar</a>
                            <a class="btn btn-danger btn-sm"  href="controladorcliente?accion=Eliminarprod&idprod=<%= p.getIdproducto()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>

