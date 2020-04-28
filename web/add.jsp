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
                    <input class="form-control" placeholder="1-Cedula 2-Nit" type="text"   name="txttipodoc"><br>
                    Numero Documento: <br>
                    <input class="form-control" type="text"   name="txtnumerodoc"><br>
                    Primer Nombre: <br>
                    <input class="form-control" type="text"   name="txtprimernombre"><br>
                    Segundo Nombre: <br>
                    <input class="form-control" type="text"   name="txtsegundonombre"><br>
                    Primer Apellido: <br>
                    <input class="form-control" type="text"   name="txtprimerapellido"><br>
                    Segundo Apellido: <br>
                    <input class="form-control" type="text"   name="txtsegundoapellido"><br>
                    Correo: <br>
                    <input class="form-control" type="text"   name="txtcorreo"><br>
                    Telefono: <br>
                    <input class="form-control" type="text"   name="txttelefono"><br>
                    Direccion: <br>
                    <input class="form-control" type="text"   name="txtdireccion"><br>
                    Ciudad: <br>
                    <input class="form-control" type="text"   name="txtciudad"><br>
                    Departamento: <br>
                    <input class="form-control" type="text"   name="txdepartamento"><br>
                    Pais: <br>
                    <input class="form-control" type="text"   name="txtpais"><br>
                    Password: <br>
                    <input type="text"   name="txtpass"> <br>
                    <br>
                    Tipo Cliente: <br>
                    <input type="text" placeholder="1-Administrador 2-Cliente"  name="txttipocliente"> <br>
                    <br>
                    <input class="btn btn-primary" type="submit" name="accion" value="agregar"><br>
                </form>  
            </div>
        </div>
    </body>
</html>
