<%-- 
    Document   : index
    Created on : 15/09/2019, 07:26:29 PM
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="mycss.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <title>JSP Page</title>
    </head>
    <body class="text-center">
        <form action="Autenticacion" method="post"  class="px-4 py-3" align="center">
            <div class="form-group" justify-content-center>
                <label for="exampleDropdownFormEmail1">Usuario:</label>
                <input class="center-block" type="email" name="user" id="user" class="form-control" placeholder="email@ejemplo.com">
            </div>
            <div class="form-group">
                <label for="exampleDropdownFormPassword1">Contraseña</label>
                <input class="center-block" type="password" name="pass" id="user" class="form-control" placeholder="Contraseña">
            </div>
            <div class="form-check">
                <input class="center-block" type="checkbox" class="form-check-input" id="dropdownCheck">
                <label class="form-check-label" for="dropdownCheck">
                    Recordarme
                </label>
            </div>
            <button type="submit" name="Entrar" id="Entrar" value="Entrar" class="btn btn-primary">Entrar</button>
        </form>
        <div class="dropdown-divider"></div>
        <a class="dropdown-item" href="#">Registrarse</a>
        <a class="dropdown-item" href="#">Olvidaste tu contraseña?</a>
    </body>
</html>
