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
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Clientes</h1>
            <table><table border="1">
                    <thead>
                        <tr>
                            <th>idcliente</th>
                            <th>tipodoc</th>
                            <th>numerodoc</th>
                            <th>primernombre</th>
                            <th>segundonombre</th>
                            <th>primerapellido</th>
                            <th>Acciones</th>
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
                            <td><%= clie.getIdcliente() %></td>
                            <td><%= clie.getTipodoc() %></td>
                            <td><%= clie.getNumerodoc() %></td>
                            <td><%= clie.getPrimernombre() %></td>
                            <td><%= clie.getSegundonombre() %></td>
                            <td><%= clie.getPrimerapellido() %></td>
                            <td>
                                <a>Editar</a>
                                <a>Remover</a>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>

        </div>
        
    </body>
</html>
