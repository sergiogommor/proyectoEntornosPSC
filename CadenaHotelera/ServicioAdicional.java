package CadenaHotelera;
public enum ServicioAdicional {

    DESAYUNO("Desayuno buffet incluido", 12.50),
    PARKING("Plaza de parking privada", 15.00),
    WIFI_PREMIUM("Conexión WiFi premium de alta velocidad", 5.99),
    TRASLADO_AEROPUERTO("Traslado al aeropuerto", 40.00);
    

    private final String descripcion;
    private final double precio;

    ServicioAdicional(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return name() + " - " + descripcion + " (" + precio + " €)";
    }
}