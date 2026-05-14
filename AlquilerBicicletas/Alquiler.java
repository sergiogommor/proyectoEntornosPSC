package AlquilerBicicletas;

public class Alquiler {

    private Usuario usuario;
    private Bicicleta bicicleta;
    private String origen;
    private String destino;
    private double precio;

    public Alquiler(Usuario usuario, Bicicleta bicicleta, String origen, String destino, double precio) {

        this.usuario = usuario;
        this.bicicleta = bicicleta;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    // FINALIZAR ALQUILER 
    public void finalizarAlquiler() {

        bicicleta.setEstado("Disponible"); //actualiza el estado a disponible

        usuario.descontarSaldo(precio);

        System.out.println("Alquiler finalizado");
        System.out.println("Coste: " + precio + " euros");
    }

    @Override
    public String toString() {

        return "Origen: " + origen + " Destino: " + destino + " Precio: " + precio;
    }
}
