package co.edu.tdea.clases;


import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String nombre; 
    private String linea;  
    private List<Estacion> conexiones; 

    
    public Estacion(String nombre, String linea) {
        this.nombre = nombre;
        this.linea = linea;
        this.conexiones = new ArrayList<>(); 
    }

    public void agregarConexion(Estacion estacion) {
        conexiones.add(estacion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getLinea() {
        return linea;
    }

    public List<Estacion> getConexiones() {
        return conexiones;
    }

}
