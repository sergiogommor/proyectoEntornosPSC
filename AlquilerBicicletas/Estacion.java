package AlquilerBicicletas;

import java.util.ArrayList;

public class Estacion {

    private String ubicacion;
    private int capacidad;
    private ArrayList<Bicicleta> bicicletas;

    public Estacion(String ubicacion, int capacidad) {

        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        bicicletas = new ArrayList<>();
    }

    // AGREGAR BICICLETA 
    public void agregarBicicleta(Bicicleta bici) {

        if(bicicletas.size() < capacidad) { //saber si hay espacio en la estacion

            bicicletas.add(bici);  //si hay espacio
            System.out.println("Bicicleta añadida");
        } 
        else { //si no hay espacio
            System.out.println("La estación está llena");
        }
    }

    // MOSTRAR BICICLETAS
    public void mostrarBicicletas() {

        for(Bicicleta b : bicicletas) {
        	
            System.out.println(b);
        }
    }

    // OBTENER BICICLETA DISPONIBLE
    public Bicicleta obtenerBicicletaDisponible() {

        for(Bicicleta b : bicicletas) {

            if(b.getEstado().equals("Disponible")) {
                return b;
            } //if
        } //for
        return null;  //si no hay disponibles
    }

    public String getUbicacion() {
    	
        return ubicacion;
    }
}
