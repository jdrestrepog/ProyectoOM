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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <div>
                <form action="Autenticacion" method="post">
                    Usuario
                    <p><input type="text" name="user" id="user" /></p>
                    Password
                    <p><input type="pass" name="pass" id="pass" /></p>
                    <p><input type="submit" name="Entrar" id="Entrar" value="Entrar" /></p>                    
                </form>
            </div>
        </h1>
    </body>
</html>
