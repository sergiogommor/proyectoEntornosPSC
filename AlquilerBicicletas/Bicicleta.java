package AlquilerBicicletas;

public class Bicicleta {

    private int id;
    private String estado;  //saber si esta disponible, alquilada o averiada

    public Bicicleta(int id) {
    	
        this.id = id;
        this.estado = "Disponible";
    }

    // GETTERS Y SETTERS
    public int getId() {
    	
        return id;
    }

    public String getEstado() { 
    	
        return estado;  //nos da el estado actual de la bicicleta
    }

    public void setEstado(String estado) {
    	
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bicicleta " + id + " - " + estado;
    }
}