<%-- 
    Document   : listarp
    Created on : 3/10/2019, 08:48:15 AM
    Author     : juan
--%>


<%@page import="LoginMVC.modelo.proveedor"%>
<%@page import="LoginMVC.modelo.Consultas"%>
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
        <div class="container">
            <h1>Proveedores</h1>
            <a class="btn btn-success" href="controladorcliente?accion=addp">Agregar Proveedor</a>
            <br>
            <br>
            <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">ID Proveedor</th>
                            <th class="text-center">Nombre</th>
                            <th class="text-center">Dirección</th>
                            <th class="text-center">Ciudad</th>
                            <th class="text-center">Código Postal</th>
                            <th class="text-center">Provincia</th>
                            <th class="text-center">País</th>
                            <th class="text-center">Número de teléfono</th>
                            <th class="text-center">Número de Fax</th>
                            <th class="text-center">Correo</th>
                            <th class="text-center">Acciones   </th>
                        </tr>
                    </thead>
                    <%  
                        Consultas c = new Consultas();
                        List<proveedor>list = c.listarproveedor();
                        Iterator<proveedor>iter = list.iterator();
                        proveedor p=null;
                        while(iter.hasNext()){
                            p = iter.next();
                    %>
                    <tbody>
                        <tr>
                            <td class="text-center"><%= p.getIdproveedor() %></td>
                            <td class="text-center"><%= p.getNombre()      %></td>
                            <td class="text-center"><%= p.getDireccion()   %></td>
                            <td class="text-center"><%= p.getCiudad()      %></td>
                            <td class="text-center"><%= p.getCodpostal()   %></td>
                            <td class="text-center"><%= p.getProvincia()%></td>
                            <td class="text-center"><%= p.getPais()%></td>
                            <td class="text-center"><%= p.getNumtel()%></td>
                            <td class="text-center"><%= p.getNumfax()%></td>
                            <td class="text-center"><%= p.getCorreo()%></td>
                            <td>
                                <a class="btn btn-warning" href="controladorcliente?accion=Editarp&idp=<%=  p.getIdproveedor() %>">Editar</a>
                                <a class="btn btn-danger"  href="controladorcliente?accion=Eliminarp&idp=<%= p.getIdproveedor() %>">Eliminar</a>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
        </div>
    </body>
</html>
