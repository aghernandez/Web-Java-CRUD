<%-- 
    Document   : edit
    Created on : 07-nov-2020, 22:28:48
    Author     : Gary
--%>

<%@page import="Modelo.Vehiculo"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Editar</title>
    </head>
    <body>
        <div class="container">
            <%
                VehiculoDAO dao = new VehiculoDAO();
                int id=Integer.parseInt((String)request.getAttribute("idcar"));
                Vehiculo car = (Vehiculo)dao.list(id);
            %>
       <h1>Editar Vehiculo</h1>
            <form action="Controlador">
                Chasis: <br>
                <input class="form-control" type="text" name="txtChasis" value="<%= car.getChasis()%>"> <br>
                Placa: <br>
                <input class="form-control" type="text" name="txtPlaca" value="<%= car.getPlaca() %>"><br>
                Color: <br>
                <input class="form-control" type="text" name="txtColor" value="<%= car.getColor() %>"><br>
                Nit: <br>
                <input class="form-control" type="text" name="txtNit" value="<%= car.getNit_propietario() %>"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNombre" value="<%= car.getNombre() %>"><br>
                Modelo: <br>
                <input class="form-control" type="text" name="txtModelo" value="<%= car.getModelo() %>"><br>
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
            </form>
       </div>
    </body>
</html>
