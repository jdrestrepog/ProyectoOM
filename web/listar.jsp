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
        <div class="container">
            <h1>Clientes</h1>
            <a class="btn btn-success" href="controladorcliente?accion=add">Agregar Cliente</a>
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
                        List<cliente>list = c.listar();
                        Iterator<cliente>iter = list.iterator();
                        cliente clie=null;
                        while(iter.hasNext()){
                            clie = iter.next();
                    %>
                    <tbody>
                        <tr>
                            <td class="text-center"><%= clie.getIdcliente() %></td>
                            <td class="text-center"><%= clie.getTipodoc() %></td>
                            <td class="text-center"><%= clie.getNumerodoc() %></td>
                            <td class="text-center"><%= clie.getPrimernombre() %></td>
                            <td class="text-center"><%= clie.getPrimerapellido()%></td>
                            <td class="text-center"><%= clie.getCorreo()%></td>
                            <td>
                                <a class="btn btn-warning" href="controladorcliente?accion=Editar&id=<%=   clie.getIdcliente() %>">Editar</a>
                                <a class="btn btn-danger" href="controladorcliente?accion=Eliminar&id=<%=  clie.getIdcliente() %>">Eliminar</a>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
        </div>
    </body>
</html>
