<%-- 
    Document   : editinv
    Created on : 14/10/2019, 03:03:16 PM
    Author     : juan
--%>

<%@page import="LoginMVC.modelo.inventario"%>
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
                    inventario inv = new inventario();
                    String idproducto = request.getParameter("idinv");
                    inv = c.listinv(idproducto);

                %>
                 <br>
                <h1>Modificar Inventario</h1>
               
                <form action="controladorcliente">
                    ID Producto<br>
                    <input class="form-control" type="text" name="txtidproducto" value="<%=inv.getIdproducto()%>"><br>
                    ID Proveedor <br>
                    <input class="form-control" type="text" name="txtnombreproveedor" value="<%=inv.getIdproveedor()%>"><br>
                    Cantidad: <br>
                    <input class="form-control" type="text" name="txtcantidad" value="<%=inv.getCantidad()%>"><br>
                    
                    <input type="hidden" name="txtidproducto" value="<%=inv.getIdproducto()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizarinv"> 
                
                </form>
            </div>
        </div>
    </body>
</html>
