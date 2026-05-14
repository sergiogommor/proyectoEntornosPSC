package CadenaHotelera;

public class Habitacion {
	
	private int numero;
	private String tipo;
	private double precio;
	private boolean disponible;
	
	public boolean verificarDisponibilidad() {
		return disponible;
	}//verificarDisponibilidad
	
	public void actualizarPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}//actualizarPrecio
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}//setDisponible
	
	public double getPrecio() {
		return precio;
	}//getPrecio

	public boolean isDisponible() {
		return disponible;
	}
	
	
	
}//class
