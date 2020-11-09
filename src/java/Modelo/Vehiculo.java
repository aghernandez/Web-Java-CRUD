
package Modelo;


public class Vehiculo {
    int chasis;
    String placa;
    String color;
    String nit_propietario;
    String nombre;
    int modelo;

    public Vehiculo(int chasis) {
        this.chasis = chasis;
    }

    public Vehiculo(String placa, String color, String nit_propietario, String nombre, int modelo) {
        this.placa = placa;
        this.color = color;
        this.nit_propietario = nit_propietario;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public Vehiculo() {
    
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNit_propietario() {
        return nit_propietario;
    }

    public void setNit_propietario(String nit_propietario) {
        this.nit_propietario = nit_propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
}
