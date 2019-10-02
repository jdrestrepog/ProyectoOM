<%-- 
    Document   : add
    Created on : 29/09/2019, 12:17:25 PM
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
                <h1>Agregar cliente</h1>
                <form action="controladorcliente">
                    ID Cliente: <br>
                    <input class="form-control" type="text"   name="txtidcliente"><br>
                    Tipo Documento: <br>
                    <input class="form-control" type="text"   name="txttipodoc"><br>
                    Numero Documento: <br>
                    <input class="form-control" type="text"   name="txtnumerodoc"><br>
                    Primer Nombre: <br>
                    <input class="form-control" type="text"   name="txtprimernombre"><br>
                    Primer Apellido: <br>
                    <input class="form-control" type="text"   name="txtprimerapellido"><br>
                    Correo: <br>
                    <input class="form-control" type="text"   name="txtcorreo"><br>
                    Telefono: <br>
                    <input class="form-control" type="text"   name="txttelefono"><br>
                    Nombre Empresa: <br>
                    <input class="form-control" type="text"   name="txtnomempresa"><br>
                    Direccion: <br>
                    <input class="form-control" type="text"   name="txtdireccion"><br>
                    Codigo postal: <br>
                    <input class="form-control" type="text"   name="txtcodpostal"><br>
                    Ciudad: <br>
                    <input class="form-control" type="text"   name="txtciudad"><br>
                    Departamento: <br>
                    <input class="form-control" type="text"   name="txdepartamento"><br>
                    Pais: <br>
                    <input class="form-control" type="text"   name="txtpais"><br>
                    Password: <br>
                    <input type="text"   name="txtpass"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="agregar"><br>
                </form>  
            </div>
        </div>
    </body>
</html>
