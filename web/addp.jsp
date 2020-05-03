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
     <body >
         <div class="container border">
            <div>
               
                 <h2 class="border-bottom">Agregar Proveedor</h2>
                <form class="form-row"  action="controladorcliente">
                    <div class="form-group col-md-6">
                        <label class="col-md-3">ID Proveedor:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtidproveedor">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Nombre:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtnombre">
                        </div>
                    </div>
                   <div class="form-group col-md-6">
                        <label class="col-md-3">Direccion:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtdireccion">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Ciudad:</label>
                        <div class="col-md-12"> 
                         <input class="form-control" type="text"   name="txtciudad">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Provincia:</label>
                        <div class="col-md-12"> 
                          <input class="form-control" type="text"   name="txtprovincia">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Pais:</label>
                        <div class="col-md-12"> 
                          <input class="form-control" type="text"   name="txtpais">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-4">Numero Telefono:</label>
                        <div class="col-md-12"> 
                          <input class="form-control" type="text"   name="txttelefono">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Numero Fax:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtnumfax">
                        </div>
                    </div>
                      <div class="form-group col-md-6">
                        <label class="col-md-3">Correo:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtcorreo">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                         <input style="margin-top: 30px" class="btn btn-primary" type="submit" name="accion" value="agregarp">
                      </div>
                </form>  
            </div>
        </div>
    </body>
</html>
