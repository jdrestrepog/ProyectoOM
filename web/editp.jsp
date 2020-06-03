<%-- 
    Document   : editp
    Created on : 6/10/2019, 09:26:34 PM
    Author     : juan
--%>

<%@page import="LoginMVC.modelo.proveedor"%>
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
            <div class="col-8">
                <%
                    Consultas c = new Consultas();
                    proveedor p = new proveedor();
                    String idproveedor = request.getParameter("idp");

                    p = c.listp(idproveedor);

                %>
                <h1>Modificar Proveedor</h1>
                <form action="controladorcliente">
                    Id Proveedor:<br>
                    <input class="form-control" type="text" name="txtidproveedor" value="<%= p.getIdproveedor()%>"><br>
                    Nombre Proveedor: <br>
                    <input class="form-control" type="text" name="txtnombreproveedor" value="<%= p.getNombre()%>"><br>
                    Direccion: <br>
                    <input class="form-control" type="text" name="txtdireccion" value="<%= p.getDireccion()%>"><br>
                    Ciudad: <br>
                    <input class="form-control" type="text" name="txtciudad" value="<%= p.getCiudad()%>"><br>
                    Provincia: <br>
                    <input class="form-control" type="text" name="txtprovincia" value="<%= p.getProvincia()%>"><br>
                    Pais: <br>
                    <input class="form-control" type="text" name="txtpais" value="<%= p.getPais()%>"><br>
                    Telefono: <br>
                    <input class="form-control" type="text" name="txttelefono" value="<%= p.getNumtel()%>"><br>
                    Correo: <br>
                    <input class="form-control" type="text" name="txtcorreo" value="<%= p.getCorreo() %>"><br>
                    
                    <input type="hidden" name="txtidcliente" value="<%= p.getIdproveedor()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizarp"> 
                    <%--<a href="controladorcliente?accion=listar">Regresar</a>--%>
                </form>
            </div>
        </div>
    </body>
</html>
