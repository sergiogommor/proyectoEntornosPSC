package CadenaHotelera;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{

	private String datosPersonales;
	private Monedero monedero;
	private List<Reserva> reservas = new ArrayList<>();

	public Cliente(int idUsuario, String nombre, String email, String password, String telefono, String datosPersonales) {
		super(idUsuario, nombre, email, password, telefono);
		this.datosPersonales = datosPersonales;
	}//constructor
	
	public List<Habitacion> consultarHabitacion(List<Habitacion> habitaciones) {
		List<Habitacion> disponibles = new ArrayList<>();
		for(Habitacion h : habitaciones) {
			if (h.verificarDisponibilidad()) {
				disponibles.add(h);
			}//if
		}//for
		
		return disponibles;
		
	}//consultarHabitacion
	
	public Reserva hacerReserva(Habitacion h) {
		Reserva r = new Reserva();
		r.setCliente(this);
		r.setHabitacion(h);
		reservas.add(r);
		h.setDisponible(false);
		return r;
	}//hacerReserva
	
	public List<Reserva> consultarReservas(){
		return reservas;
	}//consultarReservas
	
	public boolean canjearPuntos(int puntos) {
		return monedero.canjearPuntos(puntos);
	}//canjearPuntos
	
	public void setMonedero(Monedero monedero) {
		this.monedero = monedero;
	}
	
	public Monedero getMonedero() {
		return monedero;
	}
	
}
