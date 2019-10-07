<%-- 
    Document   : addp
    Created on : 6/10/2019, 10:28:13 PM
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
                <h1>Agregar Proveedor</h1>
                <form action="controladorcliente">
                    ID Proveedor: <br>
                    <input class="form-control" type="text"   name="txtidproveedor"><br>
                    Nombre: <br>
                    <input class="form-control" type="text"   name="txtnombre"><br>
                    Direccion: <br>
                    <input class="form-control" type="text"   name="txtdireccion"><br>
                    Ciudad: <br>
                    <input class="form-control" type="text"   name="txtciudad"><br>
                    Codigo Postal: <br>
                    <input class="form-control" type="text"   name="txtcodpostal"><br>
                    Provincia: <br>
                    <input class="form-control" type="text"   name="txtprovincia"><br>
                    Pais: <br>
                    <input class="form-control" type="text"   name="txtpais"><br>
                    Numero Telefono: <br>
                    <input class="form-control" type="text"   name="txttelefono"><br>
                    Numero Fax: <br>
                    <input class="form-control" type="text"   name="txtnumfax"><br>
                    Correo: <br>
                    <input class="form-control" type="text"   name="txtcorreo"><br>
                    
                    <br>
                    <input class="btn btn-primary" type="submit" name="accion" value="agregarp"><br>
                </form>  
            </div>
        </div>
    </body>
</html>
