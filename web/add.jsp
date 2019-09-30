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
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Agregar cliente</h1>
            <form action="controladorcliente">
                ID Cliente: <br>
                <input type="text"   name="txtidcliente"><br>
                Tipo Documento: <br>
                <input type="text"   name="txttipodoc"><br>
                Numero Documento: <br>
                <input type="text"   name="txtnumerodoc"><br>
                Primer Nombre: <br>
                <input type="text"   name="txtprimernombre"><br>
                Primer Apellido: <br>
                <input type="text"   name="txtprimerapellido"><br>
                Correo: <br>
                <input type="text"   name="txtcorreo"><br>
                Telefono: <br>
                <input type="text"   name="txttelefono"><br>
                Nombre Empresa: <br>
                <input type="text"   name="txtnomempresa"><br>
                Direccion: <br>
                <input type="text"   name="txtdireccion"><br>
                Codigo postal: <br>
                <input type="text"   name="txtcodpostal"><br>
                Ciudad: <br>
                <input type="text"   name="txtciudad"><br>
                Departamento: <br>
                <input type="text"   name="txdepartamento"><br>
                Pais: <br>
                <input type="text"   name="txtpais"><br>
                Password: <br>
                <input type="text"   name="txtpass"><br>
                <input type="submit" name="accion" value="agregar"><br>
            </form>  
        </div>
    </body>
</html>
