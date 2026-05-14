package CadenaHotelera;

import java.util.*;

public class Administrador extends Usuario{
	
	private int nivelAcceso;

	public Administrador(int idUsuario, String nombre, String email, String password, String telefono,
			int nivelAcceso) {
		super(idUsuario, nombre, email, password, telefono);
		this.nivelAcceso = nivelAcceso;
	}//constructor
	
	public void gestionarHabitaciones(List<Habitacion> habitaciones) {
		System.out.println("Total habitaciones: " + habitaciones.size());
	}//gestionarHabitaciones
	
	public void actualizarPrecios(List<Habitacion> habitaciones, double incremento) {
		for (Habitacion h : habitaciones) {
			h.actualizarPrecio(h.getPrecio() + incremento);
		}//for
	}//actualizarPrecios
	
	public List<Reserva> consultarReservas(List<Reserva> reservas){
		return reservas;
	}//consultarReservas
	
	public void responderResenias (Resena r, String respuesta) {
		r.anadirRespuesta(respuesta);
	}
	
}//class
