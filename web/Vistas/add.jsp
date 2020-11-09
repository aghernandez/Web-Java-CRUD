<%-- 
    Document   : add
    Created on : 07-nov-2020, 22:28:36
    Author     : Gary
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Agregar Auto</title>
    </head>
    <body>
        <div class="container">
            <h1>Agregar Vehiculo</h1>
            <form action="Controlador">
                Chasis: <br>
                <input class="form-control" type="text" name="txtChasis"> <br>
                Placa: <br>
                <input class="form-control" type="text" name="txtPlaca"><br>
                Color: <br>
                <input class="form-control" type="text" name="txtColor"><br>
                Nit: <br>
                <input class="form-control" type="text" name="txtNit"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNombre"><br>
                Modelo: <br>
                <input class="form-control" type="text" name="txtModelo"><br>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
            </form>
        </div>
        
    </body>
</html>
