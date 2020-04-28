<%-- 
    Document   : addprod
    Created on : 7/10/2019, 01:15:53 PM
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
                <h1>Agregar Producto</h1>
                <form action="controladorcliente">
                    ID Producto: <br>
                    <input class="form-control" type="text"   name="txtidproducto"><br>
                    Marca: <br>
                    <input class="form-control" type="text"   name="txtmarca"><br>
                     Nombre <br>
                    <input class="form-control" type="text"   name="txtnombre"><br>
                    Referencia: <br>
                    <input class="form-control" type="text"   name="txtreferencia"><br>
                    Descripcion: <br>
                    <input class="form-control" type="text"   name="txtdescripcion"><br>
                    Precio Compra: <br>
                    <input class="form-control" type="text"   name="txtpreciocompra"><br>
                    Precio Venta: <br>
                    <input class="form-control" type="text"   name="txtprecioventa"><br>
                    Oferta: <br>
                    <input class="form-control" type="text"   name="txtoferta"><br>
                    <br>
                    <input class="btn btn-primary" type="submit" name="accion" value="agregarprod"><br>
                </form>  
            </div>
        </div>
    </body>
</html>