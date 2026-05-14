package CadenaHotelera;

public class Pago {

	private int id;
	private double aPagar;
	private String estado;
	private String metodo;
	
	public boolean procesarPago() {
		boolean pagoProcesado = false;
		
		if (aPagar > 0) {
			estado = "Procesado";
			pagoProcesado = true;
		}//if
		
		return pagoProcesado;
	}//procesarPago
	
	public boolean validarPago() {
		return estado != null && estado.equals("Procesado");
	}

	public double getaPagar() {
		return aPagar;
	}

	public void setaPagar(double aPagar) {
		this.aPagar = aPagar;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	
	
	
}//class
