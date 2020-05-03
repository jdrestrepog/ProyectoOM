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
    <body style="height: 100vh; ">
        <div class="container border">
            <div>
                <h2 class="border-bottom">Agregar cliente</h2>
                <form class="form-row" style="overflow-x: hidden; overflow-y: auto; height: 90vh" action="controladorcliente">
                    <div class="form-group col-md-12">
                        <label class="col-md-3">ID Cliente:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtidcliente">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-4">Tipo Documento:</label>
                        <div class="col-md-12"> 
                        <input class="form-control" placeholder="1-Cedula 2-Nit" type="text"   name="txttipodoc"/>
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-4">Numero Documento:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtnumerodoc"/>
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-4">Primer Nombre:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtprimernombre"/> 
                        </div>
                    </div>
                   <div class="form-group col-md-6">
                        <label class="col-md-4">Segundo Nombre:</label>
                        <div class="col-md-12"> 
                             <input class="form-control" type="text"   name="txtsegundonombre"/>
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-4">Primer Apellido:</label>
                        <div class="col-md-12"> 
                             <input class="form-control" type="text"   name="txtprimerapellido"/>
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-4">Segundo Apellido:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtsegundoapellido"/>
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-4">Correo:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtcorreo">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-4">Telefono:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txttelefono">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-4">Direccion:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtdireccion">
                        </div>
                    </div>
                      <div class="form-group col-md-6">
                        <label class="col-md-4">Ciudad:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtciudad">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-4">Departamento:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txdepartamento">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-4">Pais:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtpais">
                        </div>
                    </div>
                        <div class="form-group col-md-6">
                        <label class="col-md-4">Password:</label>
                        <div class="col-md-12"> 
                            <input type="text"  class="form-control"  name="txtpass">
                        </div>
                    </div>
                        <div class="form-group col-md-6">
                        <label class="col-md-4">Tipo Cliente:</label>
                        <div class="col-md-12"> 
                           <input type="text" placeholder="1-Administrador 2-Cliente"  class="form-control" name="txttipocliente">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                    <input class="btn btn-primary" type="submit" name="accion" value="agregar">
                    </div>
                </form>  
            </div>
        </div>
    </body>
</html>
