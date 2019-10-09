<%-- 
    Document   : listarprod
    Created on : 6/10/2019, 11:18:18 PM
    Author     : juan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="LoginMVC.modelo.producto"%>
<%@page import="java.util.List"%>
<%@page import="LoginMVC.modelo.Consultas"%>
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
            <h1>Proveedores</h1>
            <a class="btn btn-success" href="controladorcliente?accion=addprod">Agregar Producto</a>
            <br>
            <br>
            <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">ID Producto</th>
                            <th class="text-center">Marca</th>
                            <th class="text-center">Nombre</th>
                            <th class="text-center">Referencia</th>
                            <th class="text-center">Descripción</th>
                            <th class="text-center">Año Lanzamiento</th>
                            <th class="text-center">Familia Olfativa</th>
                            <th class="text-center">Nota Salidad</th>
                            <th class="text-center">Nota Corazón</th>
                            <th class="text-center">Nota Fondo</th>
                            <th class="text-center">Categoría</th>
                            <th class="text-center">Tipo</th>
                            <th class="text-center">Mililitros</th>
                            <th class="text-center">Onzas</th>
                            <th class="text-center">Uso</th>
                            <th class="text-center">Precio Compra</th>
                            <th class="text-center">Precio Venta</th>
                            <th class="text-center">Descuento</th>
                            <th class="text-center">Precio Con Descuento</th>
                            <th class="text-center">Oferta</th>
                            <th class="text-center">Acciones   </th>
                        </tr>
                    </thead>
                    <%  
                        Consultas c = new Consultas();
                        List<producto>list = c.listarproducto();
                        Iterator<producto>iter = list.iterator();
                        producto p=null;
                        while(iter.hasNext()){
                            p = iter.next();
                    %>
                    <tbody>
                        <tr>
                            <td class="text-center"><%= p.getIdproducto()%></td>
                            <td class="text-center"><%= p.getMarca()%></td>
                            <td class="text-center"><%= p.getNombre()%></td>
                            <td class="text-center"><%= p.getReferencia()%></td>
                            <td class="text-center"><%= p.getDescripcion()%></td>
                            <td class="text-center"><%= p.getAniolanzamiento()%></td>
                            <td class="text-center"><%= p.getFamiliaolf()%></td>
                            <td class="text-center"><%= p.getNotasalida()%></td>
                            <td class="text-center"><%= p.getNotacorazon()%></td>
                            <td class="text-center"><%= p.getNotafondo()%></td>
                            <td class="text-center"><%= p.getCategoria()%></td>
                            <td class="text-center"><%= p.getTipo()%></td>
                            <td class="text-center"><%= p.getMililitros() %></td>
                            <td class="text-center"><%= p.getOnzas()%></td>
                            <td class="text-center"><%= p.getUso()%></td>
                            <td class="text-center"><%= p.getPreciocomp()%></td>
                            <td class="text-center"><%= p.getPrecioventa()%></td>
                            <td class="text-center"><%= p.getDescuento()%></td>
                            <td class="text-center"><%= p.getPreciodesc()%></td>
                            <td class="text-center"><%= p.getOferta()%></td>
            
                            <td>
                                <a class="btn btn-warning" href="controladorcliente?accion=Editarprod&idprod=<%=  p.getIdproducto()%>">Editar</a>
                                <a class="btn btn-danger"  href="controladorcliente?accion=Eliminarprod&idprod=<%= p.getIdproducto()%>">Eliminar</a>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
        </div>
    </body>
</html>

