<%-- 
    Document   : addinv
    Created on : 14/10/2019, 02:28:41 PM
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
                <h2 class="border-bottom">Agregar Producto al inventario</h2>
                
                <form action="controladorcliente">
                  
                     <div class="form-group col-md-12">
                        <label class="col-md-3">ID Producto:</label>
                        <div class="col-md-12"> 
                             <input class="form-control" type="text"   name="txtidproducto">
                        </div>
                    </div>
                     <div class="form-group col-md-12">
                        <label class="col-md-3">ID Proveedor:</label>
                        <div class="col-md-12"> 
                            <input class="form-control" type="text"   name="txtidproveedor">
                        </div>
                    </div>
                     <div class="form-group col-md-12">
                        <label class="col-md-3">Cantidad:</label>
                        <div class="col-md-12"> 
                           <input class="form-control" type="text"   name="txtcantidad">
                        </div>
                    </div>
                    
                   <div class="form-group col-md-12">
                    <input class="btn btn-primary" type="submit" name="accion" value="agregarinv">
                      </div>
                   
                </form>  
            </div>
        </div>
    </body>
</html>
