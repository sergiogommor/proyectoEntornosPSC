package AlquilerBicicletas;
import java.util.ArrayList;

public class Administrador {

    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private int telefono;
    private ArrayList<String> historialReportes;

    public Administrador(String nombre, String apellido, String dni, String correo, int telefono) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        historialReportes = new ArrayList<>();
    }

    // AÑADIR ESTACION (admin)
    public void añadirEstacion(ArrayList<Estacion> estaciones, Estacion estacion) {

        estaciones.add(estacion);
        System.out.println("Estación añadida correctamente");
    }

    // ELIMINAR ESTACION (admin)
    public void eliminarEstacion(ArrayList<Estacion> estaciones, Estacion estacion) {

        estaciones.remove(estacion);
        System.out.println("Estación eliminada");
    }

    // REGISTRAR BICICLETA (admin)
    public void registrarBicicleta(Estacion estacion, Bicicleta bicicleta) {

        estacion.agregarBicicleta(bicicleta);
        System.out.println("Bicicleta registrada");
    }

    // RETIRAR BICICLETA AVERIADA (admin)
    public void retirarBicicleta(Bicicleta bicicleta) {

        bicicleta.setEstado("Averiada");
        System.out.println("Bicicleta retirada");
    }
}
