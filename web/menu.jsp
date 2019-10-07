<%-- 
    Document   : menu
    Created on : 19/09/2019, 12:01:39 AM
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
        <br>
        <br>
        <div class="container">
            <a class="btn btn-success btn-lg" href="controladorcliente?accion=listar">Listar Cliente</a>
            <br>
            <br>
            <a class="btn btn-success btn-lg" href="controladorcliente?accion=listarp">Listar Proveedor</a>
            <br>
            <br>
            <a class="btn btn-success btn-lg" href="controladorcliente?accion=listarprod">Listar Producto</a>
            <br>
            <br>
            <a class="btn btn-success btn-lg" href="controladorcliente?accion=listarinv">Generar Inventario</a>
        </div>
    </body>
</html>
