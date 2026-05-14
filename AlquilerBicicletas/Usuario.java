package AlquilerBicicletas;
import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private int telefono;
    private double saldo;
    private ArrayList<Alquiler> historialAlquileres;
    private ArrayList<Estacion> estacionesFavoritas;

    public Usuario(String nombre, String apellido, String dni, String correo, int telefono) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.saldo = 0;
        historialAlquileres = new ArrayList<>();
        estacionesFavoritas = new ArrayList<>();
    }

    // CONSULTAR SALDO (user)
    public void consultarSaldo() {
    	
        System.out.println("Saldo disponible: " + saldo + " euros");
    }

    // RECARGAR SALDO (user)
    public void recargarSaldo(double cantidad) {
    	
        saldo += cantidad;
        
        System.out.println("Saldo recargado correctamente");
    }

    // MARCAR ESTACION FAVORITA (user)
    public void marcarFavorita(Estacion estacion) {

        if(estacionesFavoritas.contains(estacion)) {
        	
            System.out.println("La estación ya es favorita");
        } 
        else {
            estacionesFavoritas.add(estacion);
            
            System.out.println("Estación añadida a favoritas");
        }
    }

    // VER HISTORIAL (user)
    public void verHistorial() {

        if(historialAlquileres.isEmpty()) {
        	
            System.out.println("No existen alquileres");
        } 
        else {
            for(Alquiler a : historialAlquileres) {
            	
                System.out.println(a);
            }
        }
    }

    // AÑADIR ALQUILER 
    public void agregarAlquiler(Alquiler alquiler) {
    	
        historialAlquileres.add(alquiler);
    }

    //GET SALDO
    public double getSaldo() {
    	
        return saldo;
    }

    //DESCONTAR SALDO
    public void descontarSaldo(double cantidad) {
    	
        saldo -= cantidad;
    }

    //GET NOMBRE
    public String getNombre() {
    	
        return nombre;
    }
}
