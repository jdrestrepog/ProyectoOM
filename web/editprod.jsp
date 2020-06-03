<%-- 
    Document   : editprod
    Created on : 7/10/2019, 08:26:40 PM
    Author     : juan
--%>

<%@page import="LoginMVC.modelo.producto"%>
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
                    producto  p = new producto();
                    String idproducto = request.getParameter("idprod");

                    p = c.listprod(idproducto);

                %>
                <h1>Modificar Producto</h1>
                <form action="controladorcliente">
                    Id Producto:<br>
                    <input class="form-control" type="text" name="txtidproducto" value="<%= p.getIdproducto()%>"><br>
                    Marca: <br>
                    <input class="form-control" type="text" name="txtmarca" value="<%= p.getMarca()%>"><br>
                    Nombre: <br>
                    <input class="form-control" type="text" name="txtnombre" value="<%= p.getNombre()%>"><br>
                    Referencia: <br>
                    <input class="form-control" type="text" name="txtreferencia" value="<%= p.getReferencia()%>"><br>
                    Descripción: <br>
                    <input class="form-control" type="text" name="txtdescripcion" value="<%= p.getDescripcion()%>"><br>
                   
                    Precio Compra: <br>
                    <input class="form-control" type="text" name="txtpreciocompra" value="<%= p.getPreciocomp()%>"><br>
                    Precio Venta: <br>
                    <input class="form-control" type="text" name="txtprecioventa" value="<%= p.getPrecioventa()%>"><br>
             
                    Oferta: <br>
                    <input class="form-control" type="text" name="txtoferta" value="<%= p.getOferta()%>"><br>

                    <input type="hidden" name="txtidcliente" value="<%= p.getIdproducto()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizarprod"> 
                    <%--<a href="controladorcliente?accion=listar">Regresar</a>--%>
                </form>
            </div>
        </div>
    </body>
</html>
