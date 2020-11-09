/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vehiculo;
import ModeloDAO.VehiculoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gary
 */
public class Controlador extends HttpServlet {
    
    String listar="Vistas/listar.jsp";
    String add="Vistas/add.jsp";
    String edit="Vistas/edit.jsp";
    
    Vehiculo car=new Vehiculo();
    VehiculoDAO vdao = new VehiculoDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            int chasis = Integer.valueOf(request.getParameter("txtChasis"));
            
            String placa =request.getParameter("txtPlaca");
            String color =request.getParameter("txtColor");
            String nit_propietario =request.getParameter("txtNit");
            String nombre =request.getParameter("txtNombre");
            int modelo = Integer.valueOf(request.getParameter("txtModelo"));
            
            car.setChasis(chasis);
            car.setPlaca(placa);
            car.setColor(color);
            car.setNit_propietario(nit_propietario);
            car.setNombre(nombre);
            car.setModelo(modelo);
            vdao.add(car);
            acceso=listar; 
            System.out.println(car);
        }
        else if (action.equalsIgnoreCase("editar")){
            request.setAttribute("idcar",request.getParameter("id"));
            acceso=edit;
        }
        
        else if (action.equalsIgnoreCase("Actualizar")){
           int chasis = Integer.valueOf(request.getParameter("txtChasis"));
            String placa =request.getParameter("txtPlaca");
            String color =request.getParameter("txtColor");
            String nit_propietario =request.getParameter("txtNit");
            String nombre =request.getParameter("txtNombre");
            int modelo = Integer.valueOf(request.getParameter("txtModelo"));
            
            
            car.setPlaca(placa);
            car.setColor(color);
            car.setNit_propietario(nit_propietario);
            car.setNombre(nombre);
            car.setModelo(modelo);
            car.setChasis(chasis);
            vdao.edit(car);
            acceso=listar;
        }
        
        else if (action.equalsIgnoreCase("eliminar")){
            int chasis = Integer.valueOf(request.getParameter("id"));
            car.setChasis(chasis);
            vdao.delete(chasis);
            acceso=listar;
        }
        
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
