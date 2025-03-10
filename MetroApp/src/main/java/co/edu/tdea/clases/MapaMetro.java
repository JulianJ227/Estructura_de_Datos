package co.edu.tdea.clases;

import java.util.*;

public class MapaMetro {
    private Map<String, Estacion> estaciones;
    private Map<Estacion, List<Estacion>> conexiones;

    public MapaMetro() {
        this.estaciones = new HashMap<>();
        this.conexiones = new HashMap<>();
    }

    public void agregarEstacion(Estacion estacion) {
        estaciones.put(estacion.getNombre(), estacion);
        conexiones.putIfAbsent(estacion, new ArrayList<>());
    }

    public void agregarConexion(Estacion origen, Estacion destino) {
        conexiones.get(origen).add(destino);
        conexiones.get(destino).add(origen); 
    }

    public List<Estacion> getConexiones(Estacion estacion) {
        return conexiones.get(estacion);
    }
    
   
    public List<Estacion> encontrarRutaMasCorta(String inicio, String destino) {
        Estacion estacionInicio = estaciones.get(inicio);
        Estacion estacionDestino = estaciones.get(destino);

        if (estacionInicio == null || estacionDestino == null) {
            System.out.println("Una de las estaciones no existe.");
            return Collections.emptyList();
        }

        // Cola para el BFS
        Queue<List<Estacion>> cola = new LinkedList<>();
        Set<Estacion> visitados = new HashSet<>();

        // Inicializamos la cola con la estación de inicio
        cola.add(Collections.singletonList(estacionInicio));
        visitados.add(estacionInicio);

        while (!cola.isEmpty()) {
            List<Estacion> rutaActual = cola.poll();
            Estacion ultimaEstacion = rutaActual.get(rutaActual.size() - 1);

            // Si llegamos a la estación destino, devolvemos la ruta
            if (ultimaEstacion.equals(estacionDestino)) {
                return rutaActual;
            }

            // Expandimos a las estaciones conectadas
            for (Estacion vecino : conexiones.get(ultimaEstacion)) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    
                    // Nueva ruta extendida con la estación vecina
                    List<Estacion> nuevaRuta = new ArrayList<>(rutaActual);
                    nuevaRuta.add(vecino);
                    cola.add(nuevaRuta);
                }
            }
        }

        // Si no se encuentra una ruta
        System.out.println("No hay una ruta entre las estaciones.");
        return Collections.emptyList();
    }

    
   
}
