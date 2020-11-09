
package Interfaces;

import Modelo.Vehiculo;
import java.util.List;


public interface CRUD {
    public List listar();
    public Vehiculo list(int Chasis);
    public boolean add(Vehiculo car);
    public boolean edit(Vehiculo car);
    public boolean delete(int id);
    
}
