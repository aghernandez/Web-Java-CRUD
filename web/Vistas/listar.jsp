
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Vehiculo"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Vehiculos</h1>
            <a class="btn btn-outline-info position-relative" href="Controlador?accion=add"> Agregar Vehiculo</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Chasis</th>
                        <th>Placa</th>
                        <th>Color</th>
                        <th>Nit Propietario</th>
                        <th>Nombre</th>
                        <th>Modelo</th>
                    </tr>
                </thead>
                <%
                    VehiculoDAO dao= new VehiculoDAO();
                    List<Vehiculo>list=dao.listar();
                    Iterator<Vehiculo>iter=list.iterator();
                    Vehiculo car=null;
                    while(iter.hasNext()){
                        car=iter.next();
                 %>   
                <tbody>
                    <tr>
                        <td> <%=car.getChasis()%></td>
                        <td><%=car.getPlaca()%></td>
                        <td><%=car.getColor()%></td>
                        <td><%=car.getNit_propietario()%></td>
                        <td><%=car.getNombre()%></td>
                        <td><%=car.getModelo()%></td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%=car.getChasis()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%=car.getChasis()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
