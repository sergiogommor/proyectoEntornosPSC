package AlquilerBicicletas;

public class ReporteAveria {

    private Bicicleta bicicleta;
    private String descripcion;

    public ReporteAveria(Bicicleta bicicleta, String descripcion) {

        this.bicicleta = bicicleta;
        this.descripcion = descripcion;
    }

    // REPORTAR AVERIA (user)
    public void reportar() {

        bicicleta.setEstado("Averiada");  //actualiza estado a averiada

        System.out.println("Avería registrada");
        System.out.println(descripcion);
    }
}
