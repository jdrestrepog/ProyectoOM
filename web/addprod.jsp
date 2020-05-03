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
        <div class="container border">
            <div>
            
                <h2 class="border-bottom">Agregar Producto</h2>
                <form class="form-row" action="controladorcliente">
                     <div class="form-group col-md-6">
                        <label class="col-md-3">ID Producto:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtidproducto">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-3">Marca:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtmarca">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Nombre:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtnombre">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-3">Referencia:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtreferencia">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Descripcion:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtdescripcion">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-5"> Precio Compra:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtpreciocompra">
                        </div>
                    </div>
                     <div class="form-group col-md-6">
                        <label class="col-md-5">Precio Venta: </label>
                        <div class="col-md-12"> 
                          <input class="form-control" type="text"   name="txtprecioventa">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label class="col-md-3">Oferta: </label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtoferta">
                        </div>
                    </div>
                      <div class="form-group col-md-6">
                    <input class="btn btn-primary" type="submit" name="accion" value="agregarprod">
               </div>
                    </form>  
            </div>
        </div>
    </body>
</html>