<%-- 
    Document   : Registrocliente
    Created on : 6/10/2019, 01:15:32 PM
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
                <h1>Registrarse</h1>
                <form action="controladorusuario">
                    ID: <br>
                    <input class="form-control" type="text" placeholder="ID puede ser igual a la cedula" name="txtidcliente"><br>
                    Tipo Documento: <br>
                    <input class="form-control" type="text" placeholder="1-Cedula 2-Pasaporte"   name="txttipodoc"><br>
                    Numero Documento: <br>
                    <input class="form-control" type="text" placeholder="Número de documento"  name="txtnumerodoc"><br>
                    Primer Nombre: <br>
                    <input class="form-control" type="text" placeholder="Primer Nombre" name="txtprimernombre"><br>
                    Segundo Nombre: <br>
                    <input class="form-control" type="text" placeholder="Segundo Nombre" name="txtsegundonombre"><br>
                    Primer Apellido: <br>
                    <input class="form-control" type="text" placeholder="Primer Apellido" name="txtprimerapellido"><br>
                    Segundo Apellido: <br>
                    <input class="form-control" type="text" placeholder="Segundo Apellido" name="txtsegundoapellido"><br>
                    Correo: <br>
                    <input class="form-control" type="text" placeholder="Correo Electronico" name="txtcorreo"><br>
                    Telefono: <br>
                    <input class="form-control" type="text" placeholder="Telefono" name="txttelefono"><br>
                    Nombre Empresa: <br>
                    <input class="form-control" type="text" placeholder="Campo Opcional" name="txtnomempresa"><br>
                    Direccion: <br>
                    <input class="form-control" type="text" placeholder="Direccion" name="txtdireccion"><br>
                    Codigo postal: <br>
                    <input class="form-control" type="text" placeholder="Codigo Postal" name="txtcodpostal"><br>
                    Ciudad: <br>
                    <input class="form-control" type="text" placeholder="Ciudad" name="txtciudad"><br>
                    Departamento: <br>
                    <input class="form-control" type="text" placeholder="Departamento" name="txdepartamento"><br>
                    Pais: <br>
                    <input class="form-control" type="text" placeholder="Pais" name="txtpais"><br>
                    Password: <br>
                    <input type="text" placeholder="Password" name="txtpass"> <br>
                    <br>
                    <input class="btn btn-primary" type="submit" name="accion" value="registrarse"><br>
                </form>  
            </div>
        </div>
    </body>
</html>