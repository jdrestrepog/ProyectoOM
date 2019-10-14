<%-- 
    Document   : addinv
    Created on : 14/10/2019, 02:28:41 PM
    Author     : juan
--%>

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
            <div>
                <br>
                <h1>Agregar Producto al inventario</h1>
                <form action="controladorcliente">
                    ID Producto: <br>
                    <input class="form-control" type="text"   name="txtidproducto"><br>
                    ID Proveedor: <br>
                    <input class="form-control" type="text"   name="txtidproveedor"><br>
                    Cantidad: <br>
                    <input class="form-control" type="text"   name="txtcantidad"><br>
   
                    <br>
                    <input class="btn btn-primary" type="submit" name="accion" value="agregarinv"> <br>
                </form>  
            </div>
        </div>
    </body>
</html>
