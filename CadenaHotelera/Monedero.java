package CadenaHotelera;

public class Monedero {
	
	private double saldoMonedero;
	private int puntos;
	
	public void acumularPuntos(int p) {
		puntos += p;
	}//acumularPuntos
	
	public boolean canjearPuntos(int p) {
		boolean canjearDisponible = false;
		
		if (puntos >= p) {
			puntos -= p;
			canjearDisponible = true;
		}//if
		
		return canjearDisponible;
	}//canjearPuntos
	
	public int consultarSaldo() {
		return puntos;
	}
}//class
