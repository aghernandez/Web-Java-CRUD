
package config;

import java.sql.Connection;
import java.sql.DriverManager;



public class bdConexion {
    Connection con;
    public bdConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_db","root", "");
        }
        catch (Exception e){
            System.err.println("Error" +e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
