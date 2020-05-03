<%-- 
    Document   : index
    Created on : 15/09/2019, 07:26:29 PM
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1,
              shrink-to-fit=no">
        <meta name="description" content="Formulario de login con Bootstrap">
        <meta name="author" content="Parzibyte">
        <title>Formulario de login con Bootstrap</title>
        <!-- Cargar el CSS de Boostrap-->
        <link href="./css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Tienda OM</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="Controlador?accion=home">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Ofertas del dia</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="Controlador?accion=Carrito"><i class="fas fa-cart-plus"></i>(<label style="color: darkorange">${contador}</label>)Carrito</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
        </nav>
                    <br/>
        <main role="main" class="container my-auto">
              <div class="row">
                <div id="login" class="col-lg-4 offset-lg-4 col-md-6 offset-md-3 
                     col-12 card">
                    <article class="card-body" >
                        
                    
                    <h4 class="text-center card-title">Bienvenido</h4>
                    <img class="img-fluid mx-auto d-block rounded" style="width: 70px"
                         <%--src="https://picsum.photos/id/870/300/200" />--%>
                         src="img/logo.png" />
                    <form action="Controlador">
                        <div class="form-group">
                            <label for="correo">Correo</label>
                            <input id="correo" name="user"
                                   class="form-control" type="email"
                                   placeholder="Correo electrónico">
                        </div>
                        <div class="form-group">
                            <label for="palabraSecreta">Contraseña</label>
                            <input id="palabraSecreta" name="pass"
                                   class="form-control" type="password"
                                   placeholder="Contraseña">
                        </div>
                          <div class="form-group">
                         
                              <input class="btn btn-primary btn-block" type="submit" name="accion" value="Entrar">
                         <a class="text-center" href="Controlador?accion=Registrarse">Registrarse</a>
                  
                          </div> <br>
                      </form>
                </article>
                </div>
            </div>
        </main>
    </body>
</html>
