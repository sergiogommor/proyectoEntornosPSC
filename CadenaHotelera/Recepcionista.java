package CadenaHotelera;

public class Recepcionista {

	private String turno;
	
	public void registrarCheckIn(Reserva r) {
		r.setEstado("Check-in");
		r.getHabitacion().setDisponible(false);
	}//registrarCheckIn
	
	public void registrarCheckOut(Reserva r) {
		r.setEstado("Check-out");
		System.out.println("El total es" + r.calcularTotal());
		r.getHabitacion().setDisponible(true);
	}//registrarCheckOut
	
}//class
