<%-- 
    Document   : edit
    Created on : 1/10/2019, 05:52:44 PM
    Author     : juan
--%>

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
            <div class="col-8">
                <%
                    clienteDAO dao = new clienteDAO();
                    String id = request.getParameter("id");
                    cliente c = (cliente) dao.list(id);
                %>
                <h1>Modificar Persona</h1>
                <form action="controladorcliente">
                    IdCliente:<br>
                    <input class="form-control" type="text" name="txtidcliente" value="<%= c.getIdcliente()%>"><br>
                    Tipo Documento: <br>
                    <input class="form-control" type="text" name="txttipodoc" value="<%= c.getTipodoc()%>"><br>
                    Numero Documento: <br>
                    <input class="form-control" type="text" name="txtnumerodoc" value="<%= c.getNumerodoc()%>"><br>
                    Primer Nombre: <br>
                    <input class="form-control" type="text" name="txtprimernombre" value="<%= c.getPrimernombre()%>"><br>
                    Segundo Nombre: <br>
                    <input class="form-control" type="text" name="txtsegundonombre" value="<%= c.getSegundonombre()%>"><br>
                    Primer Apellido <br>
                    <input class="form-control" type="text" name="txtprimerapellido" value="<%= c.getPrimerapellido()%>"><br>
                    Correo: <br>
                    <input class="form-control" type="text" name="txtcorreo" value="<%= c.getCorreo()%>"><br>
                    Telefono: <br>
                    <input class="form-control" type="text" name="txttelefono" value="<%= c.getTelefono()%>"><br>

                    <input type="hidden" name="txtidcliente" value="<%= c.getIdcliente()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                    <a href="controladorcliente?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
