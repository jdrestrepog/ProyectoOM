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
        <main role="main" class="container my-auto">
            <div class="row">
                <div id="login" class="col-lg-4 offset-lg-4 col-md-6 offset-md-3
                     col-12">
                    <h2 class="text-center">Bienvenido</h2>
                    <img class="img-fluid mx-auto d-block rounded"
                         src="https://picsum.photos/id/870/300/200" />
                    <form action="Autenticacion" method="post">
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
                        <button type="submit" name="Entrar" class="btn btn-primary mb-2">
                            Entrar
                        </button>
                        <br>
                        <a href="#">Registrarse</a>
                        <br>
                        <a href="#">Olvidó su contraseña ?</a>
                    </form>
                </div>
            </div>
        </main>
    </body>
</html>
