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
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Tienda lociones</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="Controlador?accion=home">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Ofertas del dia</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="Controlador?accion=Carrito"><i class="fas fa-cart-plus"></i>(<label style="color: darkorange">${contador}</label>)Carrito</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
        </nav>
        <br>
        <br>
        <div class="container">
            <a class="btn btn-success btn-dark bg-dark" href="controladorcliente?accion=listar">Listar Cliente</a>
            <br>
            <br>
            <a class="btn btn-success btn-dark bg-dark" href="controladorcliente?accion=listarp">Listar Proveedor</a>
            <br>
            <br>
            <a class="btn btn-success btn-dark bg-dark" href="controladorcliente?accion=listarprod">Listar Producto</a>
            <br>
            <br>
            <a class="btn btn-success btn-dark bg-dark" href="controladorcliente?accion=listarinv">Generar Inventario</a>
            <br>
            <br>
            <a class="btn btn-success btn-dark bg-dark" href="controladorcliente?accion=listarcompras">Reporte compras</a>
        </div>
    </body>
</html>
