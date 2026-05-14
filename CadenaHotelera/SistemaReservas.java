package CadenaHotelera;

import java.util.*;

public class SistemaReservas {
	
	private List<Reserva> reservas = new ArrayList<>();
	private List<Habitacion> habitaciones = new ArrayList<>();
	
	public boolean verificarDisponibilidad(Habitacion h) {
		return h.verificarDisponibilidad();
	}//verificarDisponibilidad
	
	public boolean procesarReserva(Reserva r) {
		boolean rProcesada = false;
		
		if (r != null) {
			r.confirmar();
			reservas.add(r);
			rProcesada = true;
		}//if
		
		return rProcesada;
	}//procesarReserva
	
	public double calcularImporte(Reserva r) {
		return r.calcularTotal();
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
}//class
