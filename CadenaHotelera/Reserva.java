package CadenaHotelera;

import java.util.*;

public class Reserva {

	private int id;
	private Date fechaInicio;
	private Date fechaFin;
	private String estado;
	private double totalReserva;
	private Cliente cliente;
	private Habitacion habitacion;
	private List<ServicioAdicional> servicios = new ArrayList<>();
	
	public void confirmar() {
		estado = "Confirmada";
	}//confirmar
	
	public void cancelar() {
		estado = "Cancelada";
		habitacion.setDisponible(true);
	}//cancelar
	
	public double calcularTotal() {
		long dias = (fechaFin.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24);
		totalReserva = dias * habitacion.getPrecio();
		
		for (ServicioAdicional s : servicios) {
			totalReserva += s.getPrecio();
		}//for
		
		return totalReserva;
	}//calcularTotal
	
	public void anadirServicio(ServicioAdicional servicio) {
		servicios.add(servicio);
	}//anadirServicio

	public List<ServicioAdicional> getServicios() {
		return servicios;
	}

	// ========== Getters y setters ==========
	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
	
}//class
