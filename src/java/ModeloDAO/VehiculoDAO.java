
package ModeloDAO;

import Interfaces.CRUD;
import Modelo.Vehiculo;
import config.bdConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class VehiculoDAO implements CRUD{
    
    bdConexion dbc = new bdConexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Vehiculo car = new Vehiculo();

    @Override
    public List listar() {
        ArrayList<Vehiculo> list=new ArrayList<>();
        String sql="SELECT * FROM  vehiculos ";
        try {
            con=dbc.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Vehiculo car = new Vehiculo();
                car.setChasis(rs.getInt("Chasis"));
                car.setPlaca(rs.getString("Placa"));
                car.setColor(rs.getString("Color"));
                car.setNit_propietario(rs.getString("Nit_Propietario"));
                car.setNombre(rs.getString("Nombre"));
                car.setModelo(rs.getInt("Modelo"));
                list.add(car);
                
            }
        }
        catch (Exception e) {
            
            System.err.println("Fallo" +e);
        }
        System.out.println(list);
        return list;
    }

    @Override
    public Vehiculo list(int id) {
        String sql="SELECT * FROM  vehiculos where chasis="+id;
        try {
            con=dbc.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                car.setChasis(rs.getInt("Chasis"));
                car.setPlaca(rs.getString("Placa"));
                car.setColor(rs.getString("Color"));
                car.setNit_propietario(rs.getString("Nit_Propietario"));
                car.setNombre(rs.getString("Nombre"));
                car.setModelo(rs.getInt("Modelo"));
            }
        }
        catch (Exception e) {
            
            System.err.println("Fallo" +e);
        }
        return car;
    }

    @Override
    public boolean add(Vehiculo car) {
        String sql ="INSERT INTO vehiculos (chasis, placa, color, nit_propietario, nombre, modelo) values ('"+car.getChasis()+" ',' "+car.getPlaca()+" ',' "+car.getColor()+" ',' "+car.getNit_propietario()+" ',' "+car.getNombre()+" ',' "+car.getModelo()+"')";
        try{
            con=dbc.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println(sql);
        }
        catch (Exception e){
            System.err.println("Fallo" +e);
        }
        return false;
    }

    @Override
    public boolean edit(Vehiculo car) {
         String sql ="UPDATE vehiculos SET  placa='"+car.getPlaca()+"' ,color='"+car.getColor()+"' ,nit_propietario='"+car.getNit_propietario()+"' ,nombre='"+car.getNombre()+"' ,modelo='"+car.getModelo()+"' WHERE chasis="+car.getChasis();
         try{
             con=dbc.getConnection();
             ps=con.prepareStatement(sql);
             ps.executeUpdate();
         }
         catch (Exception e) {
              System.err.println("Fallo" +e);
         }
          System.out.println(sql);
         return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from vehiculos where chasis="+id;
        try{
            con=dbc.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch (Exception e) {
            System.err.println("Fallo" +e);
        }
        return false;
    }
    
    
}
